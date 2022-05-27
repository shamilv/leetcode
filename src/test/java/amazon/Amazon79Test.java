package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon79Test {

    @Test
    public void test1() {
        char[][] board = new char[][] {{'a', 'b'}, {'c', 'd'}};
        String word = "abd";
        Amazon79 amazon79 = new Amazon79();
        boolean ans = amazon79.exist(board, word);
        assertTrue(ans);
    }

}