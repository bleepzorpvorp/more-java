java.util.import.Scanner;
public Class Scoreboard {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String team1 = input.nextLine("Team 1: ");
        String team2 = input.nextLine("Team 2: ");
        int teamTurn = 1;
    }
    public void recordPlay() {
        if (team1 <= 0) {
            team1 = !team1;
        } else if (team1 >= 0) {
            team1Score += num;
        }
        int scoreEarned;
        if (scoreEarned <= 0) {
            team1 = !team1;
        }
        else if (team1 = !team1 and team2 >= 0) {
            team2Score += num;
        }
    }
    public static void GetScore() {
        System.out.println(team1 + team1Score + "-" + team2 + team2Score);
    }
}