package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon973Test {

    @Test
    public void test1() {
        Amazon973 amazon973 = new Amazon973();
        int[][] ans = amazon973.kClosest(new int[][]{{1,3}, {-2,2}},1);
        assertArrayEquals(new int[]{-2, 2}, ans[0]);
    }

    @Test
    public void test2() {
        Amazon973 amazon973 = new Amazon973();
        int[][] ans = amazon973.kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2);
        assertArrayEquals(new int[]{3, 3}, ans[0]);
        assertArrayEquals(new int[]{-2, 4}, ans[1]);
    }

    @Test
    public void test3() {
        Amazon973 amazon973 = new Amazon973();
        int[][] ans = amazon973.kClosest(new int[][]{{1,3}, {-2,2}, {2,-2}}, 2);
        assertArrayEquals(new int[]{-2, 2}, ans[0]);
        assertArrayEquals(new int[]{2, -2}, ans[1]);
    }

    @Test
    public void test4() {
        Amazon973 amazon973 = new Amazon973();
        int[][] ans = amazon973.kClosest(new int[][]{{2,10}, {-7,-10}, {4,8}, {9,-4}, {-7,-5}, {-1,3}, {-2,-7}, {1,-6}}, 7);
        assertArrayEquals(new int[]{1, -6}, ans[0]);
        assertArrayEquals(new int[]{-2, -7}, ans[1]);
    }

}