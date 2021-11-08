import java.util.Arrays;

public class Solution1824 {

    public int minSideJumps(int[] obstacles) {
        System.out.println(1 % 3);
        System.out.println(2 % 3);
        System.out.println(3 % 3);
        int N = obstacles.length;
        int[][] dp = new int[N][3];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -100);
            if (obstacles[i] > 0) {
                dp[i][obstacles[i] - 1] = -1;
            }
        }
        dp[0][1] = 0;
        for (int i = 0; i < N - 1; i++) {
            if (dp[i][0] >= 0) {
                dp[i + 1][0] = dp[i + 1][0] == -1 ? -1 : dp[i][0];
                stepRight(dp, i, 0, 1);
                stepRight(dp, i, 0, 2);
            }
            if (dp[i][1] >= 0) {
                dp[i + 1][1] = dp[i + 1][1] == -1 ? -1 : dp[i][1];
                stepLeft(dp, i, 1, 1);
                stepRight(dp, i, 1, 1);
            }
            if (dp[i][2] >= 0) {
                dp[i + 1][2] = dp[i + 1][2] == -1 ? -1 : dp[i][2];
                stepLeft(dp, i, 2, 1);
                stepLeft(dp, i, 2, 2);
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < 3; j++) {
            if (dp[N-1][j] >= 0) {
                ans = Math.min(ans, dp[N-1][j]);
            }
        }
        return ans;
    }

    public int minSideJumps2(int[] obstacles) {
        int N = obstacles.length;
        int[][] dp = new int[N][3];
        dp[0][0] = 1; dp[0][1] = 0; dp[0][2] = 1;
        for (int i = 0; i < N - 1; i++) {
            int obs = obstacles[i];
            if (obs > 0) {
                dp[i][obs - 1] = 1000000;
            }
            for (int j = 0; j < 3; j++) {
                if (j != obs - 1) {
                    dp[i][j] = Math.min(dp[i][j], Math.min(dp[i][(j + 1) % 3], dp[i][(j + 2) % 3]) + 1);
                }
            }
            dp[i + 1] = dp[i];
        }
        return Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2]));
    }

    public int minSideJumps3(int[] obstacles) {
        int N = obstacles.length;
        int[] dp = new int[3];
        dp[0] = 1; dp[1] = 0; dp[2] = 1;
        for (int i = 0; i < N - 1; i++) {
            int obs = obstacles[i];
            if (obs > 0) {
                dp[obs - 1] = 1000000;
            }
            for (int j = 0; j < 3; j++) {
                if (j != obs - 1) {
                    dp[j] = Math.min(dp[j], Math.min(dp[(j + 1) % 3], dp[(j + 2) % 3]) + 1);
                }
            }
        }
        return Math.min(dp[0], Math.min(dp[1], dp[2]));
    }

    private void stepLeft(int[][] dp, int i, int j, int step) {
        if (dp[i][j] >= 0 && dp[i][j - step] != -1 && dp[i + 1][j - step] != -1) {
            dp[i + 1][j - step] = dp[i + 1][j - step] == -100 ?
                    dp[i][j] + 1 :
                    Math.min(dp[i + 1][j - step], dp[i][j] + 1);
        }
    }

    private void stepRight(int[][] dp, int i, int j, int step) {
        if (dp[i][j] >= 0 && dp[i][j + step] != -1 && dp[i + 1][j + step] != -1) {
            dp[i + 1][j + step] = dp[i + 1][j + step] == -100 ?
                    dp[i][j] + 1 :
                    Math.min(dp[i + 1][j + step], dp[i][j] + 1);
        }
    }
}
