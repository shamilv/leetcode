package algorithm.graph;

import algorithm.graph.DijkstraAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraAlgorithmTest {

    @Test
    public void test1() {
        int[][] A = new int[][]{{1, 2, 2}, {1, 3, 4}, {2, 3, 1}, {2, 4, 7}, {3, 5, 3}, {4, 6, 1}, {5, 4, 2}, {5, 6, 5}};
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        Map<Integer, Integer> ans = dijkstraAlgorithm.findSingleSourceShortestPath(A, 1);
        assertEquals(Integer.valueOf(2), ans.get(2));
        assertEquals(Integer.valueOf(3), ans.get(3));
        assertEquals(Integer.valueOf(8), ans.get(4));
        assertEquals(Integer.valueOf(6), ans.get(5));
        assertEquals(Integer.valueOf(9), ans.get(6));
    }

}