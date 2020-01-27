package sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution973 {

    public int[][] kClosest(int[][] points, int K) {
        int left = 0, right = points.length - 1;
        while (left < right) {
            int mid = sort(points, left, right);
            if (mid == K) break;
            if (mid > K)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return Arrays.copyOf(points, K);
    }

    private int sort(int[][] points, int left, int right) {
        int[] pivot = points[left];
        while (left < right && compare(pivot, points[right]) <= 0)
            right--;
        points[left] = points[right];
        while (left < right && compare(pivot, points[left]) >= 0)
            left++;
        points[right] = points[left];
        points[left] = pivot;
        return left;
    }

    private int compare(int[] p1, int[] p2) {
        return (p1[0]*p1[0] + p1[1]*p1[1]) - (p2[0]*p2[0] + p2[1]*p2[1]);
    }

    public int[][] kClosest2(int[][] points, int K) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < points.length; i++) {
            int d = (int)(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            q.offer(new int[]{i, d});
            if (q.size() > K)
                q.poll();
        }
        int[][] ans = new int[K][2];
        while (!q.isEmpty())
            ans[--K] = points[q.poll()[0]];
        return ans;
    }
}
