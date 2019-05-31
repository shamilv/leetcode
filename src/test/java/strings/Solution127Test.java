package strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution127Test {

    @Test
    public void edgeCase() {
        Solution127 solution127 = new Solution127();
        int res = solution127.ladderLength("hip", "hop", Arrays.asList("hot"));
        assertEquals(0, res);
    }

    @Test
    public void baseCase1() {
        Solution127 solution127 = new Solution127();
        int res = solution127.ladderLength("hip", "hop", Arrays.asList("hop"));
        assertEquals(2, res);
    }

    @Test
    public void baseCase2() {
        Solution127 solution127 = new Solution127();
        int res = solution127.ladderLength("hat", "hop", Arrays.asList("hop"));
        assertEquals(0, res);
    }

    @Test
    public void regularCase1() {
        Solution127 solution127 = new Solution127();
        int res = solution127.ladderLength("hit", "hop", Arrays.asList("hot", "hop", "hat"));
        assertEquals(3, res);
    }

    @Test
    public void regularCase2() {
        Solution127 solution127 = new Solution127();
        int res = solution127.ladderLength("aa", "cc", Arrays.asList("cc", "ab", "cb"));
        assertEquals(4, res);
    }

    @Test
    public void regularCase3() {
        Solution127 solution127 = new Solution127();
        int res = solution127.ladderLength("aa", "cc", Arrays.asList("cc", "ab", "cb", "ac"));
        assertEquals(3, res);
    }

}