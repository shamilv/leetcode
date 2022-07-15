package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon1275Test {

    @Test
    public void test1() {
        Amazon1275 amazon1275 = new Amazon1275();
        String ans = amazon1275.tictactoe(new int[][]{{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}});
        assertEquals("B", ans);
    }

}