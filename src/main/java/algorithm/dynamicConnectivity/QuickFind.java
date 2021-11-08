package algorithm.dynamicConnectivity;

public class QuickFind {
    private int[] A;

    public QuickFind(int N) {
        this.A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = i;
        }
    }

    public void union(int p, int q) {
        int val = A[p];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == val) {
                A[i] = A[q];
            }
        }
    }

    public boolean connected(int p, int q) {
        return A[p] == A[q];
    }
}
