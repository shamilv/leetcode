package amazon;

import java.util.Arrays;
import java.util.Stack;

public class Amazon253 {
    //[1, 2], [3, 4]
    //[1, 3], [3, 4] -> [3, 4], [1, 3]
    //[1, 7], [2, 6], [3, 5] -> [1, 7], [2, 6], [3, 5]
    //[1, 7], [2, 3], [4, 5] -> [1, 7], [4, 5], [2, 3]
    //{1, 7}, {2, 3}, {4, 6}, {6, 8} -> {6, 8}, {1, 7}, {4, 6}, {2, 3}
    //{1, 7}, {2, 5}, {4, 7}, {6, 8}, {7, 9} -> {6, 8}, {1, 7}, {4, 6}, {2, 3}
    // 1, 2, 4, 6, 7
    // 5, 7, 7, 8, 9

    //1, 7}, {2, 3}, {4, 6}, {5, 8
    //1, 2, 4, 5
    //3, 6, 7, 8
    public int minMeetingRooms(int[][] intervals) {
        int N = intervals.length;
        int[] starts = new int[N];
        int[] ends = new int[N];
        for (int i = 0; i < N; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int cnt = 0;
        for (int i = 0, j = 0; i < N; i++) {
            if (starts[i] < ends[j]) {
                cnt++;
            } else {
                j++;
            }
        }
        return cnt;
    }
}
