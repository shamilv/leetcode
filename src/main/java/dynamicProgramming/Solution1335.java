package dynamicProgramming;

import java.util.Arrays;

public class Solution1335 {
    private int[][] memo;
    private int[] jobDifficulty;
    private int[] jobRemaining;
    private int n;
    private int d;
    
    public int minDifficultyTopDown(int[] jobDifficulty, int d) {
        this.n = jobDifficulty.length;
        if (n < d) return -1;
        
        this.jobDifficulty = jobDifficulty;
        this.d = d;
        
        jobRemaining = new int[n];
        int hardestJob = jobDifficulty[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            hardestJob = Math.max(hardestJob, jobDifficulty[i]);
            jobRemaining[i] = hardestJob;
        }
        
        memo = new int[n][d+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        
        return dp(0, 1);
        
    }
    
    private int dp(int i, int day) {
        if (day == d) return jobRemaining[i];
        
        if (memo[i][day] != -1) return memo[i][day];
        
        int hardest = jobDifficulty[i], best = Integer.MAX_VALUE;
        for (int k = i; k < n - (d - day); k++) {
            hardest = Math.max(hardest, jobDifficulty[k]);
            int local = dp(k + 1, day + 1);
            if (local != -1) {
                best = Math.min(best, hardest + local);
            }
        }
        memo[i][day] = best;
        return memo[i][day];
    }
}
