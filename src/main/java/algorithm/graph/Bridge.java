package algorithm.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class Bridge {

    private Map<Integer, LinkedList<Integer>> b = new HashMap<>();
    private int[] ids;
    private boolean[] vis;
    private boolean[] onStack;
    private Stack<Integer> s = new Stack<>();

    public Map<Integer, LinkedList<Integer>> findBridge(LinkedList<Integer>[] g) {
        int n = g.length;
        ids = new int[n];
        vis = new boolean[n];
        onStack = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i]) continue;
            dfs(g, i);
        }
        return b;
    }

    private void dfs(LinkedList<Integer>[] g, int i) {
        vis[i] = true;
        onStack[i] = true;
        s.push(i);
        ids[i] = i;
        for (int j: g[i]) {
            if (!vis[j]) {
                dfs(g, j);
            }
            if (onStack[j]) {
                ids[i] = Math.min(ids[i], ids[j]);
            }
            if (ids[i] < ids[j]) {
                b.computeIfAbsent(i, (key)-> new LinkedList<>());
                b.get(i).add(j);
            }
        }

        if (i == ids[i]) {
            int k = i-1;
            while (k != i) {
                k = s.pop();
                onStack[k] = false;
            }
        }
    }

}
