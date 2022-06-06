package amazon;

import java.util.Arrays;
import java.util.Comparator;

public class Amazon1275 {

    public String tictactoe(int[][] moves) {
        int[][] rows = new int[3][2];
        int[][] cols = new int[3][2];
        int[] diag1 = new int[2];
        int[] diag2 = new int[2];
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            int player = (i + 1) % 2 == 0 ? 2 : 1;
            rows[row][player - 1]++;
            cols[col][player - 1]++;
            if (rows[row][player - 1] == 3 || cols[col][player - 1] == 3) {
                return player == 1 ? "A" : "B";
            }
            if (col == row) {
                diag1[player - 1]++;
                if (diag1[player - 1] == 3) {
                    return player == 1 ? "A" : "B";
                }
            }
            if ((row + col + 1) == 3) {
                diag2[player - 1]++;
                if (diag2[player - 1] == 3) {
                    return player == 1 ? "A" : "B";
                }
            }
        }

        if (moves.length == 9) return "Draw";
        return "Pending";
    }
}
