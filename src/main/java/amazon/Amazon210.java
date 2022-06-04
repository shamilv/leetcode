package amazon;

import java.util.*;

public class Amazon210 {
    private Map<Integer, List<Integer>> dict = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();
    private Set<Integer> currentPath = new HashSet<>();
    private List<Integer> stack = new ArrayList<>();
    private boolean canContinue = true;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for (int[] p: prerequisites) {
            dict.putIfAbsent(p[1], new ArrayList<>());
            dict.get(p[1]).add(p[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!visited.contains(i)) {
                dfs(i);
            }
        }

        if (stack.size() == 0 || !canContinue) {
            return new int[0];
        } else {
            int[] ans = new int[stack.size()];
            for (int i = 0; i < stack.size(); i++) {
                ans[i] = stack.get(stack.size() - 1 - i);
            }
            return ans;
        }
    }

    private void dfs(int course) {
        if (!canContinue) {
            return;
        }
        if (currentPath.contains(course)) {
            canContinue = false;
            return;
        }
        if (visited.contains(course)) {
            return;
        }
        visited.add(course);
        currentPath.add(course);

        if (dict.containsKey(course)) {
            for (int nextCourse: dict.get(course)) {
                dfs(nextCourse);
            }
        }
        if (canContinue) {
            stack.add(course);
        }
        currentPath.remove(course);
    }
}
