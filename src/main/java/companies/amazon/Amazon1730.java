package companies.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class Amazon1730 {
    public int getFood(char[][] grid) {
        int si = -1, sj = -1;
        for (int i = 0; i < grid.length && si == -1; i++) {
            for (int j = 0; j < grid[i].length && sj == -1; j++) {
                if (grid[i][j] == '*') {
                    si = i;
                    sj = j;
                }
            }
        }

        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{si, sj, 0});
        while (!q.isEmpty()) {
            int[] next = q.poll();
            int cnt = next[2];
            for (int[] d: dir) {
                int row = next[0] + d[0];
                int col = next[1] + d[1];
                if (row < 0 || row == grid.length || col < 0 || col == grid[0].length || grid[row][col] == 'X') {
                    continue;
                }
                if (grid[row][col] == '#') {
                    return cnt + 1;
                }
                grid[row][col] = 'X';
                q.offer(new int[]{row, col, cnt + 1});
            }
        }
        return -1;
    }
}
