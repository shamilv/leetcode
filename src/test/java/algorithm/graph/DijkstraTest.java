package algorithm.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DijkstraTest {

    @Test
    public void test1() {
        Dijkstra dijkstra = new Dijkstra();
        int[] ans = dijkstra.dijkstra(new int[][]{{0, 2, 2, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}, {0, 1, 0, 0}}, 4, 0);
        assertArrayEquals(new int[]{0, 2, 2, 3}, ans);
    }

    @Test
    public void test2() {
        Dijkstra dijkstra = new Dijkstra();
        int[] ans = dijkstra.dijkstra(new int[][]{{0, 2, 4, 0, 0, 0}, {0, 0, 1, 7, 0, 0}, {0, 0, 0, 0, 3, 0}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 2, 0, 5}, {0, 0, 0, 0, 0, 0}}, 6, 0);
        assertArrayEquals(new int[]{0, 2, 3, 8, 6, 9}, ans);
    }

    @Test
    public void test3() {
        Dijkstra dijkstra = new Dijkstra();
        int[] ans = dijkstra.dijkstra(new int[][]{{0, 2, 4, 0, 0, 0}, {0, 0, 1, 7, 0, 0}, {0, 0, 0, 0, 3, 0}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 2, 0, 5}, {0, 0, 0, 0, 0, 0}}, 6, 5);
        assertArrayEquals(new int[]{-1, -1, -1, -1, -1, 0}, ans);
    }

}