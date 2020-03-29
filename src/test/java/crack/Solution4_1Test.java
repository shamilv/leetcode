package crack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4_1Test {

    @Test
    public void test1() {
        Solution4_1 solution4_1 = new Solution4_1();
        boolean ans = solution4_1.isConnected(new int[][]{{1, 2}, {3}, {4}, {}, {}}, 0, 3);
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution4_1 solution4_1 = new Solution4_1();
        boolean ans = solution4_1.isConnected(new int[][]{{1, 2}, {3}, {4}, {}, {}}, 0, 2);
        assertTrue(ans);
    }

    @Test
    public void test3() {
        Solution4_1 solution4_1 = new Solution4_1();
        boolean ans = solution4_1.isConnected(new int[][]{{1, 2}, {3}, {4}, {}, {}}, 1, 2);
        assertFalse(ans);
    }

}