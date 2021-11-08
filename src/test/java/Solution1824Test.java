import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1824Test {

    @Test
    public void test() {
        Solution1824 solution1824 = new Solution1824();
        int ans = solution1824.minSideJumps3(new int[]{0, 1, 2, 3, 0});
        assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution1824 solution1824 = new Solution1824();
        int ans = solution1824.minSideJumps3(new int[]{0,1,1,3,3,0});
        assertEquals(0, ans);
    }

    @Test
    public void test3() {
        Solution1824 solution1824 = new Solution1824();
        int ans = solution1824.minSideJumps3(new int[]{0,2,1,0,3,0});
        assertEquals(2, ans);
    }

}