import java.util.Scanner;

public class RPSApp {

	static String playerChoice;
	static String cpuChoice = null;
	
	public static void main(String[] args) {
		// counters for win/loss total
		boolean gameRestart = true;

		while (gameRestart) {
			Scanner input = new Scanner(System.in);
			System.out.println("Which opponent would you like to play? Choose Player 1 or Player 2. ");
			String choice = Validation.getValidatedInput(input);
			//String choice = Validation.isValidChoice(input);
			
			if (choice.equalsIgnoreCase("Player 1")) {
				cpuChoice = RockPlayer.generateRockValue();
			} else if (choice.equalsIgnoreCase("Player 2")) {
				cpuChoice = RandomPlayer.getRoshamboValue();
			}
			
			playerChoice = HumanPlayer.generateRoshamboValue(input);
			
			System.out.println(RoshamboBattle.isVictor(playerChoice, cpuChoice));

			gameRestart = Validation.continueProgram();
		}// end of while
		System.out.println("Thank you for playing!!!!!1");
		System.out.println("CPU WINS: "+RoshamboBattle.cpuCount);
		System.out.println("PLAYER WINS: "+RoshamboBattle.playerCount);
		System.out.println("TIES: "+RoshamboBattle.tieCount);
//		System.out.println("Player won "+playerCount+" times!");               // *********** TODO FIX
//		System.out.println("CPU won "+cpuCount+" times!");

	}
}
