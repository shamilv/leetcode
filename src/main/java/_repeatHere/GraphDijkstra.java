package _repeatHere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class GraphDijkstra {
    public Map<Integer, Integer> dijkstra(int[][] G, int s) {
        Map<Integer, Integer> ans = new HashMap<>();
        Map<Integer, List<int[]>> adj = new HashMap<>();
        Set<Integer> relaksed = new HashSet<>();
        for (int[] g: G) {
            adj.putIfAbsent(g[0], new ArrayList<>());
            adj.get(g[0]).add(new int[]{g[1], g[2]});
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        q.add(new int[]{s, 0});
        ans.put(s, 0);
        while (!q.isEmpty()) {
            int[] pair = q.poll();
            int v = pair[0];
            int costV = pair[1];
            if (relaksed.contains(v)) continue;
            relaksed.add(v);
            if (adj.containsKey(v)) {
                for (int[] next: adj.get(v)) {
                    int u = next[0];
                    int weightU = next[1];
                    int costU = Math.min(ans.getOrDefault(u, costV + weightU), costV + weightU);
                    q.add(new int[]{u, costU});
                    ans.put(u, costU);
                }
            }
        }
        return ans;
    }
}
