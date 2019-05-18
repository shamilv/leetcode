package arrays;

import java.util.HashMap;
import java.util.Map;

public class Solution128 {
  public int longestConsecutive(int[] nums) {
    if (nums == null)
      return 0;

    Map<Integer, Integer> cntMap = new HashMap<>();
    int res = 0;
    for (int num: nums) {
      if (!cntMap.containsKey(num)) {
        int left = cntMap.getOrDefault(num - 1, 0);
        int right = cntMap.getOrDefault(num + 1, 0);
        int sum = left + right + 1;
        cntMap.put(num, sum);
        cntMap.put(num - left, sum);
        cntMap.put(num + right, sum);

        res = Math.max(res, sum);
      }
    }
    return res;
  }
}
