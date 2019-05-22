package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution768Test {

    @Test
    public void baseCase1() {
        Solution768 solution768 = new Solution768();
        int res = solution768.maxChunksToSorted(new int[]{1});
        assertEquals(1, res);
    }

    @Test
    public void baseCase2() {
        Solution768 solution768 = new Solution768();
        int res = solution768.maxChunksToSorted(new int[]{1, 1});
        assertEquals(2, res);
    }

    @Test
    public void baseCase3() {
        Solution768 solution768 = new Solution768();
        int res = solution768.maxChunksToSorted(new int[]{1, 2});
        assertEquals(2, res);
    }

    @Test
    public void baseCase4() {
        Solution768 solution768 = new Solution768();
        int res = solution768.maxChunksToSorted(new int[]{2, 1});
        assertEquals(1, res);
    }

    @Test
    public void baseCase5() {
        Solution768 solution768 = new Solution768();
        int res = solution768.maxChunksToSorted(new int[]{2, 2, 1});
        assertEquals(1, res);
    }

    @Test
    public void regularCase1() {
        Solution768 solution768 = new Solution768();
        int res = solution768.maxChunksToSorted(new int[]{0, 3, 3, 2, 1, 4, 5, 7, 6});
        assertEquals(5, res);
    }

    @Test
    public void regularCase2() {
        Solution768 solution768 = new Solution768();
        int res = solution768.maxChunksToSorted(new int[]{4, 2, 2, 1, 1});
        assertEquals(1, res);
    }

    @Test
    public void regularCase3() {
        Solution768 solution768 = new Solution768();
        int res = solution768.maxChunksToSorted(new int[]{0, 3, 0, 3, 2});
        assertEquals(2, res);
    }

    @Test
    public void regularCase4() {
        Solution768 solution768 = new Solution768();
        int res = solution768.maxChunksToSorted(new int[]{1, 1, 0, 0, 1});
        assertEquals(2, res);
    }

}