package heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    public void test1() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        int ans = lruCache.get(1);
        assertEquals(1, ans);
        ans = lruCache.get(2);
        assertEquals(2, ans);
        lruCache.put(3, 3);
        lruCache.put(4, 4);
        ans = lruCache.get(1);
        assertEquals(-1, ans);
        ans = lruCache.get(2);
        assertEquals(-1, ans);
        ans = lruCache.get(3);
        assertEquals(3, ans);
        ans = lruCache.get(4);
        assertEquals(4, ans);
    }

    @Test
    public void test2() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        int ans = lruCache.get(1);
        assertEquals(1, ans);
        ans = lruCache.get(2);
        assertEquals(2, ans);
        lruCache.put(3, 3);
        lruCache.put(4, 4);
        lruCache.put(4, 5);
        ans = lruCache.get(1);
        assertEquals(-1, ans);
        ans = lruCache.get(2);
        assertEquals(-1, ans);
        ans = lruCache.get(3);
        assertEquals(3, ans);
        ans = lruCache.get(4);
        assertEquals(5, ans);
    }

    @Test
    public void test3() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2, 1);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(4, 1);
        int ans = lruCache.get(1);
        assertEquals(-1, ans);
        ans = lruCache.get(2);
        assertEquals(3, ans);
    }

}