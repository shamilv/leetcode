package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    public void test1() {
        Solution42 solution42 = new Solution42();
        int ans = solution42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        assertEquals(6, ans);
    }

}