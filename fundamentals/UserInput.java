package fundamentals;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Enter your age");
        String age = input.nextLine();
        System.out.println("Age: " + age);
        int ageConverted = Integer.parseInt(age);
        System.out.println("Next year: " + name + " will be: " + (ageConverted + 1));
        System.out.print("What is your height in meters? ");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("You are " + height +  " meters tall");
    }

}
