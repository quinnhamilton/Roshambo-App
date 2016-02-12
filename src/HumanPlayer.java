import java.util.Scanner;

public class HumanPlayer extends Player {

		static String generateRoshamboValue(Scanner input){
			System.out.println("Please choose Rock, Paper, or Scissors: ");
			return Validation.getValidatedRoshamboChoice(input);
		}
	
}
