package strings;

public class Solution5 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2)
            return s;
        int maxlen = 0, left = 0, right = 0;
        for (int i = 0; i < s.length() - 1; i ++) {
            int lengthOdd = expand(s, i, i);
            int lengthEven = expand(s, i, i + 1);
            int length = Math.max(lengthOdd, lengthEven);

            if (length > maxlen) {
                maxlen = length;
                left = i - (length - 1)/2;
                right = i + length/2;
            }
        }
        return s.substring(left, right + 1);
    }

    private int expand(String s, int left, int right) {
        int Left = left, Right = right, length = 0;
        while (Left >= 0 && Right < s.length() && s.charAt(Left) == s.charAt(Right)) {
            left = Left;
            right = Right;
            length = right - left + 1;
            Left--;
            Right++;
        }
        return length;
    }
}
