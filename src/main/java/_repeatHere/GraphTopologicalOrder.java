package _repeatHere;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphTopologicalOrder {
    private LinkedList<Integer> stack;
    private Set<Integer> visited;
    private Set<Integer> path;
    private Map<Integer, List<Integer>> adj;

    public List<Integer> topologicalSort(int[][] G) {
        stack = new LinkedList<>();
        visited = new HashSet<>();
        path = new HashSet<>();
        adj = new HashMap<>();
        
        for (int[] entry: G) {
            adj.putIfAbsent(entry[0], new ArrayList<>());
            adj.get(entry[0]).add(entry[1]);
        }
        Map<Integer, Integer> indegree = new HashMap<>();
        for (int node: adj.keySet()) {
            indegree.put(node, indegree.getOrDefault(node, 0) + 1);
        }
        
        for (int node: indegree.keySet()) {
            if (indegree.get(node) == 0) {
                stack.push(node);
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (visited.contains(node)) continue;
            ans.add(node);
            for (int next: adj.get(node)) {
                indegree.put(next, indegree.get(next) - 1);
                if (indegree.get(next) == 0) {
                    stack.push(next);
                }
            }
        }
        return ans;
    }

    /*private boolean dfs(int node) {
        if (visited.contains(node)) return true;
        visited.add(node);
        path.add(node);
        if (adj.containsKey(node)) {
            for (int next: adj.get(node)) {
                if (path.contains(next)) return false;
                if (!dfs(next)) {
                    return false;
                }
            }
        }
        ordered.addFirst(node);
        path.remove(node);
        return true;
    }

    private List<Integer> toResult() {
        List<Integer> ans = new ArrayList<>();
        while (!ordered.isEmpty()) {
            ans.add(ordered.pop());
        }
        return ans;
    } */
}
