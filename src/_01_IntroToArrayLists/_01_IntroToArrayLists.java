package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		// 2. Add five Strings to your list
		names.add("Alex");
		names.add("Bob");
		names.add("Cans");
		names.add("Delta");
		names.add("E");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		// 4. Print all the Strings using a for-each loop
		for (String namess : names) {
			System.out.println(namess);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i++) {
			if (i % 2 == 1) {
				System.out.println(names.get(i));
			} else {

			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = names.size(); i > 0; i--) {
			System.out.println(names.get(i - 1));
		}

		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i++) {
			for (int j = 0; j < names.get(i).length(); j++) {
				if (names.get(i).charAt(j) == 'e' || names.get(i).charAt(j) == 'E') {
					System.out.println(names.get(i));
				}
			}
		}
	}
}
