package companies.microsoft;

public class Microsoft151 {
    private int N;

    public String reverseWords(String s) {
        N = s.length();
        int left = N - 1, right = N - 1;
        StringBuilder builder = new StringBuilder();
        while (left >= 0) {
            char ch = s.charAt(left);
            if (ch == ' ') {
                copyWord(s, left, right, builder);
                left--;
                right = left;
            } else {
                left--;
            }
        }
        if (s.charAt(0) != ' ') {
            copyWord(s, left, right, builder);
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
    
    private void copyWord(String s, int left, int right, StringBuilder builder) {
        for (int i = left + 1; i <= right; i++) {
            builder.append(s.charAt(i));
        }
        if (left + 1 <= right) {
            builder.append(' ');
        }
    }
}
