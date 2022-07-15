package companies.amazon;

import java.util.Stack;

public class Solution42 {

    public int trap(int[] height) {
        Stack<Integer> q = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!q.isEmpty() && height[i] > height[q.peek()]) {
                int j = q.pop();
                if (q.isEmpty()) break;
                int dist = i - q.peek() - 1;
                ans += dist * (Math.min(height[i], height[q.peek()]) - height[j]);
            }
            q.push(i);
        }
        return ans;
    }

    public int trapTwoPointers(int[] height) {
        int ans = 0;
        int N = height.length;
        int[] lmax = new int[N];
        int[] rmax = new int[N];
        lmax[0] = height[0];
        rmax[N - 1] = height[N - 1];
        for (int i = 1; i < N; i++) {
            lmax[i] = Math.max(height[i], lmax[i - 1]);
        }
        for (int i = N - 2; i >= 0; i--) {
            rmax[i] = Math.max(height[i], rmax[i + 1]);
        }
        for (int i = 0; i < N; i++) {
            ans += Math.min(lmax[i], rmax[i]) - height[i];
        }
        return ans;
    }

    public int trapBrute(int[] height) {
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            int lmax = height[i], rmax = height[i];
            for (int l = 0; l < i; l++) {
                lmax = Math.max(height[l], lmax);
            }
            for (int r = i + 1; r < height.length; r++) {
                rmax = Math.max(height[r], rmax);
            }
            ans += Math.min(lmax, rmax) - height[i];
        }
        return ans;
    }
}
