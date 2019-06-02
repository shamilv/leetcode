package strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution212Test {

    @Test
    public void test() {
        char[][] board = new char[][]{{'o','a','a','n'}, {'e','t','a','e'}, {'i','h','k','r'}, {'i','f','l','v'}};
        Solution212 solution212 = new Solution212();
        List<String> res = solution212.findWords(board, new String[]{"oath", "pea", "eat", "rain"});
        assertEquals(Arrays.asList("oath", "eat"), res);
    }

    @Test
    public void test2() {
        char[][] board = new char[][]{{'o','a','a','n'}, {'e','t','a','e'}, {'i','h','k','r'}, {'i','f','l','v'}};
        Solution212 solution212 = new Solution212();
        List<String> res = solution212.findWords(board, new String[]{"pea", "rain"});
        assertEquals(Arrays.asList(), res);
    }

    @Test
    public void test3() {
        char[][] board = new char[][]{{'a','a','a'}};
        Solution212 solution212 = new Solution212();
        List<String> res = solution212.findWords(board, new String[]{"a"});
        assertEquals(Arrays.asList("a"), res);
    }

    @Test
    public void test4() {
        char[][] board = new char[][]{{'o','h'}, {'a','l'}};
        Solution212 solution212 = new Solution212();
        List<String> res = solution212.findWords(board, new String[]{"oala"});
        assertEquals(Arrays.asList(), res);
    }

    @Test
    public void test5() {
        char[][] board = new char[][]{{'a','b'}, {'a','a'}};
        Solution212 solution212 = new Solution212();
        List<String> res = solution212.findWords(board, new String[]{"aba","baa","bab","aaab","aaa","aaaa","aaba"});
        assertEquals(Arrays.asList("aba", "baa", "aaab", "aaa", "aaba"), res);
    }
}