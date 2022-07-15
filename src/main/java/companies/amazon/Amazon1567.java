package companies.amazon;

public class Amazon1567 {
    public int getMaxLen(int[] nums) {
        int ans = 0, nv = 0, pv = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                pv = 0;
                nv = 0;
            } else {
                if (nums[i] > 0) {
                    pv++;
                    nv = nv == 0 ? 0 : nv + 1;
                } else {
                    int tmp = pv;
                    pv = nv;
                    nv = tmp;

                    pv = pv == 0 ? 0 : pv + 1;
                    nv++;
                }
                ans = Math.max(ans, pv);
            }
        }
        return ans;
    }
}
