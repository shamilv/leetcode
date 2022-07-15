package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon828Test {

    @Test
    public void test1() {
        //1 + 2 + 2 + 2 + 1
        Amazon828 amazon828 = new Amazon828();
        int ans = amazon828.uniqueLetterString("ABA");
        assertEquals(8, ans);
    }

}