package companies.amazon;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Amazon973 {
    public int[][] kClosestDraft(int[][] points, int k) {
        quickSelect(points, k, 0, points.length-1);
        return Arrays.copyOf(points, k);
    }
    //18     20     26
    //{3,3},{5,-1},{-2,4}
    private void quickSelect(int[][] p, int k, int l, int r) {
        int left = l, right = r;
        int mid = l + (r - l)/2;
        while (left < right) {
            int lval = calcVal(p, left);
            int rval = calcVal(p, right);
            int pVal = calcVal(p, mid);
            if (lval > pVal && rval < pVal) {
                swap(p, left++, right--);
            } else if (lval > pVal) {
                swap(p, left++, mid);
            } else if (rval < pVal) {
                swap(p, right--, mid);
            } else {
                left++;
                right--;
            }
        }
        if (mid == k-1) {
            return;
        } else if (mid > k - 1) {
            quickSelect(p, k, l, mid);
        } else {
            quickSelect(p, k, mid + 1, r);
        }
    }

    private void swap(int[][] p, int l, int r) {
        int[] tmp = p[l];
        p[l] = p[r];
        p[r] = tmp;
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q= new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < points.length; i++) {
            int[] entry = new int[]{calcVal(points, i), i};
            if (q.size() < k) {
                q.offer(entry);
            } else if (entry[0] < q.peek()[0]) {
                q.poll();
                q.offer(entry);
            }
        }

        int[][] ans = new int[k][2];
        while (k > 0) {
            ans[k-1] = points[q.poll()[1]];
            k--;
        }
        return ans;
    }

    private int calcVal(int[][] p, int i) {
        return p[i][0]*p[i][0] + p[i][1]*p[i][1];
    }
}
