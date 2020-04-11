package algorithm.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    public void test1() {
        Trie trie = new Trie();
        trie.insert("bite");
        trie.insert("bit");

        assertTrue(trie.find("bit"));
        assertTrue(trie.find("bite"));
        assertFalse(trie.find("bip"));
        assertFalse(trie.find("bi"));
        assertFalse(trie.find("bis"));
        assertFalse(trie.find("ais"));
    }

    @Test
    public void test2() {
        Trie trie = new Trie();
        trie.insert("bite");
        trie.insert("bit");
        assertTrue(trie.find("bite"));
        assertTrue(trie.find("bit"));

        trie.remove("bite");
        assertFalse(trie.find("bite"));
        assertTrue(trie.find("bit"));

        trie.remove("bit");
        assertFalse(trie.find("bite"));
        assertFalse(trie.find("bit"));

    }

    @Test
    public void test3() {
        Trie trie = new Trie();
        trie.insert("aabb");
        trie.insert("aabc");
        trie.insert("aab");
        assertTrue(trie.find("aabb"));
        assertTrue(trie.find("aabc"));
        assertTrue(trie.find("aab"));

        trie.remove("aabb");
        assertFalse(trie.find("aabb"));
        assertTrue(trie.find("aabc"));
        assertTrue(trie.find("aab"));
    }

}