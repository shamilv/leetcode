package _repeatHere;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GraphTopologicalOrderTest {

    @Test
    public void test1() {
        int[][] G = new int[7][2];
        G[0] = new int[]{1, 2};
        G[1] = new int[]{1, 4};
        G[2] = new int[]{2, 3};
        G[3] = new int[]{4, 3};
        G[4] = new int[]{4, 5};
        G[5] = new int[]{3, 6};
        G[6] = new int[]{5, 6};
        GraphTopologicalOrder graphTopologicalOrder = new GraphTopologicalOrder();
        List<Integer> ordered = graphTopologicalOrder.topologicalSort(G);
        assertEquals(Arrays.asList(1, 4, 5, 2, 3, 6), ordered);
    }

    @Test
    public void test2() {
        int[][] G = new int[8][2];
        G[0] = new int[]{1, 2};
        G[1] = new int[]{1, 4};
        G[2] = new int[]{2, 3};
        G[3] = new int[]{4, 3};
        G[4] = new int[]{4, 5};
        G[5] = new int[]{3, 6};
        G[6] = new int[]{5, 6};
        G[7] = new int[]{7, 5};
        GraphTopologicalOrder graphTopologicalOrder = new GraphTopologicalOrder();
        List<Integer> ordered = graphTopologicalOrder.topologicalSort(G);
        assertEquals(Arrays.asList(1, 4, 5, 2, 3, 6, 7), ordered);
    }

    @Test
    public void test3() {
        int[][] G = new int[8][2];
        G[0] = new int[]{1, 2};
        G[1] = new int[]{1, 4};
        G[2] = new int[]{2, 3};
        G[3] = new int[]{4, 3};
        G[4] = new int[]{4, 5};
        G[5] = new int[]{3, 6};
        G[6] = new int[]{5, 6};
        G[7] = new int[]{7, 5};
        GraphTopologicalOrder graphTopologicalOrder = new GraphTopologicalOrder();
        List<Integer> ordered = graphTopologicalOrder.topologicalSort(G);
        assertEquals(Arrays.asList(1, 4, 5, 2, 3, 6, 7), ordered);
    }

    @Test
    public void test4() {
        int[][] G = new int[7][2];
        G[0] = new int[]{1, 2};
        G[1] = new int[]{1, 4};
        G[2] = new int[]{2, 3};
        G[3] = new int[]{4, 3};     
        G[4] = new int[]{3, 6};
        G[5] = new int[]{6, 5};
        G[6] = new int[]{5, 4};
   
        GraphTopologicalOrder graphTopologicalOrder = new GraphTopologicalOrder();
        List<Integer> ordered = graphTopologicalOrder.topologicalSort(G);
        assertEquals(Collections.emptyList(), ordered);
    }

    @Test
    public void test5() {
        int[][] G = new int[6][2];
        G[0] = new int[]{5, 0};
        G[1] = new int[]{5, 2};
        G[2] = new int[]{2, 3};
        G[3] = new int[]{3, 1};     
        G[4] = new int[]{4, 0};
        G[5] = new int[]{4, 1};
    
   
        GraphTopologicalOrder graphTopologicalOrder = new GraphTopologicalOrder();
        List<Integer> ordered = graphTopologicalOrder.topologicalSort(G);
        assertEquals(Arrays.asList(5, 4, 2, 0, 3, 1), ordered);
    }

}
