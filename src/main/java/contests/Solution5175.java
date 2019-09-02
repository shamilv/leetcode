package contests;

import java.util.*;

public class Solution5175 {

    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            boolean can = isPalindrome(s, queries[i][0], queries[i][1], queries[i][2]);
            ans.add(can);
        }
        return ans;
    }

    private Boolean isPalindrome(String str, int l, int r, int k) {
        Set<Character> dict = new HashSet<>();
        for (int i = l; i <= r; i++) {
            if (dict.contains(str.charAt(i)))
                dict.remove(str.charAt(i));
            else
                dict.add(str.charAt(i));
        }
        int left = dict.size() > k*2 ? dict.size() - k*2 : 0;
        return (r - l + 1) % 2 == 0 ? left == 0 : left == 0 || left == 1;
    }
}
