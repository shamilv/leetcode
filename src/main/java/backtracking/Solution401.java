package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution401 {
    private final static int[] hours = new int[]{8, 4, 2, 1};
    private final static int[] minutes = new int[]{32, 16, 8, 4, 2, 1};

    private void combineHours(int num, int hindex, int[] buffer, int bufferIndex, List<String> res) {
        if (num == 0) {
            toTime(buffer, buffer.length-1, res);
            return;
        }
        if (hindex < 0) {
            return;
        }
        for (int i = hindex; i >= 0; i--) {
            buffer[bufferIndex] = hours[i];
            combineHours(num-1, i-1, buffer, bufferIndex+1, res);
            if (num-1 > 0) {
                combineMinutes(num-1, minutes.length-1, buffer, bufferIndex+1, bufferIndex, res);
            }
        }
    }

    private void combineMinutes(int num, int mindex, int[] buffer, int bufferIndex, int hindex, List<String> res) {
        if (num == 0) {
            toTime(buffer, hindex, res);
            return;
        }
        if (mindex < 0) {
            return;
        }
        for (int i = mindex; i >= 0; i--) {
            buffer[bufferIndex] = minutes[i];
            combineMinutes(num-1, i-1, buffer, bufferIndex+1, hindex, res);
        }
    }

    private void toTime(int[] buffer, int hindex, List<String> res) {
        int hour = 0, minute = 0;
        for (int i = 0; i <= hindex; i++)
            hour += buffer[i];
        for (int i = hindex+1; i < buffer.length; i++)
            minute += buffer[i];
        if (hour < 12 && minute < 60) {
            res.add(String.format("%d:%02d", hour, minute));
        }
    }

    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        int[] buffer = new int[num];
        combineHours(num, hours.length-1, buffer, 0, res);
        if (num > 0)
            combineMinutes(num, minutes.length-1, buffer, 0, -1, res);
        return res;
    }
}
