package contests;

public class Solution5174 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int sum = 0, ans = 0;
        int l = 0, r = 0;
        while (r < calories.length) {
            sum += calories[r];
            if (r - l + 1 > k) {
                sum -= calories[l++];
            }
            if (r - l + 1 == k) {
                if (sum < lower)
                    ans--;
                else if (sum > upper)
                    ans++;
            }
            r++;
        }

        return ans;
    }
}
