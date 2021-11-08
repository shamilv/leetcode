import java.util.Arrays;

/*
Algorithm: Dynamic programming
Time complexity:
Space complexity:
Comments:  with memorization
Solution: mine
 */

public class Solution1335 {

    public int minDifficulty(int[] jobDifficulty, int d) {
        if (jobDifficulty.length < d) return -1;
        int[][] memo = new int[d + 2][jobDifficulty.length + 2];
        for (int i = 0; i < d + 2; i++)
            Arrays.fill(memo[i], -1);
        return calcDifficulty(jobDifficulty, 1, 0, d, memo);
    }

    private int calcDifficulty(int[] jd, int day, int i, int d, int[][] memo) {
        if (day > d && i < jd.length) return -1;
        if (day > d && i == jd.length) return 0;
        int daymax = -1; int min = Integer.MAX_VALUE;
        for (; i < jd.length; i++) {
            daymax = Math.max(daymax, jd[i]);
            int tmp = memo[day + 1][i + 1];
            if (tmp == -1) {
                tmp = calcDifficulty(jd, day + 1, i + 1, d, memo);
                memo[day + 1][i + 1] = tmp;
            }
            if (tmp != -1 && tmp != Integer.MAX_VALUE) {
                min = Math.min(min, daymax + tmp);
            }
        }
        return min;
    }

}
