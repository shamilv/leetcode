package interviewBook;

// Given two strings, write a method to decide if one is a permutation of another
//  abs, bas - true
//  aa, ab - false

import java.util.Arrays;

public class Solution12 {
    public boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        Arrays.sort(cha);
        Arrays.sort(chb);
        for (int i = 0; i < cha.length; i++) {
            if (cha[i] != chb[i]) return false;
        }
        return true;
    }

}
