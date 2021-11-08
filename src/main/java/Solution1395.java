public class Solution1395 {
    //[2,5,3,4,1]
    public int numTeams(int[] rating) {
        int n = rating.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int lLowers = 0, lHighers = 0, rLowers = 0, rHighers = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    lLowers++;
                } else if (rating[j] > rating[i]) {
                    lHighers++;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (rating[j] > rating[i]) {
                    rHighers++;
                } else if (rating[j] < rating[i]) {
                    rLowers++;
                }
            }
            ans +=  lHighers * rLowers + lLowers * rHighers;
        }
        return ans;
    }
}
