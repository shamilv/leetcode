package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon402Test {
    @Test
    public void test1() {
        Amazon402 amazon402 = new Amazon402();
        String ans = amazon402.removeKdigits("1923", 2);
        assertEquals("12", ans);
    }

    @Test
    public void test2() {
        Amazon402 amazon402 = new Amazon402();
        String ans = amazon402.removeKdigits("100", 3);
        assertEquals("0", ans);
    }

    @Test
    public void test3() {
        Amazon402 amazon402 = new Amazon402();
        String ans = amazon402.removeKdigits("13001", 2);
        assertEquals("1", ans);
    }
}