package pointers2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution763Test {

    @Test
    public void test1() {
        Solution763 solution763 = new Solution763();
        List<Integer> ans = solution763.partitionLabels("abc");
        assertEquals(Arrays.asList(1, 1, 1), ans);
    }

    @Test
    public void test2() {
        Solution763 solution763 = new Solution763();
        List<Integer> ans = solution763.partitionLabels("abac");
        assertEquals(Arrays.asList(3, 1), ans);
    }

    @Test
    public void test3() {
        Solution763 solution763 = new Solution763();
        List<Integer> ans = solution763.partitionLabels("ababcbacadefegdehijhklij");
        assertEquals(Arrays.asList(9, 7, 8), ans);
    }


}