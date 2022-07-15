package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon907Test {

    @Test
    public void test1() {
        Amazon907 amazon907 = new Amazon907();
        int ans = amazon907.sumSubarrayMins(new int[]{71, 55, 82, 55});
        assertEquals(593, ans);
    }

    @Test
    public void test2() {
        Amazon907 amazon907 = new Amazon907();
        int ans = amazon907.sumSubarrayMins(new int[]{3, 4, 1});
        assertEquals(13 , ans);
    }
}