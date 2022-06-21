package amazon;

public class Amazon2104 {
    public long subArrayRanges(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            while (j <= i) {
                int max = nums[j];
                int min = nums[j];

                max = Math.max(max, nums[j]);
                min = Math.max(min, nums[j]);
                ans += (max - min);
                j++;
            }
        }
        return ans;
    }
}
