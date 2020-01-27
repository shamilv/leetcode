package pointers2;

import java.util.ArrayList;
import java.util.List;

public class Solution763 {

    public List<Integer> partitionLabels(String S) {
        List<Integer> ans= new ArrayList<>();
        int[] d= new int[26];
        for (int i = 0; i < S.length(); i++)
            d[S.charAt(i) - 'a'] = i;
        int prev = 0, i = 0, j = 0;
        while (j < S.length()) {
            j = d[S.charAt(j) - 'a'];
            while (i < j) {
                if (d[S.charAt(i) - 'a'] > j)
                    j = d[S.charAt(i) - 'a'];
                i++;
            }
            ans.add(j - prev + 1);
            prev = ++j;
            i = j;
        }
        return ans;
    }
}
