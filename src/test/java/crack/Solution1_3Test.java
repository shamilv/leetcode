package crack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1_3Test {

    @Test
    public void test1() {
        Solution1_3 solution1_3 = new Solution1_3();
        char[] ans = solution1_3.urlify(new char[]{'a', ' ', 'b', '\r', '\r'}, 3);
        char[] exp = new char[]{'a', '%', '2', '0', 'b'};
        assertArrayEquals(exp, ans);
    }

    @Test
    public void test2() {
        Solution1_3 solution1_3 = new Solution1_3();
        char[] ans = solution1_3.urlify(new char[]{'a', ' ', ' ', '\r', '\r', '\r', '\r'}, 3);
        char[] exp = new char[]{'a', '%', '2', '0', '%', '2', '0',};
        assertArrayEquals(exp, ans);
    }

    @Test
    public void test3() {
        Solution1_3 solution1_3 = new Solution1_3();
        char[] ans = solution1_3.urlify(new char[]{' ', 'a', ' ', '\r', '\r', '\r', '\r'}, 3);
        char[] exp = new char[]{'%', '2', '0', 'a', '%', '2', '0',};
        assertArrayEquals(exp, ans);
    }

}