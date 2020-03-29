package crack;

public class Solution1_4 {

    // T.C.: O(N)
    // S.C.: O(1)
    public boolean canPermutePalindrome(String s) {
        if (s == null || s.length() == 0)
            return false;
        int[] d= new int[256];
        for (int i = 0; i < s.length(); i++)
            d[s.charAt(i)] = (d[s.charAt(i)] + 1) % 2;
        int ans = 0;
        for (int cnt: d)
            ans += cnt;
        return ans <= 1;
    }

}
