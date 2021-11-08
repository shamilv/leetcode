import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1730Test {

    @Test
    public void test1() {
        char[][] grid = new char[][]{{'X','X','X','X','X','X'},{'X','*','O','O','O','X'},{'X','O','O','#','O','X'},{'X','X','X','X','X','X'}};
        Solution1730 solution1730 = new Solution1730();
        int ans = solution1730.getFood(grid);
        assertEquals(3, ans);
    }

    @Test
    public void test2() {
        char[][] grid = new char[][]{{'X','X','X','X','X'},{'X','*','X','O','X'},{'X','O','X','#','X'},{'X','X','X','X','X'}};
        Solution1730 solution1730 = new Solution1730();
        int ans = solution1730.getFood(grid);
        assertEquals(-1, ans);
    }

    @Test
    public void test3() {
        char[][] grid = new char[][]{{'O','O','O','O','#','O'},{'O','*','O','O','O','O'},{'O','O','O','O','O','#'}};
        Solution1730 solution1730 = new Solution1730();
        int ans = solution1730.getFood(grid);
        assertEquals(4, ans);
    }

    @Test
    public void test4() {
        char[][] grid = new char[][]{{'X','X','X','X','X','X','X','X'},{'X','*','O','X','O','#','O','X'},{'X','O','O','X','O','O','X','X'},{'X','O','O','O','O','#','O','X'},{'X','X','X','X','X','X','X','X'}};
        Solution1730 solution1730 = new Solution1730();
        int ans = solution1730.getFood(grid);
        assertEquals(6, ans);
    }

    @Test
    public void test5() {
        char[][] grid = new char[][]{{'O','*'},{'#','O'}};
        Solution1730 solution1730 = new Solution1730();
        int ans = solution1730.getFood(grid);
        assertEquals(2, ans);
    }

    @Test
    public void test6() {
        char[][] grid = new char[][]{{'X','*'},{'#','X'}};
        Solution1730 solution1730 = new Solution1730();
        int ans = solution1730.getFood(grid);
        assertEquals(-1, ans);
    }

}