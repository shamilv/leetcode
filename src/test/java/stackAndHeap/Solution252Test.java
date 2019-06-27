package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution252Test {

    @Test
    public void test() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}});
        assertFalse(res);
    }

    @Test
    public void test2() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{5, 10}, {15, 20}});
        assertTrue(res);
    }

    @Test
    public void test3() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{5, 10}, {7, 20}});
        assertFalse(res);
    }

    @Test
    public void test4() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{7, 20}, {0, 5}});
        assertTrue(res);
    }


}