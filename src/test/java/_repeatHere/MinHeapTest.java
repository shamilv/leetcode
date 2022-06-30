package _repeatHere;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class MinHeapTest {

    @Test
    public void test1() {
        MinHeap minHeap = new MinHeap();
        minHeap.add(10);
        int ans = minHeap.pop();
        assertEquals(ans, 10);
        assertNull(minHeap.peek());
    }

    @Test
    public void test2() {
        MinHeap minHeap = new MinHeap();
        minHeap.add(10);
        minHeap.add(7);
        assertEquals(minHeap.pop(), 7);
        assertEquals(minHeap.pop(), 10);
        assertNull(minHeap.peek());
    }

    @Test
    public void test3() {
        MinHeap minHeap = new MinHeap();
        minHeap.add(10);
        minHeap.add(7);
        minHeap.add(6);
        assertEquals(minHeap.pop(), 6);
        assertEquals(minHeap.pop(), 7);
        assertEquals(minHeap.pop(), 10);
        assertNull(minHeap.peek());
    }

    @Test
    public void test4() {
        MinHeap minHeap = new MinHeap();
        minHeap.add(10);
        minHeap.add(8);
        minHeap.add(16);
        minHeap.add(50);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(15);
        assertEquals(8, minHeap.pop());
        assertEquals(10, minHeap.pop());
        assertEquals(15, minHeap.pop());
        assertEquals(16, minHeap.pop());
        assertEquals(20, minHeap.pop());
        assertEquals(30, minHeap.pop());
        assertEquals(50, minHeap.pop());
        assertNull(minHeap.peek());
    }

}
