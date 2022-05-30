package amazon;

public class Amazon926 {
    public int minFlipsMonoIncr(String s) {
        int cnt1 = 0, cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt1++;
            } else {
                cnt = Math.min(cnt1, cnt + 1);
            }
        }
        return cnt;
    }
}
