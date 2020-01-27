package heap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution347Test {

    @Test
    public void test1() {
        Solution347 solution347 = new Solution347();
        List<Integer> ans = solution347.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        assertEquals(Arrays.asList(1, 2), ans);
    }

    @Test
    public void test2() {
        Solution347 solution347 = new Solution347();
        List<Integer> ans = solution347.topKFrequent(new int[]{1}, 1);
        assertEquals(Arrays.asList(1), ans);
    }

    @Test
    public void test3() {
        Solution347 solution347 = new Solution347();
        List<Integer> ans = solution347.topKFrequent(new int[]{2, 2, 3, 3, 1, 3, 2, 2, 1}, 2);
        assertEquals(Arrays.asList(2, 3), ans);
    }

    @Test
    public void test4() {
        Solution347 solution347 = new Solution347();
        List<Integer> ans = solution347.topKFrequent(new int[]{1, 2}, 1);
        assertEquals(Arrays.asList(1, 2), ans);
    }

}