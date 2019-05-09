package backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution22Test {

    @Test
    public void edgeCase() {
        Solution22 solution22 = new Solution22();
        List<String> res = solution22.generateParenthesis(0);
        List<String> exp = Collections.emptyList();
        assertEquals(exp, res);
    }

    @Test
    public void baseCase1() {
        Solution22 solution22 = new Solution22();
        List<String> res = solution22.generateParenthesis(1);
        List<String> exp = Arrays.asList("()");
        assertEquals(exp, res);
    }

    @Test
    public void regularCase2() {
        Solution22 solution22 = new Solution22();
        List<String> res = solution22.generateParenthesis(2);
        List<String> exp = Arrays.asList("(())", "()()");
        assertEquals(exp, res);
    }

    @Test
    public void regularCase3() {
        Solution22 solution22 = new Solution22();
        List<String> res = solution22.generateParenthesis(3);
        List<String> exp = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(exp, res);
    }

}