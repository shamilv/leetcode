package algorithm.graph;

import java.util.PriorityQueue;

public class Dijkstra {

    public Integer[] dijkstra(int[][] G, int s) {
        boolean[] visited = new boolean[G.length];
        Integer[] d = new Integer[G.length];
        d[s] = 0;
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        q.add(new int[]{s, d[s]});

        while (!q.isEmpty()) {
            int u = q.poll()[0];
            for (int v = 0; v < G[u].length; v++) {
                if (G[u][v] == -1 || visited[v]) continue;
                if (d[v] == null || (d[v] > d[u] + G[u][v])) {
                    d[v] = d[u] + G[u][v];
                    q.add(new int[]{v, d[v]});
                }
            }
            visited[u] = true;
        }
        return d;
    }
}
