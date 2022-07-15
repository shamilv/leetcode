package companies.amazon;

import java.util.*;

public class Amazon56 {
    public int[][] merge(int[][] intervals) {
        int N = intervals.length;
        int[] starts = new int[N];
        int[] ends = new int[N];
        for (int i = 0; i < N; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        // {2, 3}, {1, 2}, {5, 8}, {6, 7}, {3, 4}
        //[1, 2, 3, 5, 6]
        //[2, 3, 4, 7, 8]
        LinkedList<int[]> ans = new LinkedList<>();
        int[] A = new int[2];
        A[0] = starts[0];
        A[1] = ends[0];
        for (int i = 1, j = 1; i < intervals.length; i++) {
            if (starts[i] <= A[1]) {
                A[1] = ends[j++];
            } else {
                ans.add(A);
                A = new int[]{starts[i], ends[j++]};
            }
        }
        ans.add(A);
        return ans.toArray(new int[][]{{}});
    }

    public int[][] merge2(int[][] intervals) {
        LinkedList<int[]> ans = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> b[1] - a[1]);

        int[] first = new int[2];
        first[0] = intervals[0][0];
        first[1] = intervals[0][1];
        ans.addFirst(first);
        for (int i = 1; i < intervals.length; i++) {
            first = ans.getFirst();
            if (first[0] <= intervals[i][1]) {
                first[0] = Math.min(first[0], intervals[i][0]);
            } else {
                ans.addFirst(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        return ans.toArray(new int[][]{{}});
    }
}
