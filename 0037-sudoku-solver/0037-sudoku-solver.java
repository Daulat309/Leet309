public class Solution {
    private boolean[][] rows = new boolean[9][10];
    private boolean[][] cols = new boolean[9][10];
    private boolean[][] boxes = new boolean[9][10];

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    rows[i][num] = true;
                    cols[j][num] = true;
                    boxes[(i / 3) * 3 + j / 3][num] = true;
                }
            }
        }
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int r, int c) {
        if (r == 9) return true;
        if (c == 9) return solve(board, r + 1, 0);
        if (board[r][c] != '.') return solve(board, r, c + 1);

        int boxIndex = (r / 3) * 3 + c / 3;
        for (int num = 1; num <= 9; num++) {
            if (!rows[r][num] && !cols[c][num] && !boxes[boxIndex][num]) {
                board[r][c] = (char) (num + '0');
                rows[r][num] = cols[c][num] = boxes[boxIndex][num] = true;

                if (solve(board, r, c + 1)) return true;

                board[r][c] = '.';
                rows[r][num] = cols[c][num] = boxes[boxIndex][num] = false;
            }
        }
        return false;
    }
}