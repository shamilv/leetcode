package crack;

public class Solution1_2 {

    // T.C.: O(N)
    // S.C.: O(1)
    public boolean isPermutation(String a, String b) {
        if (a.length() != b.length())
            return false;
        int[] d = new int[256];
        for (int i = 0; i < a.length(); i++) {
            d[a.charAt(i)]++;
            d[b.charAt(i)]--;
        }
        for (int n: d)
            if (n != 0)
                return false;
        return true;
    }

}
