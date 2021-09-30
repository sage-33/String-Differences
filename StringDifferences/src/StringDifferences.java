
//import scanner!!
import java.util.Scanner;

public class StringDifferences {

	public static void main(String[] args) {

		// Create a Scanner object1
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter String one: ");
		// enter string one
		String inputStr1 = scan.nextLine();

		System.out.println("Enter String two: ");
		// then enter string two
		String inputStr2 = scan.nextLine();

		int counter = 0;

		// for every time that the input string1 and the input string 2
		// length are the same...
		for (int i = 0; i < inputStr1.length() && i < inputStr2.length(); i++) {

			// and if they aren't equal
			if (!inputStr1.substring(i, i + 1).equals(inputStr2.substring(i, i + 1))) {

				// then print out the differences
				System.out.println(i + " " + inputStr1.subSequence(i, i + 1) + " " + inputStr2.subSequence(i, i + 1));

				// counts the number of time the if statement is ran (aka how many differences
				// there are)
				counter++;

			}
		}

		System.out.println("Number of differences: " + counter);

	}

}
