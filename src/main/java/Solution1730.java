import java.util.LinkedList;
import java.util.Queue;

public class Solution1730 {
    private final int[][] directions = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public int getFood(char[][] grid) {
        int m = 0, n = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '*') {
                    m = i; n = j;
                }
            }
        }
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{m, n, 0});
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[m][n] = true;
        while (!q.isEmpty()) {
            int[] c = q.poll();
            int x = c[0];
            int y = c[1];
            int d = c[2];
            if (grid[x][y] == '#') {
                return d;
            }
            for (int[] dir: directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (isValid(newX, newY, grid) && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    q.offer(new int[]{newX, newY, d + 1});
                }
            }
        }
        return -1;
    }

    private boolean isValid(int m, int n, char[][] grid) {
        return m >= 0 && m < grid.length && n >= 0 && n < grid[m].length && grid[m][n] != 'X';
    }
}
