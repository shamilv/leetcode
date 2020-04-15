package algorithm.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class TarjanSccAlgoritmTest {

    @Test
    public void test0() {
        TarjanSccAlgoritm tarjanSccAlgoritm = new TarjanSccAlgoritm();
        LinkedList<Integer>[] g = new LinkedList[1];
        g[0] = new LinkedList<>();
        int[] lowLinks = tarjanSccAlgoritm.stronglyConnectedComponents(g);
        assertArrayEquals(new int[]{0}, lowLinks);
    }

    @Test
    public void test1() {
        TarjanSccAlgoritm tarjanSccAlgoritm = new TarjanSccAlgoritm();
        LinkedList<Integer>[] g = new LinkedList[8];
        g[0] = new LinkedList<>(Arrays.asList(1));
        g[1] = new LinkedList<>(Arrays.asList(2));
        g[2] = new LinkedList<>(Arrays.asList(0));
        g[3] = new LinkedList<>(Arrays.asList(4, 7));
        g[4] = new LinkedList<>(Arrays.asList(6));
        g[5] = new LinkedList<>(Arrays.asList(0, 2, 4));
        g[6] = new LinkedList<>(Arrays.asList(0, 5));
        g[7] = new LinkedList<>(Arrays.asList(3, 6));
        int[] lowLinks = tarjanSccAlgoritm.stronglyConnectedComponents(g);
        assertArrayEquals(new int[]{0, 0, 0, 3, 4, 4, 4, 3}, lowLinks);
    }

    @Test
    public void test2() {
        TarjanSccAlgoritm tarjanSccAlgoritm = new TarjanSccAlgoritm();
        LinkedList<Integer>[] g = new LinkedList[6];
        g[0] = new LinkedList<>(Arrays.asList(5));
        g[1] = new LinkedList<>(Arrays.asList(2, 3));
        g[2] = new LinkedList<>(Arrays.asList(0, 3, 4));
        g[3] = new LinkedList<>(Arrays.asList(5));
        g[4] = new LinkedList<>(Arrays.asList(1));
        g[5] = new LinkedList<>(Arrays.asList(3));
        int[] lowLinks = tarjanSccAlgoritm.stronglyConnectedComponents(g);
        assertArrayEquals(new int[]{0, 3, 3, 1, 3, 1}, lowLinks);
    }

    @Test
    public void testButterfly() {
        TarjanSccAlgoritm tarjanSccAlgoritm = new TarjanSccAlgoritm();
        LinkedList<Integer>[] g = new LinkedList[5];
        g[0] = new LinkedList<>(Arrays.asList(1));
        g[1] = new LinkedList<>(Arrays.asList(2));
        g[2] = new LinkedList<>(Arrays.asList(0));
        g[3] = new LinkedList<>(Arrays.asList(1, 4));
        g[4] = new LinkedList<>(Arrays.asList(1));
        int[] lowLinks = tarjanSccAlgoritm.stronglyConnectedComponents(g);
        assertArrayEquals(new int[]{0, 0, 0, 3, 4}, lowLinks);
    }

}