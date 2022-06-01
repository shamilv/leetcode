package amazon;

public class Amazon370 {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ans = new int[length];
        if (updates.length == 0) return ans;

        for (int i = 0; i < updates.length; i++) {
            ans[updates[i][0]] += updates[i][2];
            if (updates[i][1] < length - 1) {
                ans[updates[i][1] + 1] += -1 * updates[i][2];
            }
        }

        for (int i = 1; i < length; i++) {
            ans[i] += ans[i-1];
        }

        return ans;
    }
}
