package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution39Repeat {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0)
            return res;
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void combinationSum(int[] candidates, int remain, int pos, List<Integer> buf, List<List<Integer>> res) {
        if (remain == 0) {
            res.add(new ArrayList<>(buf));
            return;
        } else if (remain < 0)
            return;

        for (int i = pos; i < candidates.length; i++) {
            int currVal = candidates[i];
            buf.add(currVal);
            combinationSum(candidates, remain - currVal, i, buf, res);
            buf.remove(buf.size() - 1);
        }
    }
}
