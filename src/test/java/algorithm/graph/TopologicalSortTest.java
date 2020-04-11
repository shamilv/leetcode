package algorithm.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class TopologicalSortTest {

    @Test
    public void test1() {
        LinkedList<Integer>[] g = new LinkedList[5];
        g[0] = new LinkedList<>(Arrays.asList(1, 2));
        g[1] = new LinkedList<>(Arrays.asList(4));
        g[2] = new LinkedList<>(Arrays.asList(3, 4));
        g[3] = new LinkedList<>(Arrays.asList(4));
        g[4] = new LinkedList<>();
        TopologicalSort topologicalSort = new TopologicalSort();
        int[] sorted = topologicalSort.topologicalSort(g);
        assertArrayEquals(new int[]{0, 2, 3, 1, 4}, sorted);
    }

}