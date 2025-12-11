import java.util.Scanner;
public class Email {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter  your first word for your email:");
            String word1 = input.nextLine();
            System.out.println("Enter  your second word for your email:");
            String word2 = input.nextLine();
            System.out.println("Enter number one: ");
            int num1 = Integer.parseInt(input.nextLine());
            System.out.println("Enter number two: ");
            int num2 = Integer.parseInt(input.nextLine());
            if (num1 + num2 <= 100) {
            int sum = num1 + num2;
            System.out.println(word1 + word2 + sum + "@gmail.com");
            }   
            else {
                System.out.println("Sum of numbers must be under 100");
            }
          input.close(); 

}
}
