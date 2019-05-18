package arrays;

public class Solution162 {
    public int findPeakElement(int[] nums) {
        return findPeakElement(nums, 0, nums.length - 1);
    }

    private int findPeakElement(int[] nums, int left, int right) {
        int mid = left + (right - left)/2;
        if ((mid - 1 < 0 || nums[mid] > nums[mid - 1]) && (mid + 1 == nums.length || nums[mid] > nums[mid + 1])) {
            return mid;
        }

        int index = -1;
        if (nums[mid] < nums[mid + 1])
            index = findPeakElement(nums, mid + 1, right);

        if (index == -1)
            index = findPeakElement(nums, left, mid - 1);

        return index;
    }
}
