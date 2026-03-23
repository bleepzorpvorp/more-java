import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayListDemo { //copied from csaea github since i wasnt there or notes

	public static void main(String[] args) {

		// To create an arraylist you need to define its type with the class such as
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("After creation: " + list);

		// The type of the object must be the same as the type of the variable so
		// ArrayList<Integer> list2 = new ArrayList<Double>(); // ERR

		// Array list types also cannot be empty
		// ArrayList<> list3 = new ArrayList<Double>(); // ERR

		// To add an index you can add just the value or value + index. 
		// each new element is added to the end of the list
		list.add(0);
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(9);
		System.out.println("Initial list: " + list);


		// to add to a specific index
		list.add(1, 5); // add 5 to the 1st index
		System.out.println("Insertion after first index: " + list);

		// to get the size
		System.out.println("Current size: " + list.size());

		// Instead of using [] to get elements, you must you arraylist .get() from the index

		System.out.println("Element at index 0: " + list.get(0)); // 0th index
		System.out.println("Element at index 3: " + list.get(3)); // 3rd index

		// to remove at an index do
		list.remove(4); // remove 4th index
		System.out.println("Removed 4th index: " + list);

		// but to remove the first occurance of an object do
		// [0, 3, 5, 3, 0]
		list.remove(Integer.valueOf(3));
		System.out.println("Removed first occurace of 3: " + list);
		// [0, 5, 3, 0]

		// to sort a list use the Collections class, which includes a lot of ALGORITHMS for dealing with arrays (ie collections of any type)
		Collections.sort(list);
		System.out.println("After sort: " + list);

		// to check if it has an element do
		System.out.println("Contains 5? " + list.contains(5)); // returns true if 5 is present

		// You can convert a regular array to an ArrayList. 
		Integer[] arr = list.toArray(new Integer[0]);
		// Note: the [0] is default, for whatever size.
		System.out.println(arr); // memory reference, unreadable, so:
		System.out.println("Converted list to array: " + Arrays.toString(arr));

		// Split the list by two portions

		// split list from 3 to 5
		ArrayList<Integer> splitList = new ArrayList<Integer>(list.subList(0, list.size()));
		System.out.println("Split list: " + splitList);

		// To clear all elements from a list do
		list.clear();
		System.out.println("Cleared list: " + list);


		// Filter out all odd numbers from a list
		// Create a arraylist with 10 random numbs
		// and remove all odds
ArrayList<Integer> odds = new ArrayList<>(10);
Random random = new Random();
for (int i = 0; i < 10; i++) {
	odds.add(random.nextInt(10));
}
	System.out.println("da og list" + odds);
for (int i = 0; i < odds.size(); i++) {
	if (odds.get(i) % 2 != 0) {
		odds.remove(i);
		i--;
	}
	System.out.println("List:" + odds);
}
		// make a guest list that allows the user to enter names
		// if the name exist tell the use "this person is invited"
		// continue until you type exit
ArrayList<String> people = new ArrayList<>();
people.add("Damon Albarn");
people.add("Graham Coxon");
people.add("Alex James");
people.add("Dave Rowntree");
people.add("Jarvis Cocker");
people.add("Liam Gallagher");
people.add("Noel Gallagher");
Scanner input = new Scanner(System.in);
while (true) {
	System.out.println("Enter a name or exit: ");
	String person = input.nextLine();
	if (person.equals("exit")) {
		break;
	}
	if (people.contains(person)) {
		System.out.println("this person is invited yo");
	} else {
		System.out.println("this person is not invited yo");
	}
}
		// Create a list of grocery items
		// if the user types in a food item print its index
		// if not print "Not found" and add it to the list
ArrayList<String> food = new ArrayList<>();
food.add("chicken");
food.add("milk");
food.add("eggs");
food.add("lettuce");
food.add("salmon");
Scanner scan = new Scanner(System.in);
while (true) {
	System.out.print("Enter food:");
	String foodList = scan.nextLine();
	if (foodList.equals("exit")) {
		break;
	}
	if (food.contains(foodList)) {
		int index = food.indexOf(foodList);
		System.out.println("Index:" + index);

	} else {
		System.out.println("Not found in list");
		food.add(foodList);
	}
}
	}

}
