package _repeatHere;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class GraphDijkstraTest {
    
    @Test
    void testDijkstra() {
        int[][] G = new int[10][3];
        G[0] = new int[]{1, 2, 1};
        G[1] = new int[]{1, 4, 2};
        G[2] = new int[]{2, 3, 5};
        G[3] = new int[]{4, 3, 3};
        G[4] = new int[]{4, 5, 2};
        G[5] = new int[]{3, 6, 3};
        G[6] = new int[]{5, 6, 2};
        GraphDijkstra graphDijkstra = new GraphDijkstra();
        Map<Integer, Integer> ans = graphDijkstra.dijkstra(G, 1);
        assertEquals(Integer.valueOf(0), ans.get(1));
        assertEquals(Integer.valueOf(1), ans.get(2));
        assertEquals(Integer.valueOf(5), ans.get(3));
        assertEquals(Integer.valueOf(2), ans.get(4));
        assertEquals(Integer.valueOf(4), ans.get(5));
        assertEquals(Integer.valueOf(6), ans.get(6));
    }
}
