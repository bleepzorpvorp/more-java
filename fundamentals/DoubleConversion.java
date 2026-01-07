package fundamentals;
import java.util.Scanner;
public class DoubleConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number one: ");
        double num1 = Double.parseDouble(input.nextLine());
        System.out.print("Enter number two: ");
        double num2 = Double.parseDouble(input.nextLine());
        double division = num1 / num2;
        System.out.print("Division: " + division);
            input.close();
    }


}
