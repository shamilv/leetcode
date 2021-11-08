import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1786Test {

    @Test
    public void test1() {
        Solution1786 solution1786 = new Solution1786();
        int ans = solution1786.countRestrictedPaths(5, new int[][]{{1,2,3}, {1,3,3}, {2,3,1}, {1,4,2}, {5,2,2}, {3,5,1}, {5,4,10}});
        assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution1786 solution1786 = new Solution1786();
        int ans = solution1786.countRestrictedPaths(7, new int[][]{{1,3,1}, {4,1,2}, {7,3,4}, {2,5,3}, {5,6,1}, {6,7,2}, {7,5,3}, {2,6,4}});
        assertEquals(1, ans);
    }

}