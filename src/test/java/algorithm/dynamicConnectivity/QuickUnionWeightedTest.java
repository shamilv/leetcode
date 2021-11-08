package algorithm.dynamicConnectivity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickUnionWeightedTest {

    @Test
    public void test1() {
        QuickUnionWeighted quickUnion = new QuickUnionWeighted(10);
        quickUnion.union(4, 3);
        boolean ans = quickUnion.connected(4, 3);
        assertTrue(ans);
    }

    @Test
    public void test2() {
        QuickUnionWeighted quickUnion = new QuickUnionWeighted(10);
        quickUnion.union(4, 3);
        quickUnion.union(5, 4);
        boolean ans = quickUnion.connected(4, 3);
        assertTrue(ans);
        ans = quickUnion.connected(5, 4);
        assertTrue(ans);
        assertEquals(3, quickUnion.A[5]);

        quickUnion.union(7, 6);
        quickUnion.union(7, 8);
        quickUnion.union(9, 7);
        assertEquals(4, quickUnion.size[6]);
        quickUnion.union(8, 4);
        ans = quickUnion.connected(8, 4);
        assertTrue(ans);
        assertEquals(6, quickUnion.A[3]);
        assertEquals(6, quickUnion.A[6]);
        assertEquals(3, quickUnion.size[3]);
        assertEquals(7, quickUnion.size[6]);
    }

    @Test
    public void test3() {
        QuickUnionWeighted quickUnion = new QuickUnionWeighted(10);
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