package algorithm.graph;

import java.util.LinkedList;

public class TopologicalSort {

    public int[] topologicalSort(LinkedList<Integer>[] g) {
        int n = g.length, index = n - 1;
        int[] ans = new int[n];
        boolean[] v = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (v[i]) continue;
            index = dfs(g, i, ans, index, v);
        }
        return ans;
    }

    private int dfs(LinkedList<Integer>[] g, int i, int[] ans, int index, boolean[] v) {
        v[i] = true;
        for (int j: g[i]) {
            if (v[j]) continue;
            index = dfs(g, j, ans, index, v);
        }
        ans[index--] = i;
        return index;
    }

}
