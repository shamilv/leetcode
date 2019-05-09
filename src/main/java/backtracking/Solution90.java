package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90 {
    public List<List<Integer>> subsetWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null)
            return res;
        Arrays.sort(nums);
        subsetWithDup(nums, 0, res, new ArrayList<>());
        return res;
    }

    private void subsetWithDup(int[] nums, int pos, List<List<Integer>> res, List<Integer> buffer) {
        res.add(new ArrayList<>(buffer));
        for (int i = pos; i < nums.length; i++) {
            if (i == pos || nums[i] != nums[i-1]) {
                buffer.add(nums[i]);
                subsetWithDup(nums, i + 1, res, buffer);
                buffer.remove(buffer.size() - 1);
            }
        }
    }
}
