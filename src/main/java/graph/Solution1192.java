package graph;

import java.util.*;

public class Solution1192 {
    private int cnt = 0;
    public List<List<Integer>> crit(int n, List<List<Integer>> connections) {
        LinkedList<Integer>[] adj = new LinkedList[n];
        for (List<Integer> conn: connections) {
            if (adj[conn.get(0)] == null)
                adj[conn.get(0)] = new LinkedList<>();
            adj[conn.get(0)].add(conn.get(1));
            if (adj[conn.get(1)] == null)
                adj[conn.get(1)] = new LinkedList<>();
            adj[conn.get(1)].add(conn.get(0));
        }
        Map<Integer, int[]> visited = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        dfs(0, 0, adj, visited, s);
        Map<Integer, LinkedList<Integer>> tmp = new HashMap<>();
        for (int key: visited.keySet()) {
            int gr = visited.get(key)[1];
            tmp.computeIfAbsent(gr, (k) -> new LinkedList<>());
            tmp.get(gr).add(key);
        }
        LinkedList<List<Integer>> ans = new LinkedList<>();
        for (int gr: tmp.keySet()) {
            if (tmp.get(gr).size() == 1) {
                LinkedList<Integer> p = new LinkedList<>();
                int v = tmp.get(gr).getFirst();
                int u = adj[v].getFirst();
                p.add(v);
                p.add(u);
                ans.add(p);
            }
        }
        return ans;
    }

    private int dfs(int i, int root, LinkedList<Integer>[] adj, Map<Integer, int[]> visited, Stack<Integer> s) {
        if (visited.containsKey(i))
            return visited.get(i)[1];
        s.add(i);
        visited.put(i, new int[]{cnt, cnt++, 1});
        for (int n: adj[i]) {
            if (n == root) continue;
            int gr = dfs(n, i, adj, visited, s);
            if (visited.get(n)[2] == 1) {
                visited.get(i)[1] = Math.min(visited.get(i)[1], gr);
            }
        }
        if (visited.get(i)[0] == visited.get(i)[1]) {
            int p = s.pop();
            while (!s.isEmpty() && p != i) {
                visited.get(p)[2] = 0;
                p = s.pop();
            }
            visited.get(i)[2] = 0;
        }
        return visited.get(i)[1];
    }
}
