package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution46_1 {

    private void backtrack(int[] nums, List<Integer> buffer, List<List<Integer>> res) {
        if (buffer.size() == nums.length) {
            res.add(new ArrayList<>(buffer));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!buffer.contains(nums[i])) {
                    buffer.add(nums[i]);
                    backtrack(nums, buffer, res);
                    buffer.remove(buffer.size() - 1);
                }
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        backtrack(nums, new ArrayList<>(), res);
        return res;
    }

}
