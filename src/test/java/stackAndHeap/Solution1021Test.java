package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1021Test {

    @Test
    public void test1() {
        Solution1021 solution1021 = new Solution1021();
        String res = solution1021.removeOuterParentheses("(())");
        assertEquals("()", res);
    }

    @Test
    public void test2() {
        Solution1021 solution1021 = new Solution1021();
        String res = solution1021.removeOuterParentheses("()");
        assertEquals("", res);
    }

    @Test
    public void test3() {
        Solution1021 solution1021 = new Solution1021();
        String res = solution1021.removeOuterParentheses("(()())(())");
        assertEquals("()()()", res);
    }

    @Test
    public void test4() {
        Solution1021 solution1021 = new Solution1021();
        String res = solution1021.removeOuterParentheses("(()())(())(()(()))");
        assertEquals("()()()()(())", res);
    }


}