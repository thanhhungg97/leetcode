import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer integer = map.get(nums[i]);
                map.put(nums[i], integer + 1);
            } else {
                map.put(nums[i], 1);
            }

        }
        for (int i = 1; i < nums.length - 1; i++) {
            queue.add(nums[i - 1]);
            Integer integer = map.get(nums[i]);

            if (integer > 1) {
                map.put(nums[i], integer - 1);
            } else {
                map.remove(nums[i]);
            }
            map.remove(nums[i]);
            Integer t1 = queue.peek();
            int t2 = nums[i];
            Integer t3 = map.firstKey();
            if (t1 < t2 && t2 < t3) {
                return true;
            }
        }
        return false;
    }
}
