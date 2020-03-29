package algorithm.graph;

import java.util.*;

public class DijkstraAlgorithm {

    private static class Pair {
        private int v;
        private int weight;
        Pair(int v, int weight) {
            this.v = v;
            this.weight = weight;
        }

        public int getV() {
            return v;
        }

        public int getWeight() {
            return weight;
        }
    }

    public Map<Integer, Integer> findSingleSourceShortestPath(int[][] A, int k) {
        Map<Integer, LinkedList<Pair>> adj = new HashMap<>();
        Map<Integer, Integer> ans = new HashMap<>();
        for (int[] a: A) {
            LinkedList<Pair> list = adj.get(a[0]);
            if (list == null)
                list = new LinkedList<>();
            list.add(new Pair(a[1], a[2]));
            adj.put(a[0], list);
        }
        PriorityQueue<Pair> q = new PriorityQueue<>(Comparator.comparingInt(Pair::getWeight));
        for (Pair p: adj.get(k)) {
            ans.put(p.v, p.weight);
            q.add(p);
        }

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int w = ans.getOrDefault(p.v, 0);
            LinkedList<Pair> pairs = adj.get(p.v);
            if (pairs != null) {
                for (Pair next: pairs) {
                    int n = ans.getOrDefault(next.v, w + next.weight);
                    ans.put(next.v, Math.min(n, w + next.weight));
                    q.add(next);
                }
            }
        }

        return ans;
    }

}
