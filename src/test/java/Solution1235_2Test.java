import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1235_2Test {

    @Test
    public void test4() {
        int[] st = new int[]{1, 2, 3, 4, 6};
        int[] et = new int[]{3, 5, 10, 6, 9};
        int[] p = new int[]{20, 20, 100, 70, 60};
        Solution1235_2 solution1235 = new Solution1235_2();
        int ans = solution1235.jobScheduling(st, et, p);
        assertEquals(150, ans);
    }

    @Test
    public void test5() {
        int[] st = new int[]{1, 2, 3, 4, 6};
        int[] et = new int[]{3, 5, 10, 6, 9};
        int[] p = new int[]{20, 20, 100, 70, 60};
        Solution1235_2 solution1235 = new Solution1235_2();
        int ans = solution1235.jobScheduling(st, et, p);
        assertEquals(150, ans);
    }

}