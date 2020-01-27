package sorting;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Solution406 {

    public int[][] reconstructQueue(int[][] people) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        for (int[] one: people)
            q.offer(one);
        LinkedList<int[]> ans = new LinkedList<>();
        while (!q.isEmpty()) {
            int[] a = q.poll();
            ans.add(a[1], a);
        }
        return ans.toArray(new int[][]{});
    }
}
