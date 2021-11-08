import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1664Test {

    @Test
    public void test1() {
        Solution1664 solution1664 = new Solution1664();
        int ans = solution1664.waysToMakeFair(new int[]{2,1,6,4});
        assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Solution1664 solution1664 = new Solution1664();
        int ans = solution1664.waysToMakeFair(new int[]{2,1});
        assertEquals(0, ans);
    }

    @Test
    public void test3() {
        Solution1664 solution1664 = new Solution1664();
        int ans = solution1664.waysToMakeFair(new int[]{1});
        assertEquals(0, ans);
    }

    @Test
    public void test4() {
        Solution1664 solution1664 = new Solution1664();
        int ans = solution1664.waysToMakeFair(new int[]{1, 1, 1});
        assertEquals(3, ans);
    }

}