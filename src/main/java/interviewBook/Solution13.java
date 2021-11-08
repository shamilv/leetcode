package interviewBook;

public class Solution13 {
    public String urlify(char[] a) {
        int l = a.length - 1, r = a.length - 1;
        while (l >= 0 && a[l] == ' ') {
            l--;
        }
        while (l >= 0) {
            if (a[l] != ' ') {
                a[r] = a[l];
                r++;
            }
        }
        return "";
    }
}
