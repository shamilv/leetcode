package dfs;

public class Solution947 {

    public int removeStones(int[][] stones) {
        int[] v = new int[stones.length];
        int ans = 0;
        for (int i = 0; i < stones.length; i++) {
            if (v[i] == 1) continue;
            ans += helper(stones, i, v);
        }
        return ans;
    }

    private int helper(int[][] stones, int k, int[] v) {
        v[k] = 1;
        int ans = 0;
        for (int i = 0; i < stones.length; i++) {
            if (v[i] == 1) continue;
            if (stones[k][0] == stones[i][0] || stones[k][1] == stones[i][1])
                ans += helper(stones, i, v) + 1;
        }
        return ans;
    }
}
