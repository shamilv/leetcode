import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1335Test {

    @Test
    public void test1() {
        Solution1335 solution1335 = new Solution1335();
        int ans = solution1335.minDifficulty(new int[]{1, 1, 1}, 3);
        assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution1335 solution1335 = new Solution1335();
        int ans = solution1335.minDifficulty(new int[]{1, 1, 1}, 4);
        assertEquals(-1, ans);
    }

    @Test
    public void test3() {
        Solution1335 solution1335 = new Solution1335();
        int ans = solution1335.minDifficulty(new int[]{5, 7, 4}, 2);
        assertEquals(11, ans);
    }

    @Test
    public void test4() {
        Solution1335 solution1335 = new Solution1335();
        int ans = solution1335.minDifficulty(new int[]{6,5,4,3,2,1}, 2);
        assertEquals(7, ans);
    }

    @Test
    public void test5() {
        Solution1335 solution1335 = new Solution1335();
        int ans = solution1335.minDifficulty(new int[]{7,1,7,1,7,1}, 3);
        assertEquals(15, ans);
    }

    @Test
    public void test6() {
        Solution1335 solution1335 = new Solution1335();
        int ans = solution1335.minDifficulty(new int[]{11,111,22,222,33,333,44,444}, 6);
        assertEquals(843, ans);
    }

}