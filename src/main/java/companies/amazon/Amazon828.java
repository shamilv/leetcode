package companies.amazon;

public class Amazon828 {
    public int uniqueLetterString(String s) {
        int[] contrib = new int[26];
        int[] prev = new int[26];
        int total = 0, ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            total -= contrib[ch - 'A'];
            contrib[ch - 'A'] = i - (prev[ch - 'A'] - 1);
            total += contrib[ch - 'A'];
            ans += total;
            prev[ch - 'A'] = i + 1;
        }
        return ans;
    }
}
