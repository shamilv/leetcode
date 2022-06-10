package amazon;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Amazon1353 {
    public int maxEvents(int[][] events) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int ans = 0, i = 0;
        for (int day = 1; day <= 100_000; ++day) {
            while (!q.isEmpty() && q.peek() < day) {
                q.poll();
            }
            while (i < events.length && events[i][0] == day) {
                q.offer(events[i++][1]);
            }

            if (!q.isEmpty()) {
                q.poll();
                ++ans;
            }
        }
        return ans;
    }
}
