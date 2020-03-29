package crack;

import java.util.Arrays;

public class Solution1_6 {

    // T.C.: O(N)
    // S.C.: O(N)
    public String compress(String s) {
        char[] ans = new char[s.length()];
        int i = 0, k = 0;
        while (i < s.length()) {
            int cnt = 1, l = i;
            while (l + 1 < s.length() && s.charAt(l) == s.charAt(l + 1)) {
                cnt++;
                l++;
            }
            ans[k++] = s.charAt(l);
            if (cnt > 1) {
                for (char ch: String.valueOf(cnt).toCharArray())
                    ans[k++] = ch;
            }
            i = l + 1;
        }
        if (k < s.length())
            return String.valueOf(Arrays.copyOf(ans, k));
        return s;
    }

}
