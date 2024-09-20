package cq.leetcode.answer;

import cq.leetcode.LeetCode1;
import cq.leetcode.util.ArrayUtils;

import java.util.List;

public class No1275 extends LeetCode1 {

    public String tictactoe(int[][] moves) {
        final char[][] board = new char[3][3];
        for (int i = 0; i < moves.length; i++) {
            char currentPlayer = i % 2 == 0 ? 'X' : 'Y';
            int[] currentIndex = moves[i];
            board[currentIndex[0]][currentIndex[1]] = currentPlayer;
        }
        if (checkForWin(board, 'X')) {
            return "A";
        }
        if (checkForWin(board, 'Y')) {
            return "B";
        }
        if (moves.length == 9) {
            return "Draw";
        }
        return "Pending";
    }

    private boolean checkForWin(char[][] board, char currentPlayer) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) || (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    @Override
    protected List<OC> params() {
        return List.of(
                OC.builder().param(ArrayUtils.getIntArgs("[[0,0],[2,0],[1,1],[2,1],[2,2]]")).result("A").build(),
                OC.builder().param(ArrayUtils.getIntArgs("[[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]")).result("B").build(),
                OC.builder().param(ArrayUtils.getIntArgs("[[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]")).result("Draw").build());
    }

}
