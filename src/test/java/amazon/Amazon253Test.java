package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//[1, 2], [3, 4]
//[1, 3], [3, 4] -> [3, 4], [1, 3]
//[1, 7], [2, 6], [3, 5] -> [1, 7], [2, 6], [3, 5]
//[1, 7], [2, 3], [4, 5] -> [1, 7], [4, 5], [2, 3]

class Amazon253Test {

    @Test
    public void test1() {
        Amazon253 amazon253 = new Amazon253();
        int ans = amazon253.minMeetingRooms(new int[][]{{1, 2}, {3, 4}});
        assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Amazon253 amazon253 = new Amazon253();
        int ans = amazon253.minMeetingRooms(new int[][]{{1, 3}, {3, 4}});
        assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Amazon253 amazon253 = new Amazon253();
        int ans = amazon253.minMeetingRooms(new int[][]{{1, 7}, {2, 6}, {3, 5}});
        assertEquals(3, ans);
    }

    @Test
    public void test4() {
        Amazon253 amazon253 = new Amazon253();
        int ans = amazon253.minMeetingRooms(new int[][]{{1, 7}, {2, 3}, {4, 5}});
        assertEquals(2, ans);
    }

    @Test
    public void test5() {
        Amazon253 amazon253 = new Amazon253();
        int ans = amazon253.minMeetingRooms(new int[][]{{1, 7}, {2, 3}, {4, 6}, {5, 8}});
        assertEquals(3, ans);
    }

    @Test
    public void test6() {
        Amazon253 amazon253 = new Amazon253();
        int ans = amazon253.minMeetingRooms(new int[][]{{1, 7}, {2, 5}, {4, 7}, {6, 8}, {7, 9}});
        assertEquals(3, ans);
    }

}