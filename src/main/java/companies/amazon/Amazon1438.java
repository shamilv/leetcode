package companies.amazon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeSet;

public class Amazon1438 {

    public int longestSubarray(int[] nums, int limit) {
        int ans = 0, l = 0;
        Deque<Integer> minValues = new LinkedList<>();
        Deque<Integer> maxValues = new LinkedList<>();
        for (int r = 0; r < nums.length; r++) {
            while (!minValues.isEmpty() && nums[r] < minValues.peekLast()) {
                minValues.pollLast();
            }
            while (!maxValues.isEmpty() && nums[r] > maxValues.peekLast()) {
                maxValues.pollLast();
            }
            minValues.addLast(nums[r]);
            maxValues.addLast(nums[r]);
            if (maxValues.peekFirst() - minValues.peekFirst() > limit) {
                if (nums[l] == minValues.peekFirst()) minValues.pollFirst();
                if (nums[l] == maxValues.peekFirst()) maxValues.pollFirst();
                l++;
            }
            ans = Math.max(ans, r - l);
        }
        return ans + 1;
    }

    //[10, 1, 2, 4, 7, 2], 5
    public int longestSubarray2(int[] nums, int limit) {
        int ans = 0, l = 0;
        TreeSet<Integer> tree = new TreeSet<>((a, b) -> nums[a] == nums[b] ? a - b : nums[a] - nums[b]);
        for (int r = 0; r < nums.length; r++) {
            tree.add(r);
            while (nums[tree.last()] - nums[tree.first()] > limit) {
                tree.remove(l++);
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
