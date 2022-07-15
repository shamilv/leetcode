package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon1167Test {

    @Test
    public void test1() {
        Amazon1167 amazon1167 = new Amazon1167();
        int ans = amazon1167.connectSticks(new int[]{3354,4316,3259,4904,4598,474,3166,6322,8080,9009});
        assertEquals(151646, ans);
    }
}