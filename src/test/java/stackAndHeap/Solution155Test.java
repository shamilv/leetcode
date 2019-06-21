package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution155Test {

    @Test
    public void test() {
        Solution155 solution155 = new Solution155();
        solution155.push(1);
        solution155.push(2);

        int x = solution155.top();
        assertEquals(2, x);

        x = solution155.getMin();
        assertEquals(1, x);

        solution155.pop();

        x = solution155.top();
        assertEquals(1, x);

        x = solution155.getMin();
        assertEquals(1, x);
    }

    @Test
    public void test2() {
        Solution155 solution155 = new Solution155();
        solution155.push(-2);
        solution155.push(0);
        solution155.push(-3);

        int x = solution155.top();
        assertEquals(-3, x);

        x = solution155.getMin();
        assertEquals(-3, x);

        solution155.pop();

        x = solution155.top();
        assertEquals(0, x);

        x = solution155.getMin();
        assertEquals(-2, x);
    }

}