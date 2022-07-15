package companies.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class Amazon994 {
    private int time = 0;
    private int[][] dirs = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j, 0});
                }
                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        while (!q.isEmpty()) {
            int[] a = q.poll();
            time = Math.max(time, a[2]);
            for (int[] d: dirs) {
                int i = a[0] + d[0];
                int j = a[1] + d[1];

                if (i >= 0 && i < grid.length && j >= 0 && j < grid[i].length && grid[i][j] == 1) {
                    freshCount--;
                    grid[i][j] = 2;
                    q.add(new int[]{i, j, a[2] + 1});
                }
            }
        }

        return freshCount > 0 ? -1 : time;
    }
}
