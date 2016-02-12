import java.util.Scanner;

public class Validation {
	public static boolean continueProgram(){
		System.out.println("Would you like to continue? ");
		Scanner scan2 = new Scanner(System.in);
		String choice = scan2.nextLine();
		boolean loop = true;
		boolean gameRestart = true;
		while (loop) {
			if (choice.equalsIgnoreCase("y")) {
				gameRestart = true;
				loop = false;

			} else if (choice.equalsIgnoreCase("n")) {
				gameRestart = false;
				loop = false;

			} else {
				System.out.println("That is not a valid choice!!!!!!!");
				System.out.println("Would you like to continue? (y/n)");
				choice =scan2.nextLine();
			}
		} // end while loop
		return gameRestart;
	}
	public static String getValidatedInput(Scanner input) {
		String choice = input.nextLine();
		boolean loop = true;

		while (loop) {
			if (choice.equalsIgnoreCase("Player 1")) {
				loop = false;

			} else if (choice.equalsIgnoreCase("Player 2")) {
				loop = false;

			} else {
				System.out.println("That is not a valid choice!!!!!!!");
				System.out.println("Please enter Player 1 or Player 2");
				choice =input.nextLine();
			}
		} // end while loop
		return choice;
	}

	public static String getValidatedRoshamboChoice(Scanner input){
		String choice = input.nextLine();
		boolean loop = true;

		while (loop) {
			if (choice.equalsIgnoreCase("rock")) {
				loop = false;

			} else if (choice.equalsIgnoreCase("paper")) {
				loop = false;

			}else if (choice.equalsIgnoreCase("scissors")){
				loop = false;
			}else {
				System.out.println("That is not a valid choice!!!!!!!");
				System.out.println("Please enter Rock, Paper, or Scissors: ");
				choice =input.nextLine();
			}
		} // end while loop
		return choice;
	}
}

