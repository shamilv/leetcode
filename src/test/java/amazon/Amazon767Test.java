package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon767Test {

    @Test
    public void test1() {
        Amazon767 amazon767 = new Amazon767();
        String ans = amazon767.reorganizeString("babba");
        assertEquals("babab", ans);
    }

    @Test
    public void test2() {
        Amazon767 amazon767 = new Amazon767();
        String ans = amazon767.reorganizeString("babb");
        assertEquals("", ans);
    }

    @Test
    public void test3() {
        Amazon767 amazon767 = new Amazon767();
        String ans = amazon767.reorganizeString("babbc");
        assertEquals("babcb", ans);
    }

}