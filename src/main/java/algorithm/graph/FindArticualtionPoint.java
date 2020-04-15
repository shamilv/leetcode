package algorithm.graph;

import java.util.LinkedList;
import java.util.Stack;

public class FindArticualtionPoint {

    private int[] lowLinks;
    private boolean[] visited;
    private boolean[] onStack;
    private Stack<Integer> s = new Stack<>();
    private boolean[] isArt;

    public boolean[] findArticulationPoints(LinkedList<Integer>[] g) {
        lowLinks = new int[g.length];
        visited = new boolean[g.length];
        onStack = new boolean[g.length];
        isArt = new boolean[g.length];
        for (int i = 0; i < g.length; i++) {
            if (visited[i]) continue;
            dfs(g, i);
        }
        return isArt;
    }

    private void dfs(LinkedList<Integer>[] g, int i) {
        visited[i] = true;
        s.push(i);
        onStack[i] = true;
        lowLinks[i] = i;
        for (int j: g[i]) {
            if (visited[j]) continue;
            dfs(g, j);
            lowLinks[i] = Math.min(lowLinks[i], lowLinks[j]);
            if (lowLinks[i] < lowLinks[j]) {
                isArt[i] = true;
            }
        }
    }
}
