package _repeatHere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSelectTest {

    @Test
    public void test1() {
        int[] A = new int[]{7, 8, 9, 5, 4, 1, 3};
        QuickSelect quickSelect = new QuickSelect();
        quickSelect.quickSelect(A, 3);
        assertTrue(A[0] < 5);
        assertTrue(A[1] < 5);
        assertTrue(A[2] < 5);
    }

}