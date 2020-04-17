package graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution1192Test {

    @Test
    public void test1() {
        List<List<Integer>> connections = new LinkedList<>();
        connections.add(Arrays.asList(0, 1));
        Solution1192 solution1192 = new Solution1192();
        List<List<Integer>> bridges = solution1192.criticalConnections(2, connections);

        System.out.println(bridges);
        assertEquals(bridges.get(0).get(0), Integer.valueOf(0));
        assertEquals(bridges.get(0).get(1), Integer.valueOf(1));
    }

    @Test
    public void test2() {
        List<List<Integer>> connections = new LinkedList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        Solution1192 solution1192 = new Solution1192();
        List<List<Integer>> bridges = solution1192.criticalConnections(3, connections);

        System.out.println(bridges);
        assertEquals(bridges.get(0).get(0), Integer.valueOf(1));
        assertEquals(bridges.get(0).get(1), Integer.valueOf(2));
        assertEquals(bridges.get(1).get(0), Integer.valueOf(0));
        assertEquals(bridges.get(1).get(1), Integer.valueOf(1));
    }

    @Test
    public void test3() {
        List<List<Integer>> connections = new LinkedList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(0, 2));
        Solution1192 solution1192 = new Solution1192();
        List<List<Integer>> bridges = solution1192.criticalConnections(3, connections);

        System.out.println(bridges);
        assertEquals(bridges.size(), 0);
    }

    @Test
    public void test4() {
        List<List<Integer>> connections = new LinkedList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(2, 0));
        connections.add(Arrays.asList(1, 3));
        Solution1192 solution1192 = new Solution1192();
        List<List<Integer>> bridges = solution1192.criticalConnections(4, connections);

        System.out.println(bridges);
        assertEquals(bridges.get(0).get(0), Integer.valueOf(1));
        assertEquals(bridges.get(0).get(1), Integer.valueOf(3));
    }

}