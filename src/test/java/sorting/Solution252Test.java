package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution252Test {

    @Test
    public void test1() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{1, 45}, {1, 20}, {0, 30}});
        assertFalse(res);
    }

    @Test
    public void test2() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{1, 45}, {1, 20}});
        assertFalse(res);
    }

    @Test
    public void test3() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{1, 10}, {15, 20}});
        assertTrue(res);
    }

    @Test
    public void test4() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{1, 10}});
        assertTrue(res);
    }

    @Test
    public void test5() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{5, 8}, {6, 8}});
        assertFalse(res);
    }

    @Test
    public void test6() {
        Solution252 solution252 = new Solution252();
        boolean res = solution252.canAttendMeetings(new int[][]{{8, 10}, {6, 8}});
        assertTrue(res);
    }

}