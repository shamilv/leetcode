import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Solution1326 {
    public int minTaps(int n, int[] ranges) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < ranges.length; i++) {
            int r = ranges[i];
            if (r > 0) {
                int start = Math.max(0, i - ranges[i]);
                int end = Math.min(n, i + ranges[i]);
                list.add(new int[]{start, end});
            }
        }
        Collections.sort(list, (a, b) -> b[1] == a[1] ? (b[1] - b[0]) - (a[1] - a[0]) : (b[1] - a[1]));
        TreeMap<Integer, int[]> dp = new TreeMap<>();
        dp.put(n, new int[]{n, n, 0});
        for (int[] a: list) {
            int[] b = dp.floorEntry(a[1]).getValue();
            int[] x = new int[]{a[0], a[1], b[2] + 1};
            int[] root = dp.firstEntry().getValue();
            if (x[0] < root[0] && x[1] >= root[0]) {
                dp.put(x[0], x);
            }
        }
        int[] ans = dp.firstEntry().getValue();
        return ans[0] == 0 ? ans[2] : -1;
    }
}
