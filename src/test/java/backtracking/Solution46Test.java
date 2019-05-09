package backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {

    @Test
    public void testNull() {
        Solution46 solution46 = new Solution46();
        List<List<Integer>> res = solution46.permute(null);
        List<List<Integer>> exp = new ArrayList<>();
        assertEquals(exp, res);
    }

    @Test
    public void testEmpty() {
        Solution46 solution46 = new Solution46();
        List<List<Integer>> res = solution46.permute(new int[]{});
        List<List<Integer>> exp = new ArrayList<>();
        assertEquals(exp, res);
    }

    @Test
    public void test1() {
        Solution46 solution46 = new Solution46();
        List<List<Integer>> res = solution46.permute(new int[]{1});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(1));
        assertEquals(exp, res);
    }

    @Test
    public void test12() {
        Solution46 solution46 = new Solution46();
        List<List<Integer>> res = solution46.permute(new int[]{1, 2});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(1, 2));
        exp.add(Arrays.asList(2, 1));
        assertEquals(exp, res);
    }

}