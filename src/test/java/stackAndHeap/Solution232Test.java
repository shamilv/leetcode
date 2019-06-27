package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution232Test {

    @Test
    public void test() {
        Solution232 solution232 = new Solution232();
        solution232.push(1);
        solution232.push(2);
        solution232.push(3);

        assertFalse(solution232.empty());
        assertEquals(solution232.peek(), 1);
        assertFalse(solution232.empty());
        assertEquals(solution232.pop(), 1);
        assertEquals(solution232.peek(), 2);
        assertEquals(solution232.pop(), 2);
        assertEquals(solution232.peek(), 3);
        assertEquals(solution232.pop(), 3);
        assertTrue(solution232.empty());
    }

}