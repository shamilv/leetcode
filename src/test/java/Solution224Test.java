import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution224Test {

    @Test
    public void test() {
        Solution224 solution = new Solution224();
        int ans = solution.calculate("1+2");
        assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution224 solution = new Solution224();
        int ans = solution.calculate("1+2+3");
        assertEquals(6, ans);
    }

    @Test
    public void test3() {
        Solution224 solution = new Solution224();
        int ans = solution.calculate("(1+2)+3");
        assertEquals(6, ans);
    }

    @Test
    public void test4() {
        Solution224 solution = new Solution224();
        int ans = solution.calculate("((1+2)+3)");
        assertEquals(6, ans);
    }

    @Test
    public void test5() {
        Solution224 solution = new Solution224();
        int ans = solution.calculate("(1+2 )+3");
        assertEquals(6, ans);
    }

    @Test
    public void test6() {
        Solution224 solution = new Solution224();
        int ans = solution.calculate("(1+(4+5+2)-3)+(6+8)");
        assertEquals(23, ans);
    }

}