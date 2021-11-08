package interviewBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Solution16 {

    public String compressString(String A) {
        if (A == null || A.isEmpty()) {
            return A;
        }
        StringBuilder buf = new StringBuilder();
        int cnt = 1, l = 0; buf.append(A.charAt(0));
        for (int i = 1; i < A.length(); i++) {
            if (A.charAt(i) == A.charAt(l)) {
                cnt++;
            } else {
                buf.append(cnt);
                buf.append(A.charAt(i));
                cnt = 1;
                l = i;
            }
        }
        buf.append(cnt);
        if (buf.length() >= A.length()) {
            return A;
        }
        return buf.toString();
    }
}
