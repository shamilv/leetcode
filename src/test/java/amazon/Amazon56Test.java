package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon56Test {

    @Test
    public void test1() {
        Amazon56 amazon56 = new Amazon56();
        int[][] ans = amazon56.merge(new int[][] {{2, 3}, {1, 2}});
        assertArrayEquals(new int[]{1, 3}, ans[0]);
    }

    @Test
    public void test2() {
        Amazon56 amazon56 = new Amazon56();
        int[][] ans = amazon56.merge(new int[][] {{2, 3}, {1, 2}, {3, 4}});
        assertArrayEquals(new int[]{1, 4}, ans[0]);
    }

    @Test
    public void test3() {
        Amazon56 amazon56 = new Amazon56();
        int[][] ans = amazon56.merge(new int[][] {{2, 3}, {1, 2}, {5, 6}, {3, 4}});
        assertArrayEquals(new int[]{1, 4}, ans[0]);
        assertArrayEquals(new int[]{5, 6}, ans[1]);
    }

    @Test
    public void test4() {
        Amazon56 amazon56 = new Amazon56();
        int[][] ans = amazon56.merge(new int[][] {{2, 3}, {1, 2}, {5, 8}, {6, 7}, {3, 4}});
        assertArrayEquals(new int[]{1, 4}, ans[0]);
        assertArrayEquals(new int[]{5, 8}, ans[1]);
        assertEquals(2, ans.length);
    }

    @Test
    public void test5() {
        Amazon56 amazon56 = new Amazon56();
        int[][] ans = amazon56.merge(new int[][] {{2, 3}, {1, 2}, {5, 8}, {6, 7}, {3, 4}, {1, 10}});
        assertArrayEquals(new int[]{1, 10}, ans[0]);
        assertEquals(1, ans.length);
    }

}