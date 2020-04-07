package algorithm.graph;

public class BellmanFord {

    public Integer[] bellmanFord(int[][] E, int n, int s) {
        Integer[] d = new Integer[n];
        d[s] = 0;
        int times = n;
        boolean relaxed = true;
        while (relaxed && times-- > 0) {
            for (int i = 0; i < E.length; i++) {
                relaxed = false;
                int u = E[i][0], v = E[i][1], uv = E[i][2];
                if (d[u] != null && (d[v] == null || d[u] + uv < d[v])) {
                    d[v] = d[u] + uv;
                    relaxed = true;
                }
            }
        }

        for (int i = 0; i < E.length && times == -1; i++) {
            int u = E[i][0], v = E[i][1], uv = E[i][2];
            if (d[u] != null && (d[v] == null || d[u] + uv < d[v])) {
                System.err.println("Cycle detected");
                return null;
            }
        }
        return d;
    }

}
