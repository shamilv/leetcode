package amazon;

public class Amazon1151 {
    public int minSwaps(int[] data) {
        int total1 = 0, currWindow = 0, winMax = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                total1++;
            }
        }
        for (int l = 0, r = 0; r < data.length; r++) {
            if (data[r] == 1) {
                currWindow++;
            }
            if (l > 0 && data[l-1] == 1) {
                currWindow--;
            }

            if (r - l + 1 == total1) {
                winMax = Math.max(winMax, currWindow);
                l++;
            }
        }
        return total1 - winMax;
    }
}
