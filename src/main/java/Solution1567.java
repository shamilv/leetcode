public class Solution1567 {
    public int getMaxLen(int[] nums) {
        int zeroPos = -1, lastNegativePos = -1, negativeCnt = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                lastNegativePos = i;
                negativeCnt++;
            } else if (nums[i] == 0) {
                zeroPos = i;
                lastNegativePos = i;
                negativeCnt = 0;
            }

            if (negativeCnt % 2 == 0) {
                max = Math.max(i - zeroPos, max);
            } else {
                max = Math.max(i - lastNegativePos, max);
            }
        }
        return max;
    }
}
