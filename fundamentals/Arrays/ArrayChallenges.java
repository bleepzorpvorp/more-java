public class ArrayChallenges {
    public static void main(String args[]) {
        double[] winners = new double[18];
        int[] first_array = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = i * 2;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println("Index " + i + ": " + num[i]);
        }
        int rows = 30;
        int cols = 40;
        int[][] maze = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                maze[r][c] = 0;
            }
        }
        maze[1][1] = 1;
        maze[21][1] = 1;
        maze[2][2] = 1;
        System.out.println(maze.length + "x" + maze[0].length);
        System.out.println(maze[1][1]);
        int[][] dataArray = new int[16][32];
        for (int row = 0; row < dataArray.length; row++) {
            for (int col = 0; col < dataArray[0].length; col++) {
                dataArray[row][col] = row * 100 + col;
            }
        }
        for (int row = 0; row < dataArray.length; row++) {
            for (int col = 0; col < dataArray[row].length; col++) {
                System.out.print(dataArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}




