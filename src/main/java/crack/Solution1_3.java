package crack;

public class Solution1_3 {

    //T.C.: O(n)
    //S.C.: O(1)
    public char[] urlify(char[] url, int n) {
        int j = url.length - 1;
        for (int i = n-1; i>= 0; i--) {
            if (url[i] != ' ') {
                url[j--] = url[i];
            } else {
                url[j--] = '0';
                url[j--] = '2';
                url[j--] = '%';
            }
        }
        return url;
    }

}
