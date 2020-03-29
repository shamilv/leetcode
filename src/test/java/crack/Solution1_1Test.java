package crack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1_1Test {

    @Test
    public void test1() {
        Solution1_1 solution1_1 = new Solution1_1();
        boolean ans = solution1_1.ifUnique2("a");
        assertTrue(ans);
        ans = solution1_1.ifUnique1("a");
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution1_1 solution1_1 = new Solution1_1();
        boolean ans = solution1_1.ifUnique2("aba");
        assertFalse(ans);
        ans = solution1_1.ifUnique1("aba");
        assertFalse(ans);
    }

    @Test
    public void test3() {
        Solution1_1 solution1_1 = new Solution1_1();
        boolean ans = solution1_1.ifUnique2("abc");
        assertTrue(ans);
        ans = solution1_1.ifUnique1("abc");
        assertTrue(ans);
    }
}