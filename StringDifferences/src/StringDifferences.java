import java.util.Scanner; //import scanner!!

public class StringDifferences {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Create a Scanner object1

		System.out.println("Enter String one: ");
		String inputStr1 = scan.nextLine(); // enter string one

		System.out.println("Enter String two: ");
		String inputStr2 = scan.nextLine(); // then enter string two

		int counter = 0;

		for (int i = 0; i < inputStr1.length() && i < inputStr2.length(); i++) { // for every time that the input
																					// string1 and the input string 2
																					// length are the same...
			if (!inputStr1.substring(i, i + 1).equals(inputStr2.substring(i, i + 1))) { // and if they aren't equal

				System.out.println(i + " " + inputStr1.subSequence(i, i + 1) + " " + inputStr2.subSequence(i, i + 1)); // then
																														// print
																														// out
																														// the
																														// differennces

				counter++; // counts the number of time the if statement is ran (aka how many differences
							// there are)

			}
		}

		System.out.println("Number of differences: " + counter);

	}

}
