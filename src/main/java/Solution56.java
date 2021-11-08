import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution56 {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });
        List<int[]> tmp = new ArrayList<>();
        int l = 0;
        while (l < intervals.length) {
            int[] x = new int[]{intervals[l][0], intervals[l][1]};
            tmp.add(x);
            int r = l + 1;
            while (r < intervals.length && x[1] >= intervals[r][0]) {
                x[1] = Math.max(x[1], intervals[r][1]);
                r++;
            }
            l = r;
        }
        return tmp.toArray(new int[][]{});
    }
}
