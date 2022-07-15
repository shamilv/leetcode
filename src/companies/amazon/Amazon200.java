package amazon;

public class Amazon200 {

    public int numIslands(char[][] grid) {
        int N = grid.length;
        int M = grid[0].length;
        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == '1') {
                    visitIsland(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void visitIsland(char[][] grid, int i, int j) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';

        visitIsland(grid, i, j + 1);
        visitIsland(grid, i + 1, j);
        visitIsland(grid, i - 1, j);
        visitIsland(grid, i, j - 1);
    }

}
