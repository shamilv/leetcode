package algorithm.dynamicConnectivity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickUnionTest {

    @Test
    public void test1() {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(4, 3);
        boolean ans = quickUnion.connected(4, 3);
        assertTrue(ans);
    }

    @Test
    public void test2() {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(4, 3);
        quickUnion.union(5, 4);
        boolean ans = quickUnion.connected(4, 3);
        assertTrue(ans);
        assertEquals(quickUnion.A[5], 3);
    }

    @Test
    public void test3() {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(4, 3);
        quickUnion.union(3, 8);
        boolean ans = quickUnion.connected(3, 8);
        assertTrue(ans);
        ans = quickUnion.connected(4, 8);
        assertTrue(ans);
        ans = quickUnion.connected(5, 8);
        assertFalse(ans);
    }

}