package companies.amazon;

/**
 * Time complexity is O(N * 3^L) where N is the number of cells, i.e. NxM. The L is the length of the word.
 * When we start iterating the board we go in 4 direction, but actually we do it in 3 directions since we do not
 * iterate in the direction we came from. Therefore, we go in 3 directions and we do it for every character in the word
 * in the worst case scenario. In other words, we do it 3^L times.
 *
 * Space complexity is O(L) and we consume memory for recursion. We call recurently as many times as many
 * characters we have in word.
 */

public class Amazon79 {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (searchWord(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean searchWord(char[][] board, String word, int i, int j, int k) {
        if (word.length() == k) {
            return true;
        }
        if (i < 0 || i == board.length || j < 0 || j == board[0].length) {
            return false;
        }
        if (board[i][j] != word.charAt(k)) {
            return false;
        }
        board[i][j] ^= 256;
        boolean found = searchWord(board, word, i, j + 1, k + 1) ||
            searchWord(board, word, i, j - 1, k + 1) ||
            searchWord(board, word, i + 1, j, k + 1) ||
            searchWord(board, word, i - 1, j, k + 1);
        board[i][j] ^= 256;
        return found;
    }
}
