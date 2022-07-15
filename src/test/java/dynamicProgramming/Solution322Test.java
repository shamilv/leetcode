package dynamicProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution322Test {

    @Test
    public void test1() {
        Solution322 solution322 = new Solution322();
        int ans = solution322.coinChange(new int[]{1, 2, 5}, 11);
        assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution322 solution322 = new Solution322();
        int ans = solution322.coinChange(new int[]{2, 4}, 4);
        assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Solution322 solution322 = new Solution322();
        int ans = solution322.coinChange(new int[]{3, 5}, 7);
        assertEquals(-1, ans);
    }

}
