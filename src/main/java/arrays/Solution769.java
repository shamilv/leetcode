package arrays;

public class Solution769 {
    public int maxChunksToSorted(int[] arr) {
        int cnt = 0, maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxVal = Math.max(maxVal, arr[i]);
            if (i == maxVal && arr[i] <= maxVal)
                cnt++;
        }
        return cnt;
    }
}
