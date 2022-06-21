package algorithm.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AvlTreeTest {
    
    @Test
    void testAdd() {
        AvlTree avlTree = new AvlTree();
        avlTree.add(20);
        avlTree.add(10);
        AvlTree.Node root = avlTree.add(5);
        assertEquals(10, root.val);
    }

    @Test
    void testAdd2() {
        AvlTree avlTree = new AvlTree();
        avlTree.add(20);
        avlTree.add(30);
        AvlTree.Node root = avlTree.add(40);
        assertEquals(30, root.val);
    }

    @Test
    void testAdd3() {
        AvlTree avlTree = new AvlTree();
        avlTree.add(30);
        avlTree.add(10);
        AvlTree.Node root = avlTree.add(20);
        assertEquals(20, root.val);
    }

    @Test
    void testAdd4() {
        AvlTree avlTree = new AvlTree();
        avlTree.add(30);
        avlTree.add(50);
        AvlTree.Node root = avlTree.add(40);
        assertEquals(40, root.val);
    }

    @Test
    void testAdd5() {
        AvlTree avlTree = new AvlTree();
        avlTree.add(50);
        avlTree.add(30);
        avlTree.add(20);
        avlTree.add(45);
        avlTree.add(70);
        avlTree.add(60);
        avlTree.add(80);
        avlTree.add(65);
        AvlTree.Node root = avlTree.add(67);
        assertEquals(50, root.val);
    }

    @Test
    void testAdd6() {
        AvlTree avlTree = new AvlTree();
        avlTree.add(50);
        avlTree.add(40);
        avlTree.add(60);
        avlTree.add(30);
        avlTree.add(45);
        AvlTree.Node root = avlTree.add(43);
        assertEquals(45, root.val);
    }
}
