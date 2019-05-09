package backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution47Test {

    @Test
    public void testNull() {
        Solution47 solution47 = new Solution47();
        List<List<Integer>> res = solution47.permuteUnique(null);
        List<List<Integer>> exp = new ArrayList<>();
        assertEquals(exp, res);
    }

    @Test
    public void testEmpty() {
        Solution47 solution47 = new Solution47();
        List<List<Integer>> res = solution47.permuteUnique(new int[]{});
        List<List<Integer>> exp = new ArrayList<>();
        assertEquals(exp, res);
    }

    @Test
    public void test1() {
        Solution47 solution47 = new Solution47();
        List<List<Integer>> res = solution47.permuteUnique(new int[]{1});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(1));
        assertEquals(exp, res);
    }

    @Test
    public void test22() {
        Solution47 solution47 = new Solution47();
        List<List<Integer>> res = solution47.permuteUnique(new int[]{2,2});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(2,2));
        assertEquals(exp, res);
    }

    @Test
    public void test122() {
        Solution47 solution47 = new Solution47();
        List<List<Integer>> res = solution47.permuteUnique(new int[]{1,2,2});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(1,2,2));
        exp.add(Arrays.asList(2,1,2));
        exp.add(Arrays.asList(2,2,1));
        assertEquals(exp, res);
    }

    @Test
    public void test112() {
        Solution47 solution47 = new Solution47();
        List<List<Integer>> res = solution47.permuteUnique(new int[]{1,1,2});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(1,1,2));
        exp.add(Arrays.asList(1,2,1));
        exp.add(Arrays.asList(2,1,1));
        assertEquals(exp, res);
    }

    @Test
    public void test3303() {
        Solution47 solution47 = new Solution47();
        List<List<Integer>> res = solution47.permuteUnique(new int[]{3,3,0,3});
        List<List<Integer>> exp = new ArrayList<>();
        System.out.println(res);
    }

}