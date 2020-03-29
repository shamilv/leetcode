package crack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Solution3_5Test {

    @Test
    public void test1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        Solution3_5 solution3_5 = new Solution3_5();
        Stack<Integer> sorted = solution3_5.sortStack(stack);
        assertEquals(Integer.valueOf(1), sorted.pop());
    }

    @Test
    public void test2() {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);

        Solution3_5 solution3_5 = new Solution3_5();
        Stack<Integer> sorted = solution3_5.sortStack(stack);
        assertEquals(Integer.valueOf(2), sorted.pop());
        assertEquals(Integer.valueOf(3), sorted.pop());
    }

    @Test
    public void test3() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(2);

        Solution3_5 solution3_5 = new Solution3_5();
        Stack<Integer> sorted = solution3_5.sortStack(stack);
        assertEquals(Integer.valueOf(1), sorted.pop());
        assertEquals(Integer.valueOf(2), sorted.pop());
        assertEquals(Integer.valueOf(3), sorted.pop());
    }

}