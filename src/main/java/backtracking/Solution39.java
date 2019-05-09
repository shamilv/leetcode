package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution39 {
    private void helper(int[] candidates, List<Integer> buffer, int remain, int pos, List<List<Integer>> res) {
        if (remain < 0)
            return;
        else if (remain == 0) {
            res.add(new ArrayList<>(buffer));
        } else {
            for (int i = pos; i < candidates.length; i++) {
                int num = candidates[i];
                buffer.add(num);
                helper(candidates, buffer, remain - num, i, res);
                buffer.remove(buffer.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new LinkedList<>();
        if (candidates == null || candidates.length == 0)
            return res;
        Arrays.sort(candidates);
        List<Integer> buffer = new ArrayList<>();
        helper(candidates, buffer, target, 0, res);
        return res;
    }
}
