import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random; 
import java.util.Scanner; 

public class ArrayListChallenges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(rand.nextInt(100) + 1);
        }
        System.out.println("Original List: " + nums);

        nums.removeIf(n -> n % 2 != 0); 
        System.out.println("Evens Only: " + nums);

        ArrayList<String> guests = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie","Joe","Bo"));
        System.out.println("Enter a name to check the guest list: "); 
        String name = sc.nextLine();

        if (guests.contains(name)) {
            System.out.print("This person is invited!");
        }

        ArrayList<String> groceries = new ArrayList<>(Arrays.asList("Milk", "Bread", "Eggs"));
        System.out.print("\nEnter a food item: ");
        String food = sc.nextLine();
        int index = groceries.indexOf(food);

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
            groceries.add(food);
            System.out.println("Updated List: " + groceries);
        }
        sc.close();
    }
}
