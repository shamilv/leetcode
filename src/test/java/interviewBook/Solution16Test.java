package interviewBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution16Test {

    @Test
    public void test1() {
        Solution16 solution16 = new Solution16();
        String ans = solution16.compressString("a");
        assertEquals("a", ans);
    }

    @Test
    public void test2() {
        Solution16 solution16 = new Solution16();
        String ans = solution16.compressString("aa");
        assertEquals("aa", ans);
    }

    @Test
    public void test3() {
        Solution16 solution16 = new Solution16();
        String ans = solution16.compressString("aaa");
        assertEquals("a3", ans);
    }

    @Test
    public void test4() {
        Solution16 solution16 = new Solution16();
        String ans = solution16.compressString("abbbcc");
        assertEquals("abbbcc", ans);
    }

    @Test
    public void test5() {
        Solution16 solution16 = new Solution16();
        String ans = solution16.compressString("abbbbcc");
        assertEquals("a1b4c2", ans);
    }
}