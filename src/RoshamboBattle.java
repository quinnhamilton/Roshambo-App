
public class RoshamboBattle {

	static int playerWins = 0; // -1 for cpu win 0 for tie 1 for player win
	static String victoryString = "whater";
	static int playerCount = 0;
	static int cpuCount = 0;
	static int tieCount =0;

	public static String isVictor(String playerChoice, String cpuChoice) {

		if (playerChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("rock")) {
			playerWins = 0;
			tieCount++;
		} else if (playerChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("paper")) {
			playerWins = -1;
			cpuCount++;
		} else if (playerChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("scissors")) {
			playerWins = 1;
			playerCount++;
		} else if (playerChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("rock")) {
			playerWins = 1;
			playerCount++;
		} else if (playerChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("paper")) {
			playerWins = 0;
			tieCount++;
		} else if (playerChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("scissors")) {
			playerWins = -1;
			cpuCount++;
		} else if (playerChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("rock")) {
			playerWins = -1;
			cpuCount++;
		} else if (playerChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("paper")) {
			playerWins = 1;
			playerCount++;
		} else if (playerChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("scissors")) {
			playerWins = 0;
			tieCount++;
		}
		return victoryMessage(playerWins);
	}

	public static String victoryMessage(int playerWins) {
		
		switch(playerWins){
		
		case -1:
			victoryString= "Cpu Wins!";
			break;
		case 0:
			victoryString="Tie!";
			break;
		case 1:
			victoryString="You Win!";
			break;
		}
		
		return victoryString;
	}

}
