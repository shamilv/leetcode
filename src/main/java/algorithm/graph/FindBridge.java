package algorithm.graph;

import java.util.*;

public class FindBridge {
    private int id;
    private int[] ids;
    private int[] lowLinks;
    private int UNVISITED = -1;

    public List<List<Integer>> findBridge(List<List<Integer>> g) {
        int n = g.size();
        ids = new int[n];
        Arrays.fill(ids, UNVISITED);
        lowLinks = new int[n];
        List<List<Integer>> bridges = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (ids[i] == UNVISITED) {
                dfs(g, i, -1, bridges);
            }
        }
        return bridges;
    }

    private void dfs(List<List<Integer>> g, int current, int parent, List<List<Integer>> bridges) {
        ids[current] = lowLinks[current] = id++;
        for (int next: g.get(current)) {
            if (next == parent) continue;
            if (ids[next] == UNVISITED) {
                dfs(g, next, current, bridges);
                lowLinks[current] = Math.min(lowLinks[current], lowLinks[next]);
                if (lowLinks[current] < lowLinks[next]) {
                    List<Integer> pair = new LinkedList<>();
                    pair.add(current);
                    pair.add(next);
                    bridges.add(pair);
                }
            } else {
                lowLinks[current] = Math.min(lowLinks[current], ids[next]);
            }
        }
    }
}
