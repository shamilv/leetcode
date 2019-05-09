package arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution15Test {

    @Test
    public void testEdgeNull() {
        Solution15 solution15 = new Solution15();
        List<List<Integer>> res = solution15.threeSum(null);
        List<List<Integer>> exp = new ArrayList<>();
        assertEquals(exp, res);
    }

    @Test
    public void testEdgeLessThan3() {
        Solution15 solution15 = new Solution15();
        List<List<Integer>> res = solution15.threeSum(new int[]{1, 2});
        List<List<Integer>> exp = new ArrayList<>();
        assertEquals(exp, res);
    }

    @Test
    public void testBase() {
        Solution15 solution15 = new Solution15();
        List<List<Integer>> res = solution15.threeSum(new int[]{0,0,0});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(0,0,0));

        assertEquals(exp, res);
    }

    @Test
    public void testRegular() {
        Solution15 solution15 = new Solution15();
        List<List<Integer>> res = solution15.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(-1, -1, 2));
        exp.add(Arrays.asList(-1, 0, 1));

        assertEquals(exp, res);
    }

}