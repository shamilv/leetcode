package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution60 {

    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            nums.add(i);
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            int cnt = fact(n)/n;
            int idx = (k - 1)/cnt;
            str.append(nums.get(idx));
            nums.remove(idx);
            k = cnt >= k ? k : k % cnt == 0 ? cnt : k % cnt;
            n--;
        }
        return str.toString();
    }

    private int fact(int n) {
        int t = 1;
        while (n > 1) {
            t *= n;
            n--;
        }
        return t;
    }

}
