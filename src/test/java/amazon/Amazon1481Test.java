package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon1481Test {

    @Test
    public void test1() {
        Amazon1481 amazon1481 = new Amazon1481();
        int ans = amazon1481.findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2}, 3);
        assertEquals(2, ans);
    }

}