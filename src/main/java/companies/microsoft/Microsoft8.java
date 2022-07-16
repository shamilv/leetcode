package companies.microsoft;

public class Microsoft8 {
    public int myAtoi(String s) {
        int mult = 10, ans = 0;
        int sign = 1;
        int N = s.length();
        int i = 0;
        while (i < N && s.charAt(i) == ' ') {
            i++;
        }
        if (i < N && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while (i < N && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (ans < Integer.MAX_VALUE/10) {
                ans = ans * mult + digit;
            } else if (ans == Integer.MAX_VALUE/10) {
                if (sign == 1) {
                    if (digit <= 7) {
                        ans = ans * mult + digit;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                } else {
                    if (digit <= 8) {
                        ans = ans * mult + digit;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                }
            } else {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            i++;
        }
        return ans * sign;
    }
}
