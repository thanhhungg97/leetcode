import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    boolean isSatifies(int[] array) {
        Arrays.sort(array);
        Map<String, Boolean> mem = new HashMap<>();
        return helper(array, 0, array[array.length - 1], 0, mem);
    }

    boolean helper(int[] array, int i, int target, int current, Map<String, Boolean> mem) {
        String key = getKey(i, current);
        if (mem.containsKey(key)) {
            return mem.get(key);
        }
        if (current == target) {
            return true;
        }

        if (i == array.length - 1) {
            return false;
        }
        boolean result = helper(array, i + 1, target, current + array[i], mem) || helper(array, i + 1, target, current, mem);
        mem.put(key, result);
        return result;
    }

    private static String getKey(int i, int target) {
        return i + "," + target;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isSatifies(new int[]{3, 5, -1, 8, 12}));

        System.out.println(main.isSatifies(new int[]{5, 7, 16, 1, 2}));


        System.out.println("Hello world!");
    }
}

