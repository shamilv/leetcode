package amazon;

import java.util.HashMap;
import java.util.Map;

public class Amazon348 {

    private Map<Integer, int[]> rows;
    private Map<Integer, int[]> cols;
    private Map<Integer, int[]> diag;
    int[] matrix;
    int N;

    public Amazon348(int n) {
        rows = new HashMap<>();
        cols = new HashMap<>();
        diag = new HashMap<>();
        N = n;
        matrix = new int[N];
    }

    public int move(int row, int col, int player) {
        rows.putIfAbsent(row, new int[2]);
        rows.get(row)[player-1]++;
        if (rows.get(row)[player-1] == N) {
            return player;
        }

        cols.putIfAbsent(col, new int[2]);
        cols.get(col)[player-1]++;
        if (cols.get(col)[player-1] == N) {
            return player;
        }

        if (row == col) {
            diag.putIfAbsent(1, new int[2]);
            diag.get(1)[player-1]++;
            if (diag.get(1)[player-1] == N) {
                return player;
            }
        }

        if (row + col + 1 == N) {
            diag.putIfAbsent(2, new int[2]);
            diag.get(2)[player-1]++;
            if (diag.get(2)[player-1] == N) {
                return player;
            }
        }

        return 0;
    }
}
