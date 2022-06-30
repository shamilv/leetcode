package _repeatHere;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class GraphTraversalTest {

    @Test
    public void test1() {
        GraphTraversal graphTraversal = new GraphTraversal(6);
        graphTraversal.addEdge(0, 1);
        graphTraversal.addEdge(1, 2);
        graphTraversal.addEdge(1, 3);
        graphTraversal.addEdge(3, 2);
        graphTraversal.addEdge(3, 5);
        graphTraversal.addEdge(4, 3);
        graphTraversal.addEdge(4, 0);
        List<Integer> path = graphTraversal.dfs();
        assertEquals(Arrays.asList(0, 1, 2, 3, 5, 4), path);
    }

    @Test
    public void test2() {
        GraphTraversal graphTraversal = new GraphTraversal(6);
        graphTraversal.addEdge(0, 1);
        graphTraversal.addEdge(0, 4);
        graphTraversal.addEdge(1, 2);
        graphTraversal.addEdge(1, 3);
        graphTraversal.addEdge(3, 2);
        graphTraversal.addEdge(3, 5);
        graphTraversal.addEdge(4, 3);
        List<Integer> path = graphTraversal.bfs();
        assertEquals(Arrays.asList(0, 1, 4, 2, 3, 5), path);
    }

}
