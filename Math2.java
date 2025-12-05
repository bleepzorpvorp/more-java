class ScoreBoard {
    int playerXP = 0;
    int  playerLevel = 0;
    int playerHealth = 100;
    void gameName() {
        System.out.println("Barack Obama");
    }

    void gainXP(int amount) {
        playerXP = playerXP + amount; // accumulation, long way of doing it
    }
    void heal() {
        playerHealth += 50; //compound attition, compound accumulation
    }
    void damage() { 
        playerHealth -= 67; //compound  subtraction 
          // note you can also *=, /=, and %= */
    }
    void levelUp() { //incriment - to go up by one
        playerLevel++;  
    }
    void levelDown() { //decriment - to go down by one
        playerLevel--; 
    }
}
public class Math2 {
    public  static void main(String[] args) {
        ScoreBoard title = new ScoreBoard();
        title.gameName();
        ScoreBoard player1 = new ScoreBoard();
        ScoreBoard player2 = new ScoreBoard();
        player1.gainXP(67);
        player1.gainXP(67);
        System.out.println("Player 1 XP: " + player1.playerXP);
        player1.damage();
        player1.heal();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();
        System.out.println("Player 1 Health: " + player1.playerHealth);
        System.out.println("Player 1 Level: " + player1.playerLevel);
        
        player2.gainXP(67);
        player2.gainXP(67);
        System.out.println("Player 2 XP: " + player2.playerXP);
        player2.damage();
        player2.heal();
        player2.levelUp();
        player2.levelUp();
        player2.levelDown();
        System.out.println("Player 2 Health: " + player2.playerHealth);
        System.out.println("Player 2 Level: " + player2.playerLevel);
        
    }
}
