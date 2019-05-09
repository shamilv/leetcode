package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution47 {

    private void backtrack(int[] nums, int[] buffer, int index, boolean[] isBuffered, List<List<Integer>> res) {
        if (index == buffer.length) {
            res.add(toList(buffer));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!isBuffered[i]) {
                if (i > 0 && nums[i] == nums[i - 1] && !isBuffered[i - 1])
                    continue;
                buffer[index] = nums[i];
                isBuffered[i] = true;
                backtrack(nums, buffer, index + 1, isBuffered, res);
                isBuffered[i] = false;
            }
        }
    }

    private List<Integer> toList(int[] buffer) {
        return IntStream.of(buffer).boxed().collect(Collectors.toList());
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        int[] buffer = new int[nums.length];
        boolean[] isBuffered = new boolean[nums.length];
        backtrack(nums, buffer, 0, isBuffered, res);
        return res;
    }

}
