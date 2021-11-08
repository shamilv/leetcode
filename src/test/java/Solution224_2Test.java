import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution224_2Test {

    @Test
    public void test() {
        Solution224_2 solution = new Solution224_2();
        int ans = solution.calculate("1+2");
        assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution224_2 solution = new Solution224_2();
        int ans = solution.calculate("(1+2)");
        assertEquals(3, ans);
    }

    @Test
    public void test3() {
        Solution224_2 solution = new Solution224_2();
        int ans = solution.calculate("((10 + 20))");
        assertEquals(30, ans);
    }

    @Test
    public void test4() {
        Solution224_2 solution = new Solution224_2();
        int ans = solution.calculate(" 2-1 + 2 ");
        assertEquals(3, ans);
    }

    @Test
    public void test5() {
        Solution224_2 solution = new Solution224_2();
        int ans = solution.calculate("(1+(4+5+2)-3)+(6+8)");
        assertEquals(23, ans);
    }

    @Test
    public void test6() {
        Solution224_2 solution = new Solution224_2();
        int ans = solution.calculate("0");
        assertEquals(0, ans);
    }

    @Test
    public void test7() {
        Solution224_2 solution = new Solution224_2();
        int ans = solution.calculate("(0 )");
        assertEquals(0, ans);
    }

    @Test
    public void test8() {
        Solution224_2 solution = new Solution224_2();
        int ans = solution.calculate("((0 + 1) )");
        assertEquals(1, ans);
    }
}