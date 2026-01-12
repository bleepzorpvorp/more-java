import java.util.Scanner;

public class MedianArray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 15 numbers");
        int[] array = new int[15];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }

        double median = sum / 6;
        System.out.println("The median is: " + median);
      

        input.close();
    }

    }

