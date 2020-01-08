package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution560Test {

    @Test
    public void test1() {
        Solution560 solution560 = new Solution560();
        int ans = solution560.subarraySum(new int[]{1, 2, 3}, 3);
        assertEquals(2, ans);
    }

}