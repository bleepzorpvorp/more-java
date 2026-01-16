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
    }
}
