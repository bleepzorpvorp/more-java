import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        char[][] board = new char[rows][columns];
        Random rand = new Random();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (rand.nextInt(2) == 0) {
                    board[r][c] = 'X';
                } else {
                    board[r][c] = 'O';
                }
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }

        char winner = checkWinner(board);

        if (winner == 'X') {
            System.out.println("X wins!");
        } else if (winner == 'O') {
            System.out.println("O wins!");
        } else {
            System.out.println("Draw");
        }
    }

    public static char checkWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }
        return ' ';
    }
}
