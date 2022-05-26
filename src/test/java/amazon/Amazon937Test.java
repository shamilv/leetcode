package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon937Test {

    @Test
    public void test1() {
        String[] logs = new String[]{"a1 3 2", "a2 a a"};
        Amazon937 amazon937 = new Amazon937();
        logs = amazon937.reorderLogFiles(logs);
        assertArrayEquals(new String[]{"a2 a a", "a1 3 2"}, logs);
    }

}