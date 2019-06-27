package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Solution252 {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] > intervals[i][0])
                return false;
        }
        return true;
    }
}
