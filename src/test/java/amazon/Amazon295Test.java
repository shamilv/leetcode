package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon295Test {

    @Test
    public void test1() {
        Amazon295 amazon295 = new Amazon295();
        amazon295.addNum(1);
        amazon295.addNum(2);
        double ans = amazon295.findMedian();
        assertEquals(1.5d, ans);
    }

}