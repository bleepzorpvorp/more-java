import java.util.Scanner;
import java.util.Random;
public class Loops {
    Scanner input = new Scanner(System.in);
     Random random = new Random();
    

    public static void main(String[] args) {



        // break
        // continue
        // return
        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j++) {
                
                    System.out.print(j);
                

            }
            System.out.print('\n');








        }




        // for (int i = 0; i < 5 || j == 5; i++)
        
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        
        }

        boolean isContinuing = true;
        int z = 0;
        
        while (isContinuing) {
            z++;
            if (z == 20) {
                isContinuing = false;
            }
            System.out.println(z);
        }





        // Foobar
        // 1 to 100
        // i % 3 foo,
        // if i is divisble by 5 bar
        // if both divisble by 3 and 5 print foobar
        for (int f = 50; f < 100; f++) {
            if (f % 3 == 0 && f % 5 == 0) {
                System.out.println("foobar");
            }
            else if (f % 3 == 0) {
                System.out.println("foo");
            }
             else if (f % 5 == 0) {
                System.out.println("bar");
            }
                 else {
                System.out.println(f);
            }
        }
  for (int row = 1; row <= 12; row++) {
            for (int col = 1; col <= 12; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }

    }
}
