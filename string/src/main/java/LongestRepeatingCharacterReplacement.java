import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        Map<Character, List<Integer>> map = new HashMap<>(
        );

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], new ArrayList<>());
            }
            map.get(chars[i]).add(i);
        }
        int max = 0;
        for (Map.Entry<Character, List<Integer>> characterListEntry : map.entrySet()) {
            List<Integer> itemValue = characterListEntry.getValue();
            int tmp = k;
            int curMax = 1;
            for (int i = 1; i < itemValue.size(); i++) {
                if (tmp > itemValue.get(i) - itemValue.get(i - 1) - 1) {
                    curMax += itemValue.get(i) - itemValue.get(i - 1);
                    tmp -= itemValue.get(i) - itemValue.get(i - 1) - 1;
                } else {
                    curMax += tmp;
                    break;
                }
            }
            if (tmp > s.length() - itemValue.get(itemValue.size() - 1) - 1) {
                curMax += tmp;
            }
            max = Math.max(max, curMax);
        }
        return max;
    }
}
