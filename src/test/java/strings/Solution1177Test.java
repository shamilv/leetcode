package strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1177Test {

    @Test
    public void test6() {
        Solution1177 solution1177 = new Solution1177();
        List<Boolean> ans = solution1177.canMakePaliQueries("hunu", new int[][]{{0,3,1}});

        assertEquals(Arrays.asList(true), ans);
    }

}