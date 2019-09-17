package backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution60Test {

    @Test
    public void test1() {
        Solution60 solution60 = new Solution60();
        String ans = solution60.getPermutation(3, 3);

        assertEquals("213", ans);
    }

    @Test
    public void test2() {
        Solution60 solution60 = new Solution60();
        String ans = solution60.getPermutation(4, 9);

        assertEquals("2314", ans);
    }

    @Test
    public void test3() {
        Solution60 solution60 = new Solution60();
        String ans = solution60.getPermutation(4, 10);

        assertEquals("2341", ans);
    }

    @Test
    public void test4() {
        Solution60 solution60 = new Solution60();
        String ans = solution60.getPermutation(3, 5);

        assertEquals("312", ans);
    }

    @Test
    public void test5() {
        Solution60 solution60 = new Solution60();
        String ans = solution60.getPermutation(3, 6);

        assertEquals("321", ans);
    }


}