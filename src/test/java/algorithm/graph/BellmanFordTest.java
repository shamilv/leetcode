package algorithm.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BellmanFordTest {

    @Test
    public void test1() {
        int[][] E = new int[][]{{0, 1, 1}, {0, 2, 1}, {2, 3, 1}, {3, 1, 1}};
        BellmanFord bellmanFord = new BellmanFord();
        Integer[] d = bellmanFord.bellmanFord(E, 4, 0);
        assertArrayEquals(new Integer[]{0, 1, 1, 2}, d);
    }

    @Test
    public void test2() {
        int[][] E = new int[][]{{0, 1, 4}, {0, 2, 1}, {2, 3, 1}, {3, 1, 1}};
        BellmanFord bellmanFord = new BellmanFord();
        Integer[] d = bellmanFord.bellmanFord(E, 4, 0);
        assertArrayEquals(new Integer[]{0, 3, 1, 2}, d);
    }

    @Test
    public void test3() {
        int[][] E = new int[][]{{0, 1, 2}, {0, 2, 1}, {2, 3, 1}, {3, 1, -1}};
        BellmanFord bellmanFord = new BellmanFord();
        Integer[] d = bellmanFord.bellmanFord(E, 4, 0);
        assertArrayEquals(new Integer[]{0, 1, 1, 2}, d);
    }

    @Test
    public void test4() {
        int[][] E = new int[][]{{0, 1, 2}, {0, 2, 1}, {1, 2, -1}, {2, 3, 1}, {3, 1, -1}};
        BellmanFord bellmanFord = new BellmanFord();
        Integer[] d = bellmanFord.bellmanFord(E, 4, 0);
        assertNull(d);
    }

}