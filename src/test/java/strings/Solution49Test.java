package strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution49Test {

    @Test
    public void baseCase1() {
        Solution49 solution49 = new Solution49();
        List<List<String>> res = solution49.groupAnagrams(new String[]{"aha"});
        List<List<String>> exp = new ArrayList<>();
        exp.add(Arrays.asList("aha"));
        assertEquals(exp, res);
    }

    @Test
    public void baseCase2() {
        Solution49 solution49 = new Solution49();
        List<List<String>> res = solution49.groupAnagrams(new String[]{"aha", "haa"});
        List<List<String>> exp = new ArrayList<>();
        exp.add(Arrays.asList("aha", "haa"));
        assertEquals(exp, res);
    }

    @Test
    public void baseCase3() {
        Solution49 solution49 = new Solution49();
        List<List<String>> res = solution49.groupAnagrams(new String[]{"aha", "haa", "gaa"});
        List<List<String>> exp = new ArrayList<>();
        exp.add(Arrays.asList("gaa"));
        exp.add(Arrays.asList("aha", "haa"));
        assertEquals(exp, res);
    }

    @Test
    public void regularCase() {
        Solution49 solution49 = new Solution49();
        List<List<String>> res = solution49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> exp = new ArrayList<>();
        exp.add(Arrays.asList("eat","tea","ate"));
        exp.add(Arrays.asList("bat"));
        exp.add(Arrays.asList("tan", "nat"));
        assertEquals(exp, res);
    }

}