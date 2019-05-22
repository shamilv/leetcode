package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution769Test {

    @Test
    public void baseCase1() {
        Solution769 solution769 = new Solution769();
        int res = solution769.maxChunksToSorted(new int[]{0});
        assertEquals(1, res);
    }

    @Test
    public void regularCase1() {
        Solution769 solution769 = new Solution769();
        int res = solution769.maxChunksToSorted(new int[]{0, 1, 2, 3});
        assertEquals(4, res);
    }

    @Test
    public void regularCase2() {
        Solution769 solution769 = new Solution769();
        int res = solution769.maxChunksToSorted(new int[]{0, 2, 5, 3, 4, 1, 6, 8, 7, 9});
        assertEquals(5, res);
    }

    @Test
    public void regularCase3() {
        Solution769 solution769 = new Solution769();
        int res = solution769.maxChunksToSorted(new int[]{4, 3, 2, 1, 0});
        assertEquals(1, res);
    }

    @Test
    public void regularCase4() {
        Solution769 solution769 = new Solution769();
        int res = solution769.maxChunksToSorted(new int[]{1, 0, 2, 3, 4});
        assertEquals(4, res);
    }

}