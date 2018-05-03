import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BonusLab20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";

		System.out.println("Welcome to Java's Market!");

		HashMap<String, Double> list = new HashMap<>();
		list.put("apple", 1.30);
		list.put("banana", 1.05);
		list.put("cauliflower", 2.50);
		list.put("carrots", 1.60);
		list.put("green beans", 1.80);
		list.put("onions", 1.20);
		list.put("potatoes", 3.00);
		list.put("celery", 2.75);

		ArrayList<String> menuItems = new ArrayList<>();

		ArrayList<Double> itemPrices = new ArrayList<>();

		String item1;

		while (cont.equalsIgnoreCase("y")) {
			// printing the list as a table for the user
			// this should be in a loop to re-print the menu of items if the user does not
			// enter correct input

			System.out.println("Item" + "     " + "Price");
			for (String item : list.keySet()) {
				System.out.println(item + "     " + list.get(item));

			}
			System.out.println("What item would you like to order?");
			item1 = scan.nextLine();
			if (list.containsKey(item1)) {
				System.out.println("Adding " + item1 + " to cart at " + list.get(item1));

				// array list storing items

				menuItems.add(item1);

				itemPrices.add(list.get(item1));

			} else {
				System.out.println("Sorry, we don't have those. Please try again");

			} // end loop so that menu displays again for user

			System.out.println("Would you like to order anything else? (y/n)");
			cont = scan.nextLine();
		}

		// display user order items and prices in columns
		System.out.println("Thanks for your order! \nHere's what you've got: \n");
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println(menuItems.get(i) + " " + itemPrices.get(i));

		}
		// average prices of the items ordered
		double avg = getAverage(itemPrices);
		System.out.println("Average price per item in order was " + avg);

		double highIndex = findHighIndex(itemPrices);
		System.out.println("Index of highest value is " + highIndex);

		double lowIndex = findLowIndex(itemPrices);
		System.out.println("Index of lowest value is " + lowIndex);

		scan.close();
	}

	// method to find average of items prices -- still working
	public static double getAverage(ArrayList<Double> itemPrices) {
		double sum = 0;
		for (int i = 0; i < itemPrices.size(); i++) {
			sum += itemPrices.get(i);

		}
		return sum / itemPrices.size();

	}

	// method to find the index of highest price -- still working
	public static int findHighIndex(ArrayList<Double> itemPrices) {

		double maxVal = 0;
		for (double price : itemPrices) {
			if (price > maxVal) {
				maxVal = price;

			}

		}

		return 0;

	}

	// method to find index of lowest price
	public static int findLowIndex(ArrayList<Double> itemPrices) {

		double min = Double.MAX_VALUE;
		for (double price : itemPrices) {
			if (price < min) {
				min = price;
			}
		}

		return 0;

	}

}
