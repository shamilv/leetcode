package crack;

public class Solution1_9 {

    //T.C.: O(N)
    //S.C.: O(N)
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length())
            return false;
        String AA = A + A;
        return AA.contains(B);
    }

}
