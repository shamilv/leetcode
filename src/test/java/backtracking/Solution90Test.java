package backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution90Test {

    @Test
    public void edgeCaseNull() {
        Solution90 solution90 = new Solution90();
        List<List<Integer>> res = solution90.subsetWithDup(null);
        assertEquals(new ArrayList<>(), res);
    }

    @Test
    public void edgeCaseEmpty() {
        Solution90 solution90 = new Solution90();
        List<List<Integer>> res = solution90.subsetWithDup(new int[]{});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(new ArrayList<>());
        assertEquals(exp, res);
    }

    @Test
    public void baseCase1() {
        Solution90 solution90 = new Solution90();
        List<List<Integer>> res = solution90.subsetWithDup(new int[]{1});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(new ArrayList<>());
        exp.add(Arrays.asList(1));
        assertEquals(exp, res);
    }

    @Test
    public void regularCase11() {
        Solution90 solution90 = new Solution90();
        List<List<Integer>> res = solution90.subsetWithDup(new int[]{1, 1});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(new ArrayList<>());
        exp.add(Arrays.asList(1));
        exp.add(Arrays.asList(1, 1));
        assertEquals(exp, res);
    }

    @Test
    public void regularCase122() {
        Solution90 solution90 = new Solution90();
        List<List<Integer>> res = solution90.subsetWithDup(new int[]{1, 2, 2});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(new ArrayList<>());
        exp.add(Arrays.asList(1));
        exp.add(Arrays.asList(1, 2));
        exp.add(Arrays.asList(1, 2, 2));
        exp.add(Arrays.asList(2));
        exp.add(Arrays.asList(2, 2));
        assertEquals(exp, res);
    }

    @Test
    public void regularCase1323() {
        Solution90 solution90 = new Solution90();
        List<List<Integer>> res = solution90.subsetWithDup(new int[]{1, 3, 2, 3});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(new ArrayList<>());
        exp.add(Arrays.asList(1));
        exp.add(Arrays.asList(1, 2));
        exp.add(Arrays.asList(1, 2, 3));
        exp.add(Arrays.asList(1, 2, 3, 3));
        exp.add(Arrays.asList(1, 3));
        exp.add(Arrays.asList(1, 3, 3));
        exp.add(Arrays.asList(2));
        exp.add(Arrays.asList(2, 3));
        exp.add(Arrays.asList(2, 3, 3));
        exp.add(Arrays.asList(3));
        exp.add(Arrays.asList(3, 3));
        assertEquals(exp, res);
    }

}