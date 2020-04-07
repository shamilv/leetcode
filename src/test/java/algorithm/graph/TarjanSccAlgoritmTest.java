package algorithm.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class TarjanSccAlgoritmTest {

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
        int[] ids = tarjanSccAlgoritm.stronglyConnectedComponenets(g, 8);
        assertArrayEquals(new int[]{0, 0, 0, 3, 4, 4, 4, 3}, ids);
    }

}