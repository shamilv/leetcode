import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1770Test {

    @Test
    public void test1() {
        Solution1770 solution = new Solution1770();
        int ans = solution.maximumScore(new int[]{1, 2, 3}, new int[]{3, 2, 1});
        assertEquals(14, ans);
    }

    @Test
    public void test2() {
        Solution1770 solution = new Solution1770();
        int ans = solution.maximumScore(new int[]{-5,-3,-3,-2,7,1}, new int[]{-10,-5,3,4,6});
        assertEquals(102, ans);
    }

}