package amazon.a;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SolutionAmazon1Test {

    @Test
    public void test1() {
        SolutionAmazon1 solutionAmazon1 = new SolutionAmazon1();
        List<Integer> ans = solutionAmazon1.exchange(10);
        assertEquals(Arrays.asList(5), ans);
    }

    @Test
    public void test2() {
        SolutionAmazon1 solutionAmazon1 = new SolutionAmazon1();
        List<Integer> ans = solutionAmazon1.exchange(10);
        assertEquals(Arrays.asList(5), ans);
    }

}
