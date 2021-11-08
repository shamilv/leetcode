import java.util.Arrays;
import java.util.TreeMap;

public class Solution2021 {

    //Sweep line algorithm
    public int brightestPosition(int[][] lights) {
        int n = lights.length;
        int[] begin = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            begin[i] = lights[i][0] - lights[i][1];
            end[i] = lights[i][0] + lights[i][1];
        }
        Arrays.sort(begin);
        Arrays.sort(end);
        int ans = begin[0], max = 0, cur = 0, j = 0;
        for (int i = 0; i < n; i++) {
            cur++;
            while (j < n && end[j] < begin[i]) {
                j++;
                cur--;
            }
            if (cur > max) {
                max = cur;
                ans = begin[i];
            }
        }
        return ans;
    }

    public int brightestPosition2(int[][] lights) {
        int n = lights.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int start = lights[i][0] - lights[i][1];
            int end = lights[i][0] + lights[i][1] + 1;
            map.put(start, map.getOrDefault(start, 0) + 1);
            map.put(end, map.getOrDefault(end, 0) - 1);
        }
        int ans = 0, cur = 0, max = 0;
        for (int i: map.keySet()) {
            cur += map.get(i);
            if (cur > max) {
                max = cur;
                ans = i;
            }
        }
        return ans;
    }
}
