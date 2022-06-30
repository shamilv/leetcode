package _repeatHere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphTraversal {

    private LinkedList<Integer>[] adj;
    private int N;

    public GraphTraversal(int n) {
        this.N = n;
        this.adj = new LinkedList[N];
    }

    public void addEdge(int a, int b) {
        if (adj[a] == null) {
            adj[a] = new LinkedList<>();
        }
        adj[a].add(b);
    }

    public List<Integer> dfs() {
        List<Integer> path = new ArrayList<>();
        Set<Integer> isVisited = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (isVisited.contains(i)) continue;
            dfs(i, isVisited, path);
        }
        
        return path;
    }

    private void dfs(int node, Set<Integer> isVisited, List<Integer> path) {
        if (isVisited.contains(node)) return;
        isVisited.add(node);
        path.add(node);
        if (adj[node] != null) {
            for (int nextNode: adj[node]) {
                dfs(nextNode, isVisited, path);
            }
        }
    }

    public List<Integer> bfs() {
        List<Integer> path = new ArrayList<>();
        Set<Integer> isVisited = new HashSet<>();
        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (isVisited.contains(i)) continue;
            q.add(i);
            while(!q.isEmpty()) {
                int node = q.poll();
                if (isVisited.contains(node)) continue;
                isVisited.add(node);
                path.add(node);
                if (adj[node] != null) {
                    for (int next: adj[node]) {
                        q.add(next);
                    }
                }
            }
        }
        
        return path;
    }

}
