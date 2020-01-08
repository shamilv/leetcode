package binarySearch;

public class Solution875 {
    public int minEatingSpeed(int[] piles, int H) {
        int l = 14, h = piles[0];
        for (int i = 1; i < piles.length; i++) {
            h = Math.max(h, piles[i]);
        }

        while (l < h) {
            int mid = l + (h - l) / 2;
            if (!canBeEaten(piles, H, mid))
                l = mid + 1;
            else
                h = mid;
        }
        return l;
    }

    private boolean canBeEaten(int[] piles, int H, int mid) {
        int reqHours = 0;
        for (int bananas: piles)
            reqHours += (bananas-1)/mid + 1;
        return reqHours <= H;
    }
}
