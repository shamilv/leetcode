package amazon;

import java.util.List;

public class Amazon767 {

    public String reorganizeString(String s) {
        char[] ans = new char[s.length()];
        int[] freq = new int[26];
        int maxFreq = 0;
        char maxFreqChar = 'a';
        for (char ch: s.toCharArray()) {
            freq[ch - 'a']++;
            if (freq[ch - 'a'] > maxFreq) {
                maxFreq = freq[ch - 'a'];
                maxFreqChar = ch;
            }
        }
        //bbbaaacc 3 >= 3
        //bababcac
        int maxCharLength = freq[maxFreqChar - 'a'];
        if (maxCharLength - (s.length() - maxCharLength) > 1) {
            return "";
        }

        int pointer = 0;
        while(freq[maxFreqChar - 'a'] > 0) {
            ans[pointer] = maxFreqChar;
            freq[maxFreqChar - 'a']--;
            pointer += 2;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                continue;
            }

            while(freq[i] > 0) {
                if (pointer >= s.length()) pointer = 1;
                ans[pointer] = (char)(i + 'a');
                pointer += 2;
                freq[i]--;
            }
        }
        return String.valueOf(ans);
    }
}
