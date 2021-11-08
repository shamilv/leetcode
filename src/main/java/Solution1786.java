import java.util.*;

public class Solution1786 {

    private int[] d;
    private Integer[] memo;
    private List<int[]>[] map;

    public int countRestrictedPaths(int n, int[][] edges) {
        d = new int[n];
        memo = new Integer[n];
        map = new List[n + 1];
        for (int i = 0; i <= n; i++) map[i] = new ArrayList<>();
        Arrays.fill(d, Integer.MAX_VALUE);
        dijkstra(n, edges);
        return dfs(1, n);
    }

    private void dijkstra(int n, int[][] edges) {
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt((a) -> a[1]));
        Set<Integer> visited = new HashSet<>();
        for (int[] edge: edges) {
            map[edge[0]].add(new int[]{edge[1], edge[2]});
            map[edge[1]].add(new int[]{edge[0], edge[2]});
        }
        q.offer(new int[]{n, 0});
        d[n - 1] = 0;
        while (!q.isEmpty()) {
            int[] u = q.poll();
            if (!visited.contains(u[0])) {
                visited.add(u[0]);
                for (int[] v: map[u[0]]) {
                    if (u[1] + v[1] < d[v[0] - 1]) {
                        d[v[0] - 1] = u[1] + v[1];
                        q.offer(new int[]{v[0], d[v[0] - 1]});
                    }
                }
            }
        }
    }

    private int dfs(int u, int n) {
        if (memo[u - 1] != null) {
            return memo[u - 1];
        }
        if (u == n) return 1;
        int costU = d[u - 1], ans = 0;

        for (int[] v: map[u]) {
            int costV = d[v[0] - 1];
            if (costU > costV) {
                ans = (ans + dfs(v[0], n)) % 1000000007;
            }
        }
        memo[u - 1] = ans;
        return memo[u - 1];
    }
}
