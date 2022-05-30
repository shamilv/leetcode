package amazon;

public class Amazon2262 {
    public long appealSum(String s) {
        int[] last = new int[26];
        long res = 0, total = 0;
        for (int i = 0; i< s.length(); i++) {
            total += i + 1 - last[s.charAt(i) - 'a'];
            last[s.charAt(i) - 'a'] = i + 1;
            res += total;
        }
        return res;
    }
}
