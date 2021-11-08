import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2021Test {

    @Test
    public void test1() {
        Solution2021 solution2021 = new Solution2021();
        int ans = solution2021.brightestPosition(new int[][]{{0, 1}});
        assertEquals(-1, ans);
    }

    @Test
    public void test2() {
        Solution2021 solution2021 = new Solution2021();
        int ans = solution2021.brightestPosition(new int[][]{{0, 1}, {2, 1}});
        assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Solution2021 solution2021 = new Solution2021();
        int ans = solution2021.brightestPosition(new int[][]{{-3, 1}, {0, 1}, {2, 2}, {3, 1}});
        assertEquals(0, ans);
    }

}