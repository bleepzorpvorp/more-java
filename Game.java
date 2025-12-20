import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = input.nextLine();
    int playerHealth = 100;
    int playerPoints = 0;
    System.out.println("The TARDIS shudders as snow falls inside the control room.");
    System.out.println(name + " the Doctor needs your help to save Christmas!");
    System.out.println("The TARDIS lands in Victorian London on Christmas eve.");
    System.out.println("What shall you do?");
    System.out.println("A. Fix the TARDIS controls");
    System.out.println("B. Explore the snowy streets ");
    String decision1 = input.nextLine();
    if (decision1.equals("A")) {
        System.out.println("No one is ever letting you go into a TARDIS again.");
        System.out.println("I don't know if you've only played TARDIS Refined but you can NOT right click in real life.");
        System.out.println("Congrats, you've managed to make the TARDIS EXPLODE. Causing a whole world of issues.");
        System.out.println("Most importantly,  the destruction of all matter both spatially and temporally.");
    }
    else if (decision1.equals("B")) {
        System.out.println("You found a sonic ornament!");
        System.out.println("You have " + (playerPoints + 67) + " points now!");
        playerPoints += 67;

    }
    System.out.println("");
    System.out.println("Do you:");
    System.out.println("A");
    System.out.println("B");
    String decision2 = input.nextLine();
           }
}
