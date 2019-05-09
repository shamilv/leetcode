package backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {

    @Test
    public void testNull() {
        Solution40 solution40 = new Solution40();
        List<List<Integer>> res = solution40.combinationSum2(null, 3);
        List<List<Integer>> exp = new LinkedList<>();
        assertEquals(exp, res);
    }

    @Test
    public void testEmpty() {
        Solution40 solution40 = new Solution40();
        List<List<Integer>> res = solution40.combinationSum2(new int[]{}, 3);
        List<List<Integer>> exp = new LinkedList<>();
        assertEquals(exp, res);
    }

    @Test
    public void test() {
        Solution40 solution40 = new Solution40();
        List<List<Integer>> res = solution40.combinationSum2(new int[]{1, 1, 1}, 3);
        List<List<Integer>> exp = new LinkedList<>();
        exp.add(Arrays.asList(1, 1, 1));
        assertEquals(exp, res);
    }

    @Test
    public void test2() {
        Solution40 solution40 = new Solution40();
        List<List<Integer>> res = solution40.combinationSum2(new int[]{1, 2}, 3);
        List<List<Integer>> exp = new LinkedList<>();
        exp.add(Arrays.asList(1, 2));
        assertEquals(exp, res);
    }

    @Test
    public void test3() {
        Solution40 solution40 = new Solution40();
        List<List<Integer>> res = solution40.combinationSum2(new int[]{1, 2, 2, 2, 5}, 5);
        List<List<Integer>> exp = new LinkedList<>();
        exp.add(Arrays.asList(1, 2, 2));
        exp.add(Arrays.asList(5));
        assertEquals(exp, res);
    }

}