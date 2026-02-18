import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername()); //displays default username value of null
        player1.setUsername("pineappleghost333"); //sets (or mutates) username to new value
        System.out.println(player1.getUsername()); //displays new username 

        System.out.println(player2.getUsername()); //displays default username value of null
        player2.setUsername("ironmouse6741"); //sets (or mutates) username to new value
        System.out.println(player2.getUsername()); //displays new username 

        // taking in user input
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();

        player3.setUsername(userInput);
        System.out.println(player3.getUsername()); //displays new username 

        player1.setID("JFKD125"); 
        System.out.println(player1.getID());
        System.out.print("Enter an ID: ");
        String idInput = input.nextLine();
        player2.setID(idInput);
        System.out.println(player2.getID());
        player1.setRank("Noob");
        System.out.println(player1.getRank());
        System.out.println("Enter a rank (Noob, Pro, Hacker, God): "); 
        String rankInput = input.nextLine();
        player2.setRank(rankInput);
        System.out.println(player2.getRank());
                if (player3.getUsername().equals("pineappleghost333")) {
            System.out.println("You are an admin");
        } else {
            System.out.println("Access denied");
        }
        if (player2.getRank().equals("Noob")) {
            System.out.println("You suck butt");
        }
        if (player2.getRank().equals("Pro")) {
            System.out.println("You're a sweat ");
        }
        if (player2.getRank().equals("Hacker")) {
            System.out.println("Stop hacking weirdo!");
        }
        if (player2.getRank().equals("God")) {
            System.out.println("No I'm god I'm bleepzorpvorp");
        }


    }
}

class GetSet{
    //instance variables; attributes; making the instance 'private' enforces ENCAPSULATION
    private String username = "No user name";

    //accesor methods aka GETTERS:
    public String getUsername(){
        return username;
    }
    
    //mutator methods aka SETTERS
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
   private String ID = "No user ID";
   public String getID() {
    return ID;
   }
   public void setID(String newID){
    this.ID = newID;
   }
   private String rank = "no rank";
   public String getRank() {
    return rank;
   }
   public void setRank(String newRank){
    this.rank = newRank;
   }


}