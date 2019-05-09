package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left = increase(left, nums);
                        right = decrease(right, nums, i);
                    } else if (sum > 0)
                        right = decrease(right, nums, i);
                    else
                        left = increase(left, nums);
                }
            }
        }
        return res;
    }

    private int increase(int left, int[] nums) {
        while (left < nums.length - 1 && nums[left] == nums[left++ + 1]);
        return left;
    }

    private int decrease(int right, int[] nums, int i) {
        while (right > i && nums[right] == nums[right-- -1]);
        return right;
    }

}
