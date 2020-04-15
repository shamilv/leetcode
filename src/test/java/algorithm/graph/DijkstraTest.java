package algorithm.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DijkstraTest {

    @Test
    public void test1() {
        Dijkstra dijkstra = new Dijkstra();
        Integer[] ans = dijkstra.dijkstra(new int[][]{{-1, 2, 2, -1}, {-1, -1, -1, -1}, {-1, -1, -1, 1}, {-1, 1, -1, -1}}, 0);
        assertArrayEquals(new Integer[]{0, 2, 2, 3}, ans);
    }

    @Test
    public void test2() {
        Dijkstra dijkstra = new Dijkstra();
        Integer[] ans = dijkstra.dijkstra(new int[][]{{-1, 2, 4, -1, -1, -1}, {-1, -1, 1, 7, -1, -1}, {-1, -1, -1, -1, 3, -1}, {-1, -1, -1, -1, -1, 1}, {-1, -1, -1, 2, -1, 5}, {-1, -1, -1, -1, -1, -1}}, 0);
        assertArrayEquals(new Integer[]{0, 2, 3, 8, 6, 9}, ans);
    }

    @Test
    public void test3() {
        Dijkstra dijkstra = new Dijkstra();
        Integer[] ans = dijkstra.dijkstra(new int[][]{{-1, 2, 4, -1, -1, -1}, {-1, -1, 1, 7, -1, -1}, {-1, -1, -1, -1, 3, -1}, {-1, -1, -1, -1, -1, 1}, {-1, -1, -1, 2, -1, 5}, {-1, -1, -1, -1, -1, -1}},  5);
        assertArrayEquals(new Integer[]{null, null, null, null, null, 0}, ans);
    }

}