package algorithm.dynamicConnectivity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickFindTest {

    @Test
    public void test1() {
        QuickFind quickFind = new QuickFind(10);
        quickFind.union(4, 3);
        boolean ans = quickFind.connected(4, 3);
        assertTrue(ans);
    }

    @Test
    public void test2() {
        QuickFind quickFind = new QuickFind(10);
        quickFind.union(4, 3);
        quickFind.union(3, 8);
        boolean ans = quickFind.connected(3, 8);
        assertTrue(ans);
        ans = quickFind.connected(4, 8);
        assertTrue(ans);
        ans = quickFind.connected(5, 8);
        assertFalse(ans);
    }

}