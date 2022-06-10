package amazon;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Amazon642Test {

    @Test
    public void test1() {
        Amazon642 amazon642 = new Amazon642(new String[]{"i love you", "island", "iroman", "i love leetcode"}, new int[]{5, 3, 2, 2});
        List<String> ans = amazon642.input('i');
        assertEquals("i love you", ans.get(0));
        assertEquals("island", ans.get(1));
        assertEquals("i love leetcode", ans.get(2));
    }

    @Test
    public void test2() {
        Amazon642 amazon642 = new Amazon642(new String[]{"i love you", "island", "iroman", "i love leetcode"}, new int[]{5, 3, 2, 2});
        List<String> ans = amazon642.input('i');
        ans = amazon642.input(' ');
        ans = amazon642.input('a');
        ans = amazon642.input('#');
        ans = amazon642.input('i');
        ans = amazon642.input(' ');
        ans = amazon642.input('a');
        ans = amazon642.input('#');
        ans = amazon642.input('i');
        ans = amazon642.input(' ');
        ans = amazon642.input('a');
        ans = amazon642.input('#');
    }

    @Test
    public void test3() {
        Amazon642 amazon642 = new Amazon642(new String[]{"abc","abbc","a"}, new int[]{3, 3, 3});
        List<String> ans = amazon642.input('b');
        ans = amazon642.input('c');
        ans = amazon642.input('#');
        ans = amazon642.input('b');
        ans = amazon642.input('c');
        ans = amazon642.input('#');
        ans = amazon642.input('a');
        ans = amazon642.input('b');
        ans = amazon642.input('c');
        ans = amazon642.input('#');
        ans = amazon642.input('a');
        ans = amazon642.input('b');
        ans = amazon642.input('c');
        ans = amazon642.input('#');
    }

}