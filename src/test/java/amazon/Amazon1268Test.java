package companies.amazon;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Amazon1268Test {

    @Test
    public void test1() {
        Amazon1268 amazon1268 = new Amazon1268();
        List<List<String>> ans = amazon1268.suggestedProducts(new String[]{"abc", "abb", "acb", "acc"}, "ab");
        assertIterableEquals(Arrays.asList("abb", "abc", "acb"), ans.get(0));
        assertIterableEquals(Arrays.asList("abb", "abc"), ans.get(1));
    }

    @Test
    public void test2() {
        Amazon1268 amazon1268 = new Amazon1268();
        List<List<String>> ans = amazon1268.suggestedProducts(new String[]{"abc", "abb", "acb", "acc"}, "ba");
        assertEquals(2, ans.size());
    }

    @Test
    public void test3() {
        Amazon1268 amazon1268 = new Amazon1268();
        List<List<String>> ans = amazon1268.suggestedProducts(new String[]{"abc", "acc", "abb", "acb"}, "ac");
        assertIterableEquals(Arrays.asList("abb", "abc", "acb"), ans.get(0));
        assertIterableEquals(Arrays.asList("acb", "acc"), ans.get(1));
    }

    @Test
    public void test4() {
        Amazon1268 amazon1268 = new Amazon1268();
        List<List<String>> ans = amazon1268.suggestedProducts(new String[]{"abc", "abcn", "acc", "abb", "abc"}, "abc");
        assertIterableEquals(Arrays.asList("abb", "abc", "abcn"), ans.get(0));
        assertIterableEquals(Arrays.asList("abb", "abc", "abcn"), ans.get(1));
        assertIterableEquals(Arrays.asList("abc", "abcn"), ans.get(2));
    }

    @Test
    public void test5() {
        Amazon1268 amazon1268 = new Amazon1268();
        List<List<String>> ans = amazon1268.suggestedProducts(new String[]{"havana"}, "tatiana");
        assertEquals(7, ans.size());
    }

}