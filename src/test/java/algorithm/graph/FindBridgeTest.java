package algorithm.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindBridgeTest {

    @Test
    public void test1() {
        List<List<Integer>> g = new LinkedList<>();
        g.add(new LinkedList<>(Arrays.asList(1)));
        g.add(new LinkedList<>(Arrays.asList(0, 2)));
        g.add(new LinkedList<>(Arrays.asList(1)));

        FindBridge findBridge = new FindBridge();
        List<List<Integer>> bridges = findBridge.findBridge(g);
        System.out.println(bridges);
        assertEquals(bridges.get(0).get(0), Integer.valueOf(1));
        assertEquals(bridges.get(0).get(1), Integer.valueOf(2));
        assertEquals(bridges.get(1).get(0), Integer.valueOf(0));
        assertEquals(bridges.get(1).get(1), Integer.valueOf(1));
    }

    @Test
    public void test2() {
        List<List<Integer>> g = new LinkedList<>();
        g.add(new LinkedList<>(Arrays.asList(1, 2)));
        g.add(new LinkedList<>(Arrays.asList(0, 2)));
        g.add(new LinkedList<>(Arrays.asList(0, 1, 3, 5)));
        g.add(new LinkedList<>(Arrays.asList(2, 4)));
        g.add(new LinkedList<>(Arrays.asList(3)));
        g.add(new LinkedList<>(Arrays.asList(2, 6, 8)));
        g.add(new LinkedList<>(Arrays.asList(5, 7)));
        g.add(new LinkedList<>(Arrays.asList(6, 8)));
        g.add(new LinkedList<>(Arrays.asList(5, 7)));

        FindBridge findBridge = new FindBridge();
        List<List<Integer>> bridges = findBridge.findBridge(g);
        System.out.println(bridges);
        assertEquals(bridges.get(0).get(0), Integer.valueOf(3));
        assertEquals(bridges.get(0).get(1), Integer.valueOf(4));
        assertEquals(bridges.get(1).get(0), Integer.valueOf(2));
        assertEquals(bridges.get(1).get(1), Integer.valueOf(3));
        assertEquals(bridges.get(2).get(0), Integer.valueOf(2));
        assertEquals(bridges.get(2).get(1), Integer.valueOf(5));
    }

}