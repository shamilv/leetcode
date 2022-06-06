package amazon;

import java.util.Deque;
import java.util.LinkedList;

public class Amazon1041 {
    public boolean isRobotBounded(String instructions) {
        int i = 0;
        int[] pos = new int[]{0, 0};
        int[][] dirs = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
        for (char ch: instructions.toCharArray()) {
            if (ch == 'G') {
                pos[0] += dirs[i][0];
                pos[1] += dirs[i][1];
            } else if (ch == 'L') {
                i = (i + 1)%4;
            } else if (ch == 'R') {
                i = (i + 3)%4;
            }
        }
        if (i == 0 && (pos[0] != 0 || pos[1] != 0)) {
            return false;
        }
        return true;
    }

    public boolean isRobotBounded_BruteForce(String instructions) {
        Deque<Integer> deq = new LinkedList<>();
        int[][] dirs = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
        int i = 0;
        int[] pos = new int[]{0, 0};
        String instr = instructions + instructions + instructions + instructions;
        for (char ch: instr.toCharArray()) {
            if (ch == 'G') {
                pos[0] += dirs[i][0];
                pos[1] += dirs[i][1];
            } else if (ch == 'L') {
                i = (i + 1) > 3 ? 0 : i + 1;
            } else if (ch == 'R') {
                i = i - 1 < 0 ? 3 : i - 1;
            }
        }
        return pos[0] == 0 && pos[1] == 0;
    }
}
