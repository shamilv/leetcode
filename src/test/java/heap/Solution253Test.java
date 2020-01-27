package heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution253Test {

    @Test
    public void test1() {
        Solution253 solution253 = new Solution253();
        int ans = solution253.minMeetingRooms(new int[][]{{0,30},{15,20}, {5,10}});
        assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution253 solution253 = new Solution253();
        int ans = solution253.minMeetingRooms(new int[][]{{0,10},{10,15}});
        assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Solution253 solution253 = new Solution253();
        int ans = solution253.minMeetingRooms(new int[][]{{0,10},{11,15}});
        assertEquals(1, ans);
    }

    @Test
    public void test4() {
        Solution253 solution253 = new Solution253();
        int ans = solution253.minMeetingRooms(new int[][]{{0,20},{5,10},{15,20}});
        assertEquals(2, ans);
    }

    @Test
    public void test5() {
        Solution253 solution253 = new Solution253();
        int ans = solution253.minMeetingRooms(new int[][]{{0,20},{5,10},{15,25}, {20, 30}});
        assertEquals(2, ans);
    }

    @Test
    public void test6() {
        Solution253 solution253 = new Solution253();
        int ans = solution253.minMeetingRooms(new int[][]{{0,20},{5,10},{15,25}, {30, 50}, {35, 55}});
        assertEquals(2, ans);
    }

    @Test
    public void test7() {
        Solution253 solution253 = new Solution253();
        int ans = solution253.minMeetingRooms(new int[][]{{0,20}});
        assertEquals(1, ans);
    }

    @Test
    public void test8() {
        Solution253 solution253 = new Solution253();
        int ans = solution253.minMeetingRooms(new int[][]{{13,15},{1,13}});
        assertEquals(1, ans);
    }

}