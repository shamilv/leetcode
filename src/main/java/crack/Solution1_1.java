package crack;

import java.util.Arrays;
import java.util.HashSet;

public class Solution1_1 {

    //T.C.: O(N)
    //S.C.: O(N)
    public boolean ifUnique1(String s) {
        HashSet<Character> d = new HashSet<>();
        for (char ch: s.toCharArray()) {
            if (d.contains(ch))
                return false;
            d.add(ch);
        }
        return true;
    }

    //T.C.: O(NLogN)
    //S.C.: O(N)
    public boolean ifUnique2(String s) {
        char[] chs = s.toCharArray();
        Arrays.sort(chs);
        for (int i = 1; i < chs.length; i++) {
            if (chs[i] == chs[i-1])
                return false;
        }
        return true;
    }

}
