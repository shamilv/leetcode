package arrays;

public class Solution670 {

    public int maximumSwap(int num) {
        int[] A = numToArray(num);
        int maxIndex = 0;
        for (int i = 1; i < A.length; i++) {
            maxIndex = i;
            if (A[i] > A[i - 1])
                break;
        }

        for (int i = maxIndex + 1; i < A.length; i++) {
            if (A[i] >= A[maxIndex])
                maxIndex = i;
        }

        int minIndex = maxIndex;
        for (int i = minIndex - 1; i >= 0; i--) {
            if (A[i] < A[maxIndex])
                minIndex = i;
        }

        if (maxIndex > minIndex) {
            int tmp = A[maxIndex];
            A[maxIndex] = A[minIndex];
            A[minIndex] = tmp;
        }

        return arrayToNum(A);
    }

    private int[] numToArray(int num) {
        String tmp = String.valueOf(num);
        int[] A = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++)
            A[i] = tmp.charAt(i) - '0';
        return A;
    }

    private int arrayToNum(int[] A) {
        StringBuilder str = new StringBuilder();
        for (int a: A)
            str.append(a);
        return Integer.valueOf(str.toString());
    }

}
