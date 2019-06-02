package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution165Test {

    @Test
    public void baseCase1() {
        Solution165 solution165 = new Solution165();
        int res = solution165.compareVersion("1", "1");
        assertEquals(0, res);
    }

    @Test
    public void baseCase2() {
        Solution165 solution165 = new Solution165();
        int res = solution165.compareVersion("2", "1");
        assertEquals(1, res);
    }

    @Test
    public void baseCase3() {
        Solution165 solution165 = new Solution165();
        int res = solution165.compareVersion("1", "2");
        assertEquals(-1, res);
    }

    @Test
    public void regularCase1() {
        Solution165 solution165 = new Solution165();
        int res = solution165.compareVersion("1.0.1", "1.0.2");
        assertEquals(-1, res);
    }

    @Test
    public void regularCase2() {
        Solution165 solution165 = new Solution165();
        int res = solution165.compareVersion("1.0.2", "1.0.1");
        assertEquals(1, res);
    }

    @Test
    public void regularCase3() {
        Solution165 solution165 = new Solution165();
        int res = solution165.compareVersion("1.0.2", "1.0.2");
        assertEquals(0, res);
    }

    @Test
    public void regularCase4() {
        Solution165 solution165 = new Solution165();
        int res = solution165.compareVersion("1", "1.0.2");
        assertEquals(-1, res);
    }

    @Test
    public void regularCase5() {
        Solution165 solution165 = new Solution165();
        int res = solution165.compareVersion("1", "1.0.0");
        assertEquals(0, res);
    }

}