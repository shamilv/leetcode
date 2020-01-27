package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution253 {

    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int[] o = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < intervals.length; i++) {
            o[i] = intervals[i][0];
            c[i] = intervals[i][1];
        }
        Arrays.sort(o);
        Arrays.sort(c);
        int i = 0, j = 0, cnt = 0, ans = 0;
        while (i < o.length) {
            if (o[i] < c[j]) {
                cnt++;
                ans = Math.max(ans, cnt);
                i++;
            } else {
                cnt--;
                j++;
            }
        }
        return ans;
    }

    public int minMeetingRooms2(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int cnt = 0, ans = 0;
        for (int[] arr: intervals) {
            Integer closed = q.peek();
            while (closed != null && closed <= arr[0]) {
                q.poll();
                closed = q.peek();
                cnt--;
            }
            q.offer(arr[1]);
            cnt++;
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
