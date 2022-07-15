package companies.amazon;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Amazon1152Test {

    @Test
    public void test1() {
        Amazon1152 amazon1152 = new Amazon1152();
        List<String> ans = amazon1152.mostVisitedPattern(
                new String[]{"zkiikgv","zkiikgv","zkiikgv","zkiikgv"},
                new int[]{436363475,710406388,386655081,797150921},
                new String[]{"wnaaxbfhxp","mryxsjc","oz","wlarkzzqht"});
        //oz, wnaaxbfhxp, mryxsjc, wlarkzzqht
        //oz, wnaaxbfhxp, mryxsjc
        //oz, wnaaxbfhxp, wlarkzzqht
        //oz, mryxsjc, wlarkzzqht
        //wnaaxbfhxp, mryxsjc, wlarkzzqht

        assertEquals("oz", ans.get(0));
        assertEquals("mryxsjc", ans.get(1));
        assertEquals("wlarkzzqht", ans.get(2));
    }

    @Test
    public void test2() {
        Amazon1152 amazon1152 = new Amazon1152();
        List<String> ans = amazon1152.mostVisitedPattern(
                new String[]{"joe","joe","joe","james","james","james","james","mary","mary","mary"},
                new int[]{1,2,3,4,5,6,7,8,9,10},
                new String[]{"home","about","career","home","cart","maps","home","home","about","career"});

        assertEquals("home", ans.get(0));
        assertEquals("about", ans.get(1));
        assertEquals("career", ans.get(2));
    }

}