package backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution401Test {

    @Test
    public void test0() {
        Solution401 solution401 = new Solution401();
        List<String> res = solution401.readBinaryWatch(0);
        assertEquals(Arrays.asList("0:00"), res);
    }

    @Test
    public void test1() {
        Solution401 solution401 = new Solution401();
        List<String> res = solution401.readBinaryWatch(1);
        assertEquals(Arrays.asList("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"), res);
    }

    @Test
    public void test2() {
        Solution401 solution401 = new Solution401();
        List<String> res = solution401.readBinaryWatch(2);
        System.out.println(res);
        TreeSet<String> ttt = new TreeSet<>(res);
        System.out.println(ttt);
        assertEquals(Arrays.asList("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"), res);
    }


}