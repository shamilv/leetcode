package arrays;

import java.util.HashMap;
import java.util.Map;

public class Solution560 {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> dict = new HashMap<>();
        dict.put(0, 1);
        int prefix = 0, cnt = 0;
        for (int a: nums) {
            prefix += a;
            cnt += dict.getOrDefault(prefix - k, 0);
            dict.put(prefix, dict.getOrDefault(prefix, 0) + 1);
        }
        return cnt;
    }
}
