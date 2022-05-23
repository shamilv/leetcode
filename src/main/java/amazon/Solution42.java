package amazon;

import java.util.Stack;

public class Solution42 {

    public int trap(int[] height) {
        Stack<Integer> q = new Stack<>();
        int l = 0, ans = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] == 0) continue;
            if (height[i] >= height[l]) {
                while (!q.isEmpty()) {
                    int j = q.pop();
                    if (j == l) {
                        ans += (i - j - 1) * height[l];
                    } else {
                        ans -= height[j];
                    }
                }
                l = i;
            }
            q.push(i);
        }
        if (!q.isEmpty()) {
            int i = q.pop();
            while (!q.isEmpty()) {
                int j = q.pop();
                if (height[j] >= height[i]) {
                    ans += (i - j - 1) * Math.min(height[i], height[j]);
                    i = j;
                } else {
                    ans -= height[j];
                }
            }
        }
        return ans;
    }
}
