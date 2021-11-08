package algorithm.dynamicConnectivity;

public class QuickUnionWeighted {

    int[] A;
    int[] size;

    public QuickUnionWeighted(int N) {
        this.A = new int[N];
        this.size = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = i;
            size[i] = 1;
        }
    }

    public void union(int p, int q) {
        int i = findRoot(p);
        int j = findRoot(q);
        if (size[i] > size[j]) {
            A[j] = i;
            size[i] += size[j];
        } else {
            A[i] = j;
            size[j] += size[i];
        }
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
