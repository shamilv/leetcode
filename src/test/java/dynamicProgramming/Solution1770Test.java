package dynamicProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution1770Test {

    @Test
    public void test1() {
        Solution1770 solution1770 = new Solution1770();
        int ans = solution1770.maximumScore(new int[]{1, 2, 3}, new int[]{3, 2, 1});
        assertEquals(14, ans);
    }

}