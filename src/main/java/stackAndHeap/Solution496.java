package stackAndHeap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * not me
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return nums1;
        Map<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> stack = new LinkedList<>();
        for (int num: nums2) {
            Integer n;
            while ((n = stack.peek()) != null && n < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        while (!stack.isEmpty())
            map.put(stack.pop(), -1);

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++)
            res[i] = map.get(nums1[i]);

        return res;
    }
}
