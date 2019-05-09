package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {

    private void backtrack(int[] candidates, List<Integer> buffer, int pos, int remain, List<List<Integer>> res) {
        if (remain < 0)
            return;
        else if (remain == 0) {
            res.add(new ArrayList<>(buffer));
        } else {
            for (int i = pos; i < candidates.length; i++) {
                if (i > pos && candidates[i] == candidates[i-1])
                    continue;
                int num = candidates[i];
                buffer.add(num);
                backtrack(candidates, buffer, i + 1, remain - num, res);
                buffer.remove(buffer.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0)
            return res;
        Arrays.sort(candidates);
        backtrack(candidates, new ArrayList<>(), 0, target, res);
        return res;
    }
}
