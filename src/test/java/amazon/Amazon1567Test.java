package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon1567Test {

    @Test
    public void test1() {
        Amazon1567 amazon1567 = new Amazon1567();
        int ans = amazon1567.getMaxLen(new int[]{9,10,1,0,19,20,-28,30,-12,20,11,-8,7,21,-26});
        assertEquals(11, ans);
    }

    @Test
    public void test2() {
        Amazon1567 amazon1567 = new Amazon1567();
        int ans = amazon1567.getMaxLen(new int[]{5,-20,-20,-39,-5,0,0,0,36,-32,0,-7,-10,-7,21,20,-12,-34,26,2});
        assertEquals(11, ans);
    }

}