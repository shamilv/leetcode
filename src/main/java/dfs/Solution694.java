package dfs;

import java.util.HashSet;
import java.util.Set;

public class Solution694 {

    public int numDistinctIslands(int[][] grid) {
        Set<String> d = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 1) continue;
                StringBuilder buf = new StringBuilder();
                helper(grid, i, j, buf, "0");
                if (buf.length() > 0)
                    d.add(buf.toString());
            }
        }
        return d.size();
    }

    private void helper(int[][] grid, int i, int j, StringBuilder buf, String dir) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] != 1)
            return;
        buf.append(dir);
        grid[i][j] = 0;
        helper(grid, i - 1, j, buf, "1");
        helper(grid, i + 1, j, buf, "2");
        helper(grid, i, j - 1, buf, "3");
        helper(grid, i, j + 1, buf, "4");
        buf.append("b");
    }

}
