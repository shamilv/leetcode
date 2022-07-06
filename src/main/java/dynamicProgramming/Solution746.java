package dynamicProgramming;

public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int p2 = cost[0];
        int p1 = cost[1];
        for (int i = 2; i < n; i++) {
            int tmp = Math.min(p2, p1) + cost[i];
            p2 = p1;
            p1 = tmp;
        }
        return Math.min(p2, p1);
    }
}
