package arrays;

import java.util.HashMap;
import java.util.Map;

public class Solution659 {

    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> d = new HashMap<>();
        Map<Integer, Integer> f = new HashMap<>();
        for (int a: nums) {
            d.put(a, d.getOrDefault(a, 0) + 1);
        }

        for (int a: nums) {
            if (d.get(a) == 0)
                continue;
            else if (f.containsKey(a) && f.get(a) > 0) {
                f.put(a, f.get(a) - 1);
                f.put(a + 1, f.getOrDefault(a + 1, 0) + 1);
            } else if (d.containsKey(a+1) && d.get(a + 1) > 0 && d.containsKey(a+2) && d.get(a + 2) > 0) {
                d.put(a + 1, d.get(a + 1) - 1);
                d.put(a + 2, d.get(a + 2) - 1);
                f.put(a + 3, f.getOrDefault(a + 3, 0) + 1);
            } else
                return false;
            d.put(a, d.get(a) - 1);
        }
        return true;
    }
}
