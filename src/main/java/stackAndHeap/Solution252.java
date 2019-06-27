package stackAndHeap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution252 {
    public boolean canAttendMeetings(int[][] intervals) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < intervals.length; i ++) {
            for (int j = 0; j < intervals[i].length; j++) {
                queue.offer(intervals[i][j]);
            }
        }
        for (int i = 0; i < intervals.length; i ++) {
            for (int j = 0; j < intervals[i].length; j++) {
                if (intervals[i][j] != queue.poll())
                    return false;
            }
        }
        return true;
    }
}
