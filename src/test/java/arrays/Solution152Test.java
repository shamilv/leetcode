package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution152Test {

    @Test
    public void edgeCaseNull() {
        Solution152 solution152 = new Solution152();
        int[] nums = null;
        int res = solution152.maxProduct(nums);
        assertEquals(0, res);
    }

    @Test
    public void edgeCaseEmpty() {
        Solution152 solution152 = new Solution152();
        int[] nums = new int[]{};
        int res = solution152.maxProduct(nums);
        assertEquals(0, res);
    }

    @Test
    public void baseCase0() {
        Solution152 solution152 = new Solution152();
        int[] nums = new int[]{0};
        int res = solution152.maxProduct(nums);
        assertEquals(0, res);
    }

    @Test
    public void baseCase1() {
        Solution152 solution152 = new Solution152();
        int[] nums = new int[]{1};
        int res = solution152.maxProduct(nums);
        assertEquals(1, res);
    }

    @Test
    public void baseCase_Minus2() {
        Solution152 solution152 = new Solution152();
        int[] nums = new int[]{-2};
        int res = solution152.maxProduct(nums);
        assertEquals(-2, res);
    }


    @Test
    public void baseCase12() {
        Solution152 solution152 = new Solution152();
        int[] nums = new int[]{1, 2};
        int res = solution152.maxProduct(nums);
        assertEquals(2, res);
    }

    @Test
    public void regularCase7023() {
        Solution152 solution152 = new Solution152();
        int[] nums = new int[]{7, 0, 2, 3};
        int res = solution152.maxProduct(nums);
        assertEquals(7, res);
    }

    @Test
    public void regularCase3_64() {
        Solution152 solution152 = new Solution152();
        int[] nums = new int[]{3, -6, 4};
        int res = solution152.maxProduct(nums);
        assertEquals(4, res);
    }

}