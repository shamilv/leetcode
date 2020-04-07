package algorithm.graph;

import java.util.LinkedList;
import java.util.Stack;

public class TarjanSccAlgoritm {

    private int[] ids;
    private boolean[] visited;
    private boolean[] instack;
    Stack<Integer> s = new Stack<>();

    public int[] stronglyConnectedComponenets(LinkedList<Integer>[] g, int n) {
        ids = new int[n];
        visited = new boolean[n];
        instack = new boolean[n];
        for (int i = 0; i < n; i++) {
            dfs(g, i);
        }
        return ids;
    }

    private void dfs(LinkedList<Integer>[] g, int i) {
        if (visited[i]) return;
        visited[i] = true;
        ids[i] = i;
        instack[i] = true;
        s.push(i);
        for (int j: g[i]) {
            dfs(g, j);
            if (instack[j]) {
                ids[i] = Math.min(ids[i], ids[j]);
            }
        }
        if (i == ids[i]) {
            int k = i-1;
            while (k!=i) {
                k = s.pop();
                instack[k] = false;
            }
        }
    }
}
