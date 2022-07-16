package companies.microsoft;

public class Microsoft125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(ch);
            }
        }
        String newS = builder.toString();
        int left = 0, right = newS.length() - 1;
        while(left < right) {
            if (newS.charAt(left) != newS.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
