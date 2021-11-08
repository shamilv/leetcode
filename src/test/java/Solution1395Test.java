import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1395Test {

    @Test
    public void test1() {
        Solution1395 solution1395 = new Solution1395();
        int ans = solution1395.numTeams(new int[]{2,5,3,4,1});
        assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution1395 solution1395 = new Solution1395();
        int ans = solution1395.numTeams(new int[]{2,5,3});
        assertEquals(0, ans);
    }

    @Test
    public void test3() {
        Solution1395 solution1395 = new Solution1395();
        int ans = solution1395.numTeams(new int[]{2,3,4,5});
        assertEquals(4, ans);
    }

}