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
            if (dict.containsKey(prefix - k))
                cnt += dict.get(prefix - k);
            dict.merge(prefix, 1, Integer::sum);
        }
        return cnt;
    }
}
