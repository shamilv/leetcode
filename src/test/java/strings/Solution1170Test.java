package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1170Test {

    @Test
    public void test1() {
        Solution1170 solution1170 = new Solution1170();
        int[] ans = solution1170.numSmallerByFrequency(new String[]{"cbd"}, new String[]{"zaaaz"});

        assertArrayEquals(new int[]{1}, ans);
    }

    @Test
    public void test2() {
        Solution1170 solution1170 = new Solution1170();
        int[] ans = solution1170.numSmallerByFrequency(new String[]{"bbb", "cc"}, new String[]{"a","aa","aaa","aaaa"});

        assertArrayEquals(new int[]{1, 2}, ans);
    }

    @Test
    public void test3() {
        Solution1170 solution1170 = new Solution1170();
        int[] ans = solution1170.numSmallerByFrequency(new String[]{"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"},
                new String[]{"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"});

        assertArrayEquals(new int[]{6,1,1,2,3,3,3,1,3,2}, ans);
    }

}