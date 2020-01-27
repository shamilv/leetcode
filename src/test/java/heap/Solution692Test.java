package heap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution692Test {

    @Test
    public void test1() {
        Solution692 solution692 = new Solution692();
        List<String> ans = solution692.topKFrequent(new String[]{"a"}, 1);
        assertEquals(Arrays.asList("a"), ans);
    }

    @Test
    public void test2() {
        Solution692 solution692 = new Solution692();
        List<String> ans = solution692.topKFrequent(new String[]{"a", "b", "c", "a", "b"}, 1);
        assertEquals(Arrays.asList("a"), ans);
    }

    @Test
    public void test3() {
        Solution692 solution692 = new Solution692();
        List<String> ans = solution692.topKFrequent(new String[]{"a", "b", "c", "a", "b"}, 2);
        assertEquals(Arrays.asList("a", "b"), ans);
    }

    @Test
    public void test4() {
        Solution692 solution692 = new Solution692();
        List<String> ans = solution692.topKFrequent(new String[]{"a", "b", "c", "a", "b"}, 3);
        assertEquals(Arrays.asList("a", "b", "c"), ans);
    }

}