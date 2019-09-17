package strings;

import java.util.Arrays;

/**
 * me
 * easy
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */

public class Solution1170 {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] nwords = new int[words.length];
        for (int i = 0; i < nwords.length; i++)
            nwords[i] = f(words[i]);
        Arrays.sort(nwords);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int K = f(queries[i]);
            int idx = binarySearch(K, nwords, 0, nwords.length - 1);
            if (idx == -1)
                ans[i] = 0;
            else
                ans[i] = nwords[idx] == K ? nwords.length - 1 - idx : nwords.length - idx;
        }
        return ans;
    }

    private int f(String s) {
        int minChar = 'z';
        int minCharCnt = 0;
        for (char ch: s.toCharArray()) {
            if (ch < minChar) {
                minChar = ch;
                minCharCnt = 1;
            } else if (minChar == ch) {
                minCharCnt++;
            }
        }
        return minCharCnt;
    }

    private int binarySearch(int K, int[] nwords, int l, int r) {
        if (l > r)
            return -1;
        int mid = l + (r - l)/2;

        int ans;
        if (K < nwords[mid])
            ans = binarySearch(K, nwords, l, mid - 1);
        else
            ans = binarySearch(K, nwords, mid + 1, r);

        return ans == -1 && K <= nwords[mid] ? mid : ans;
    }
}
