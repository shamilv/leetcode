package crack;

public class Solution4_1 {

    public boolean isConnected(int[][] g, int a, int b) {
        if (a == b)
            return true;
        for (int c: g[a]) {
            boolean res = isConnected(g, c, b);
            if (res)
                return true;
        }
        return false;
    }



}
