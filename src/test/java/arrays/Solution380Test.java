package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution380Test {

    @Test
    public void regular() {
        Solution380 solution380 = new Solution380();

        int random = solution380.getRandom();
        assertEquals(-1, random);

        boolean res = solution380.insert(1);
        assertTrue(res);

        random = solution380.getRandom();
        assertEquals(1, random);

        res = solution380.insert(1);
        assertFalse(res);

        res = solution380.insert(2);
        assertTrue(res);

        res = solution380.remove(1);
        assertTrue(res);

        res = solution380.remove(1);
        assertFalse(res);

        res = solution380.insert(1);
        assertTrue(res);
    }

    @Test
    public void regularRemove() {
        Solution380 solution380 = new Solution380();

        boolean res = solution380.insert(1);
        assertTrue(res);

        res = solution380.insert(2);
        assertTrue(res);

        res = solution380.insert(10);
        assertTrue(res);

        res = solution380.insert(5);
        assertTrue(res);

        res = solution380.remove(1);
        assertTrue(res);

        assertEquals(Arrays.asList(5, 2, 10), solution380.getList());
        assertNull(solution380.getMap().get(1));
        assertEquals(Integer.valueOf(0), solution380.getMap().get(5));
        assertEquals(Integer.valueOf(1), solution380.getMap().get(2));
        assertEquals(Integer.valueOf(2), solution380.getMap().get(10));
    }

}