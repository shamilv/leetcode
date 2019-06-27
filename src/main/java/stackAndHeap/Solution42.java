package stackAndHeap;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution42 {

    public int trap(int[] height) {
        if (height == null)
            return 0;
        int res = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            if (height[i] == 0)
                continue;
            while (!deque.isEmpty() && height[deque.peekFirst()] <= height[i]) {
                int first = deque.pollFirst();
                while (!deque.isEmpty()) {
                    res -= height[deque.pollFirst()];
                }
                res += calcSqrt(first, i, height);
            }
            deque.offer(i);
        }
        Integer last = deque.pollLast();
        while (!deque.isEmpty()) {
            int prev = deque.pollLast();
            if (height[prev] < height[last])
                res -= height[prev];
            else {
                res += calcSqrt(prev, last, height);
                last = prev;
            }
        }
        return res;
    }

    private int calcSqrt(int i, int j, int[] height) {
        int level = Math.min(height[i], height[j]);
        return level * (j - i - 1);
    }

}
