import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the test scores: ");
        int[] scores = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            sum += scores[i];
        }

        double average = sum / 5.0;
        System.out.println("Average score: " + average);

        input.close();
    }


        
    }


