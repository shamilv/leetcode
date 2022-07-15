package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon2262Test {
    // a b c  a  b
    // 1 2 3  4  5
    //a 1, ab 2, abc 3, abca 3, abcab 3
    //b 1, bc 2, bca 3, bcab 3
    //c 1, ca 2, cab 3
    //a 1, ab 2
    //b 1
    @Test
    public void test1() {
        Amazon2262 amazon2262 = new Amazon2262();
        long ans = amazon2262.appealSum("abcab");
        assertEquals(31, ans);
    }

}