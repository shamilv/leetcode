package algorithm.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindBridgeTest {

    @Test
    public void test1() {
        LinkedList<Integer>[] g = new LinkedList[9];
        g[0] = new LinkedList<>(Arrays.asList(1));
        g[1] = new LinkedList<>(Arrays.asList(2));
        g[2] = new LinkedList<>(Arrays.asList(0, 3, 7));
        g[3] = new LinkedList<>(Arrays.asList(4));
        g[4] = new LinkedList<>(Arrays.asList(5));
        g[5] = new LinkedList<>(Arrays.asList(6));
        g[6] = new LinkedList<>(Arrays.asList(3));
        g[7] = new LinkedList<>(Arrays.asList(8));
        g[8] = new LinkedList<>();
        FindBridge findBridge = new FindBridge();
        Map<Integer, LinkedList<Integer>> b = findBridge.findBridge(g);
        assertEquals(b.get(2), Arrays.asList(3, 7));
        assertEquals(b.get(7), Arrays.asList(8));
    }

}