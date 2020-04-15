package algorithm.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class TarjanSccAlgoritm {
    private int id;
    private int[] ids;
    private int[] lowLinks;
    private boolean[] onStack;
    private Stack<Integer> s = new Stack<>();

    private final int UNVISITED = -1;

    public int[] stronglyConnectedComponents(LinkedList<Integer>[] g) {
        int n = g.length;
        lowLinks = new int[n];
        onStack = new boolean[n];
        ids = new int[n];
        Arrays.fill(ids, UNVISITED);
        for (int i = 0; i < n; i++) {
            if (ids[i] == UNVISITED) {
                dfs(g, i);
            }
        }
        return lowLinks;
    }

    private void dfs(LinkedList<Integer>[] g, int i) {
        onStack[i] = true;
        s.push(i);
        ids[i] = lowLinks[i] = id++;
        for (int j: g[i]) {
            if (ids[j] == UNVISITED) {
                dfs(g, j);
            }
            if (onStack[j]) {
                lowLinks[i] = Math.min(lowLinks[i], lowLinks[j]);
            }
        }
        if (ids[i] == lowLinks[i]) {
            for (int k = s.pop(); ; k = s.pop()) {
                onStack[k] = false;
                if (i == k) break;
            }
        }
    }
}
