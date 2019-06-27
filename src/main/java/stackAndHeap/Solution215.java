package stackAndHeap;

import java.util.PriorityQueue;

/**
 * not me
 * Time complexity: O(nlogk)
 * Space complexity: O(k)
 *
 */
public class Solution215 {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num: nums) {
            queue.add(num);
            if (queue.size() > k)
                queue.poll();
        }
        return queue.poll();
    }
}
