package strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution139Test {

    @Test
    public void test() {
        Solution139 solution139 = new Solution139();
        boolean res = solution139.wordBreak("leetcode", Arrays.asList("lee", "leet", "code"));
        assertEquals(true, res);
    }

    @Test
    public void test2() {
        Solution139 solution139 = new Solution139();
        boolean res = solution139.wordBreak("leetcode", Arrays.asList("lee", "leet"));
        assertEquals(false, res);
    }

    @Test
    public void test3() {
        Solution139 solution139 = new Solution139();
        boolean res = solution139.wordBreak("applepenapple", Arrays.asList("apple", "pen"));
        assertEquals(true, res);
    }

    @Test
    public void test4() {
        Solution139 solution139 = new Solution139();
        boolean res = solution139.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"));
        assertEquals(false, res);
    }

}