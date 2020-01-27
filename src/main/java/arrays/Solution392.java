package arrays;

import java.util.ArrayList;
import java.util.List;

public class Solution392 {

    public boolean isSubsequence(String s, String t) {
        ArrayList<Integer>[] d = new ArrayList[26];
        for (int i = 0; i < t.length(); i++) {
            int idx = t.charAt(i) - 'a';
            if (d[idx] == null)
                d[idx] = new ArrayList<>();
            d[idx].add(i);
        }

        int prev = -1;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (d[idx] == null)
                return false;
            prev = binarySearch(d[idx], prev);
            if (prev == -1)
                return false;
        }
        return true;
    }

    private int binarySearch(List<Integer> list, int k) {
        int l =0, r = list.size() - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (list.get(mid) > k) {
                ans = list.get(mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public boolean isSubsequenceWith2Pointers(String s, String t) {
        if (s.length() == 0)
            return true;
        int idxS = 0, idxT = 0;
        while (idxT < t.length()) {
            if (s.charAt(idxS) == t.charAt(idxT))
                idxS++;
            if (idxS == s.length())
                return true;
            idxT++;
        }
        return false;
    }

}
