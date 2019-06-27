package stackAndHeap;

import java.util.*;

public class Solution239 {

    /**
     * not me
     * T.C.: O(N)
     * S.C.: O(N)
     *
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null)
            return null;
        if (nums.length * k == 0)
            return new int[0];
        Deque<Integer> deque = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1)
                deque.pollFirst();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();
            deque.offer(i);
            if (i >= k - 1)
                res[r++] = nums[deque.peekFirst()];
        }
        return res;
    }

    /**
     * me - not a good version
     * T.C.: O(N*K)
     * S.C.: O(K)
     */
    public int[] maxSlidingWindow2(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++)
            queue.offer(nums[i]);
        res[0] = queue.peek();
        for (int l = 1, r = k; r < nums.length; l++, r++) {
            queue.remove(nums[l-1]);
            queue.offer(nums[r]);
            res[l] = queue.peek();
        }
        return res;
    }
}
