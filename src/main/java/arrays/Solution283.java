package arrays;

import java.util.HashMap;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int pointer = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[pointer++] = nums[i];
        for (; pointer < nums.length; pointer++)
            nums[pointer] = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(10, 10);
    }

    public static void main(String[] args) {
        Integer ggg = 200;
        int h;
        int hashKey = (h = ggg.hashCode()) ^ (h >>> 16);
        System.out.println((h = ggg.hashCode()) ^ (h >>> 16));
    }
}
