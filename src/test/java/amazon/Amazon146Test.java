package companies.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Amazon146Test {

    @Test
    public void test1() {
        Amazon146 amazon146 = new Amazon146(2);
        amazon146.put(2, 1);
        amazon146.put(1, 1);
        amazon146.put(2, 3);
        amazon146.put(4, 1);
        assertEquals(-1, amazon146.get(1));
        assertEquals(3, amazon146.get(2));
    }

}