import java.util.Scanner;
public class CircleDiameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle diameter: ");
        double diameter = Double.parseDouble(input.nextLine());
        double radius = diameter / 2.0;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        input.close();
    }
}
