import java.util.Scanner;

public class MarylandFootball {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type 1 to enter a number or 2 to enter a name: ");
		int choice1 = scanner.nextInt();
		if (choice1 == 1) {
			System.out.println("Enter player number: ");
			int choice2 = scanner.nextInt();
			if (choice2 == 5 || choice2 == 7 || choice2 == 17|| choice2 == 25) {
				System.out.println("Which player wears number " + choice2 + " on his jersey?");
				String n = scanner.nextLine();
				String answer = scanner.nextLine();
				if (choice2 == 5 && answer.equals("McFarland")) {
					System.out.println("Correct!");
				} else if (choice2 == 7 && answer.equals("Ellis")) {
					System.out.println("Correct!");
				} else if (choice2 == 17 && answer.equals("Jackson")) {
					System.out.println("Correct!");
				} else if (choice2 == 25 && answer.equals("Brooks")) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
				}
			}
			else {
				System.out.println("Invalid choice.");
			}
		} else if (choice1 == 2) {
			System.out.println("Choose a name: ");
			String n2 = scanner.nextLine();
			String choice3 = scanner.nextLine();
			if (choice3.equals("Ellis") || choice3.equals("McFarland") || choice3.equals("Brooks")|| choice3.equals("Jackson")) {
				System.out.println("What number does " + choice3 + " wear?");
				int answer2 = scanner.nextInt();
				if (answer2 == 5 && choice3.equals("McFarland")) {
					System.out.println("Correct!");
				} else if (answer2 == 7 && choice3.equals("Ellis")) {
					System.out.println("Correct!");
				} else if (answer2 == 17 && choice3.equals("Jackson")) {
					System.out.println("Correct!");
				} else if (answer2 == 25 && choice3.equals("Brooks")) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
				}
			}
			else {
				System.out.println("Invalid choice.");
			}
		}
		scanner.close();
	}
}
