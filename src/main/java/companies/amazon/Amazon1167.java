package companies.amazon;

import java.util.Arrays;

public class Amazon1167 {

    public int connectSticks(int[] sticks) {
        Arrays.sort(sticks);
        int ans = 0;
        for (int i = 1; i < sticks.length; i++) {
            sticks[i] = sticks[i] + sticks[i - 1];
            ans += sticks[i];
        }

        return ans;
    }
}
