package contests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution5175Test {

    @Test
    public void test1() {
        Solution5175 solution5175 = new Solution5175();
        List<Boolean> ans = solution5175.canMakePaliQueries("abcda", new int[][]{{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}});

        assertEquals(Arrays.asList(true, false, false, true, true), ans);
    }

    @Test
    public void test2() {
        Solution5175 solution5175 = new Solution5175();
        List<Boolean> ans = solution5175.canMakePaliQueries("abcda", new int[][]{{0,3,2}});

        assertEquals(Arrays.asList(true), ans);
    }

    @Test
    public void test3() {
        Solution5175 solution5175 = new Solution5175();
        List<Boolean> ans = solution5175.canMakePaliQueries("abcda", new int[][]{{0,4,1}});

        assertEquals(Arrays.asList(true), ans);
    }

    @Test
    public void test4() {
        Solution5175 solution5175 = new Solution5175();
        List<Boolean> ans = solution5175.canMakePaliQueries("ninmjmj", new int[][]{{6,6,0},{1,1,1},{2,5,4},{1,3,1},{5,6,1}});

        assertEquals(Arrays.asList(true, true, true, true, true), ans);
    }

    @Test
    public void test5() {
        Solution5175 solution5175 = new Solution5175();
        List<Boolean> ans = solution5175.canMakePaliQueries("ninmjmj", new int[][]{{2,5,4}});

        assertEquals(Arrays.asList(true), ans);
    }

    @Test
    public void test6() {
        Solution5175 solution5175 = new Solution5175();
        List<Boolean> ans = solution5175.canMakePaliQueries("hunu", new int[][]{{0,3,1}});

        assertEquals(Arrays.asList(true), ans);
    }


}