package arrays;

public class Solution152 {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i > 0 && nums[i - 1] > 0)
                num = nums[i - 1] * nums[i];
            nums[i] = num;
        }
        int res = nums[0];
        for (int i = 0; i < nums.length; i++)
            res = Math.max(res, nums[i]);

        return res;
    }
}
