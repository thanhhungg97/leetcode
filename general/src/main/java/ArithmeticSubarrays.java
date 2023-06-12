import org.example.PerformTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>(l.length);
        for (int i = 0; i < l.length; i++) {
            int[] subArray = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            result.add(canMakeArithmeticProgression(subArray));
        }
        return result;
    }


    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            int tmp = arr[i] - arr[i - 1];
            if (diff != tmp) {
                return false;
            }
        }
        return true;
    }


}
