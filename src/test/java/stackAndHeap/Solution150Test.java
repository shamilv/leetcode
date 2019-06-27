package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution150Test {

    @Test
    public void test1() {
        Solution150 solution150 = new Solution150();
        int res = solution150.evalRPN(new String[]{"1", "2", "+"});
        assertEquals(3, res);
    }

    @Test
    public void test2() {
        Solution150 solution150 = new Solution150();
        int res = solution150.evalRPN(new String[]{"3", "1", "2", "+", "*"});
        assertEquals(9, res);
    }

    @Test
    public void test3() {
        Solution150 solution150 = new Solution150();
        int res = solution150.evalRPN(new String[]{"2", "1", "+", "3", "*"});
        assertEquals(9, res);
    }

    @Test
    public void test4() {
        Solution150 solution150 = new Solution150();
        int res = solution150.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
        assertEquals(22, res);
    }

}