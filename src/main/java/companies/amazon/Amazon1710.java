package companies.amazon;

import java.util.Arrays;

public class Amazon1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int cur = 0, collected = 0, profit = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            cur = Math.min(boxTypes[i][0], truckSize - collected);
            profit += cur * boxTypes[i][1];
            collected += cur;
        }
        return profit;
    }
}
