package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon1492Test {

    @Test
    public void test1() {
        Amazon1492 amazon1492 = new Amazon1492();
        int ans = amazon1492.kthFactor(16, 4);
        assertEquals(8, ans);
    }

}