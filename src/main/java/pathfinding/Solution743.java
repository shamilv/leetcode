package pathfinding;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution743 {

    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, Map<Integer, Integer>> adj = new HashMap<>();
        for (int[] time: times) {
            adj.computeIfAbsent(time[0], (a) -> new HashMap<>());
            adj.get(time[0]).put(time[1], time[2]);
        }

        boolean[] visited = new boolean[N+1];
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt((a) -> a[0]));
        q.add(new int[]{0, K});

        int res = 0;
        while (!q.isEmpty()) {
            int[] pair = q.poll();
            int dVertexU = pair[0];
            int vertexU = pair[1];
            if (visited[vertexU]) continue;
            visited[vertexU] = true;
            res = dVertexU;
            N--;
            if (adj.containsKey(vertexU)) {
                for (int vertexV : adj.get(vertexU).keySet()) {
                    q.add(new int[]{dVertexU + adj.get(vertexU).get(vertexV), vertexV});
                }
            }

        }

        return N == 0 ? res : -1;
    }

}
