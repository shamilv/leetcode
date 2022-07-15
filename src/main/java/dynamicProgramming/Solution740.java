package dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution740 {

    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> points = new HashMap<>();
        int maxNumber = nums[0];
        for (int n: nums) {
            points.put(n, points.getOrDefault(n, 0) + 1);
            maxNumber = Math.max(maxNumber, n);
        }
        int[] dp = new int[maxNumber + 1];
        dp[0] = 0;
        dp[1] = points.getOrDefault(1, 0) * 1;
        for (int i = 2; i <= maxNumber; i++) {
            int gain = points.getOrDefault(i, 0) * i;
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + gain);
        }
        return dp[maxNumber];
    }
    
    public int deleteAndEarnTopDown(int[] nums) {
        Map<Integer, Integer> points = new HashMap<>();
        int maxNumber = nums[0];
        for (int n: nums) {
            points.put(n, points.getOrDefault(n, 0) + 1);
            maxNumber = Math.max(maxNumber, n);
        }
        int[] memo = new int[maxNumber];
        Arrays.fill(memo, -1);
        return maxPoint(points, maxNumber, memo);
    }
    
    private int maxPoint(Map<Integer, Integer> points, int maxNumber, int[] memo) {
        if (maxNumber == 0) return 0;
        if (maxNumber == 1) return points.getOrDefault(maxNumber, 0);
        if (memo[maxNumber - 1] != -1) return memo[maxNumber - 1];
        int gain = points.getOrDefault(maxNumber, 0) * maxNumber;
        int localPoints = Math.max(maxPoint(points, maxNumber - 1, memo), maxPoint(points, maxNumber - 2, memo) + gain);
        memo[maxNumber - 1] = localPoints;
        return localPoints;
    }
}
