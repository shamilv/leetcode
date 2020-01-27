package arrays;

import java.util.PriorityQueue;

public class Solution1167 {

    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int a: sticks)
            q.offer(a);
        int cost = 0;
        while (!q.isEmpty()) {
            Integer s1 = q.poll();
            Integer s2 = q.poll();
            if (s2 == null)
                break;
            cost += (s1 + s2);
            q.offer(s1 + s2);
        }
        return cost;
    }
}
