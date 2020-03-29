package crack;

public class Solution1_5 {

    // T.C.: O(N)
    // S.C.: O(1)
    public boolean isOneEditDistance(String s, String t) {
        int n = s.length(), k = t.length();
        for (int i = 0; i < Math.min(n, k); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                int a = i, b = i;
                if (n == k) {
                    a++; b++;
                } else if (n < k)
                    b++;
                else
                    a++;
                return s.substring(a).equals(t.substring(b));
            }
        }
        return Math.abs(s.length() - t.length()) == 1;
    }

}
