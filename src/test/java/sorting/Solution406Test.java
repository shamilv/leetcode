package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution406Test {

    @Test
    public void test1() {
        Solution406 solution406 = new Solution406();
        int[][] ans = solution406.reconstructQueue(new int[][]{{4, 1}, {2, 1}, {4, 0}});
        int[][] exp = new int[][]{{4, 0}, {2, 1}, {4, 1}};
        assertEquals(exp, ans);
    }

}