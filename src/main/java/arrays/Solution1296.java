package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1296 {
    public boolean isPossibleDivide(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> d = new HashMap<>();
        for (int a: nums)
            d.put(a, d.getOrDefault(a, 0) + 1);

        for (int a: nums) {
            int f1 = d.get(a);
            if (f1 != 0) {
                for (int x = a+1; x < a + k; x++) {
                    int f2 = d.getOrDefault(x, 0);
                    if (f2 == 0)
                        return false;
                    d.put(x, f2 - 1);
                }
                d.put(a, f1 - 1);
            }
        }
        return true;
    }
}
