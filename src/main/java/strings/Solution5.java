package strings;

public class Solution5 {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty())
            return "";

        int left = 0, right = 0, len = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            if (Math.max(len1, len2) > len) {
                len = Math.max(len1, len2);
                left = len2 > len1 ? i - (len2 - 1) / 2 : i - len1 / 2;
                right = i + len / 2;
            }
        }
        return s.substring(left, right + 1);
    }

    private int expand(String s, int left, int right) {
        if (s.charAt(left) != s.charAt(right))
            return 0;
        int Left = left, Right = right;
        while (Left >= 0 && Right < s.length()) {
            if (s.charAt(Left) == s.charAt(Right)) {
                left = Left;
                right = Right;
                Left--;
                Right++;
            } else
                break;
        }
        return right - left + 1;
    }
}
