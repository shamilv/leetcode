package arrays;

public class Solution974 {
    public int subarraysDivByK(int[] A, int K) {
        int[] P = new int[K];
        P[0] = 1;
        int prefix = 0, cnt = 0;
        for (int a: A) {
            prefix = (prefix + a) % K;
            if (prefix < 0)
                prefix = prefix + K;
            cnt += P[prefix];
            P[prefix]++;
        }
        return cnt;
    }
}
