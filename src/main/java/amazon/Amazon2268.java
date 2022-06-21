package amazon;

import java.util.Arrays;

public class Amazon2268 {
    public int minimumKeypresses(String s) {
        int[] alpha = new int[26];
        for (char ch: s.toCharArray()) {
            alpha[ch - 'a']++;
        }
        Arrays.sort(alpha);
        
        int A = 9, B = 9, C = 8;
        int cnt = 0;
        for (int i = 25; i >= 0; i--) {
            if (A > 0) {
                cnt += alpha[i];
                A--;
            } else if (B > 0) {
                cnt += alpha[i] * 2;
                B--;
            } else if (C > 0) {
                cnt += alpha[i] * 3;
                C--;
            }
        }  
        return cnt;
    }
}