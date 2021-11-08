package _repeatHere;

public class Solution {
public void test(int n) {
    if (n > 0) {
        for (int i = 1; i <= n; i *= 2) {
            System.out.println(String.format("%d", i));
        }
        test(n - 1);
    }
}
}
