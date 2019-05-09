package backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution17Test {

    @Test
    public void edgeCaseNull() {
        Solution17 solution17 = new Solution17();
        List<String> res = solution17.letterCombinations(null);
        assertEquals(Collections.EMPTY_LIST, res);
    }

    @Test
    public void edgeCaseEmpty() {
        Solution17 solution17 = new Solution17();
        List<String> res = solution17.letterCombinations("");
        assertEquals(Collections.EMPTY_LIST, res);
    }

    @Test
    public void baseCase4() {
        Solution17 solution17 = new Solution17();
        List<String> res = solution17.letterCombinations("4");
        assertEquals(Arrays.asList("g", "h", "i"), res);
    }

    @Test
    public void baseCase23() {
        Solution17 solution17 = new Solution17();
        List<String> res = solution17.letterCombinations("23");
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), res);
    }
}