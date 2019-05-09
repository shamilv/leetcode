package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution46 {
    private void backtrack(int[] nums, int[] buffer, int index, boolean[] isBuffered, List<List<Integer>> res) {
        //termination
        if (index == buffer.length) {
            res.add(IntStream.of(buffer).boxed().collect(Collectors.toList()));
            return;
        }

        //choose new candidate
        for (int i = 0; i < nums.length; i++) {
            if (!isBuffered[i]) {
                buffer[index] = nums[i];
                isBuffered[i] = true;
                backtrack(nums, buffer, index + 1, isBuffered, res);
                isBuffered[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        Arrays.sort(nums);
        int[] buffer = new int[nums.length];
        boolean[] isBuffered = new boolean[nums.length];
        backtrack(nums, buffer, 0, isBuffered, res);
        return res;
    }

}
