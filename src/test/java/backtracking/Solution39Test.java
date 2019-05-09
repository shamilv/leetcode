package backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution39Test {

    @Test
    public void testNull() {
        Solution39 solution39 = new Solution39();
        List<List<Integer>> res = solution39.combinationSum(null, 3);
        List<List<Integer>> exp = new LinkedList<>();
        assertEquals(exp, res);
    }

    @Test
    public void testEmpty() {
        Solution39 solution39 = new Solution39();
        List<List<Integer>> res = solution39.combinationSum(new int[]{}, 3);
        List<List<Integer>> exp = new LinkedList<>();
        assertEquals(exp, res);
    }

    @Test
    public void test() {
        Solution39 solution39 = new Solution39();
        List<List<Integer>> res = solution39.combinationSum(new int[]{1}, 3);
        List<List<Integer>> exp = new LinkedList<>();
        exp.add(Arrays.asList(1, 1, 1));
        assertEquals(exp, res);
    }

    @Test
    public void test2() {
        Solution39 solution39 = new Solution39();
        List<List<Integer>> res = solution39.combinationSum(new int[]{1, 2}, 3);
        List<List<Integer>> exp = new LinkedList<>();
        exp.add(Arrays.asList(1, 1, 1));
        exp.add(Arrays.asList(1, 2));
        assertEquals(exp, res);
    }

    @Test
    public void test3() {
        Solution39 solution39 = new Solution39();
        List<List<Integer>> res = solution39.combinationSum(new int[]{2, 3, 5}, 8);
        List<List<Integer>> exp = new LinkedList<>();
        exp.add(Arrays.asList(2, 2, 2, 2));
        exp.add(Arrays.asList(2, 3, 3));
        exp.add(Arrays.asList(3, 5));
        assertEquals(exp, res);
    }

}