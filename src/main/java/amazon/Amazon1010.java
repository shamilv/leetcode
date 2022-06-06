package amazon;

public class Amazon1010 {

    public int numPairsDivisibleBy60(int[] time) {
        int[] map = new int[60];
        int cnt = 0;
        for (int t: time) {
            int mod = t % 60;
            if (mod == 0) {
                cnt += map[0];
            } else {
                cnt += map[60 - mod];
            }
            map[mod]++;
        }
        return cnt;
    }
}
