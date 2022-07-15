package companies.amazon;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Amazon139Test {

    @Test
    public void test1() {
        Amazon139 amazon139 = new Amazon139();
        boolean ans = amazon139.wordBreak("cars", Arrays.asList("car", "ca", "rs"));
        assertTrue(ans);
    }

}