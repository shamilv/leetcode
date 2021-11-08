import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1326Test {

    @Test
    public void test1() {
        Solution1326 solution1326 = new Solution1326();
        int ans = solution1326.minTaps(5, new int[] {3,4,1,1,0,0});
        assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Solution1326 solution1326 = new Solution1326();
        int ans = solution1326.minTaps(7, new int[] {1,2,1,0,2,1,0,1});
        assertEquals(3, ans);
    }

    @Test
    public void test3() {
        Solution1326 solution1326 = new Solution1326();
        int ans = solution1326.minTaps(3, new int[] {0,0,0,0});
        assertEquals(-1, ans);
    }

    @Test
    public void test4() {
        Solution1326 solution1326 = new Solution1326();
        int ans = solution1326.minTaps(8, new int[] {4,0,0,0,0,0,0,0,4});
        assertEquals(2, ans);
    }

    @Test
    public void test5() {
        Solution1326 solution1326 = new Solution1326();
        int ans = solution1326.minTaps(8, new int[] {4,0,0,0,4,0,0,0,4});
        assertEquals(1, ans);
    }

    @Test
    public void test6() {
        Solution1326 solution1326 = new Solution1326();
        int ans = solution1326.minTaps(9, new int[] {0,5,0,3,3,3,1,4,0,4});
        assertEquals(2, ans);
    }

}