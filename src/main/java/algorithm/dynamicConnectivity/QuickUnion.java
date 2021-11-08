package algorithm.dynamicConnectivity;

public class QuickUnion {

    int[] A;

    public QuickUnion(int N) {
        this.A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = i;
        }
    }

    public void union(int p, int q) {
        int i = findRoot(p);
        int j = findRoot(q);
        A[i] = j;
    }

    public boolean connected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    private int findRoot(int i) {
        while (A[i] != i) {
            i = A[i];
        }
        return i;
    }
}
