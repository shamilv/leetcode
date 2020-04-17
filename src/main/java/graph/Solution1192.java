package graph;

import java.util.*;

public class Solution1192 {

    private int id = 0;
    private int ids[];
    private int lowLinks[];
    private int UNVISITED = -1;
    private List<Integer>[] g;
    private List<List<Integer>> bridges = new LinkedList<>();

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ids = new int[n];
        Arrays.fill(ids, UNVISITED);
        lowLinks = new int[n];
        g = new LinkedList[n];
        for (List<Integer> conn: connections) {
            if (g[conn.get(0)] == null)
                g[conn.get(0)] = new LinkedList<>();
            g[conn.get(0)].add(conn.get(1));
            if (g[conn.get(1)] == null)
                g[conn.get(1)] = new LinkedList<>();
            g[conn.get(1)].add(conn.get(0));
        }
        for (int i = 0; i < g.length; i++) {
            if (ids[i] == UNVISITED)
                dfs(i, -1);
        }
        return bridges;
    }

    private void dfs(int current, int parent) {
        ids[current] = lowLinks[current] = id++;
        for (int next: g[current]) {
            if (next == parent) continue;
            if (ids[next] == UNVISITED) {
                dfs(next, current);
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
