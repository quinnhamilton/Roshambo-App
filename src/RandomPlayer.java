import java.util.Random;

public class RandomPlayer extends Player {

	public static String getRoshamboValue(){
		Random r = new Random();
		int cpuChoice = r.nextInt(3);
	
		switch (cpuChoice){
		
		case 0: roshamboValue="rock";
				break;		
		case 1: roshamboValue="paper";
				break;
		case 2: roshamboValue="scissors";
				break;
		
		}
		return roshamboValue;
	}

}



//public static String getRoshamboValue(int max) {
//// start and end point for random gen
//max =2;
//
//// create random method object
//Random rand = new Random();
//int randomValue = rand.nextInt();
//
//
//switch (randomValue){
//
//case 0: roshamboValue=rock;
//		break;		
//case 1: roshamboValue=paper;
//		break;
//case 2: roshamboValue=scissors;
//		break;
//
//}
//return roshamboValue;
//}