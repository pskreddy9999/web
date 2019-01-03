package Excel;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.internal.runners.model.EachTestNotifier;

public class OversCalculator {

	public final static int totalOvers = 3;

	public final static String BALLTYPE_WID = "Wide";
	public final static String BALLTYPE_NOB = "Noball";
	public final static String BALLTYPE_FAIRB = "Fairball";
	public final static int TOTALWICKETS = 10;

	public static void main(String[] args) {

		int ball = 0;
		int score = 0;
		int currentOver = 0;
		int nextOver = 0;
		int ballperOver = 6;
		int numberofballs = 0;
		int noOfWickets = 0;
		int crntballNum = 0;
		String pName = " ";
		int playerscore = 0;
		int ballsfacedByplayer = 0;
		String w = null;
		Hashtable<String, Integer> strvals = new Hashtable<>();
		strvals.put(pName, playerscore);
		

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the player name: ");
        pName = input.nextLine();
        
		for (; currentOver < totalOvers; currentOver++) {

			for (; ball < ballperOver;) {
				
				if(!pName.matches("[a-zA-Z_]+")) {
		        	System.out.println("Only names allowed, Numbers and special chars or not allowed");
		        	System.out.println("Enter the player name: ");
		        	pName = input.nextLine();
				}				
				System.out.println("Enter Ball Type ");
				String currentBall = input.nextLine();

				if (currentBall.equalsIgnoreCase(BALLTYPE_NOB) || currentBall.equalsIgnoreCase(BALLTYPE_WID)) {
					System.out.println(currentBall + " Ball by the bolwer actually good line and length but too swing to leg side");
					score++;
					System.out.println("Current Score  " + score + " Wickets " + noOfWickets + " no of balls: " + ball);
				} else if (currentBall.equalsIgnoreCase("w")) {
					noOfWickets++;
					ball++;
					crntballNum++;
					ballsfacedByplayer+=1;
					strvals.put(pName, playerscore);
					
					System.out.println("player out: "+ pName+ "|"+ "runs scored "+ playerscore +"|"+"ball faced by player "+ballsfacedByplayer);
					playerscore=0;
					ballsfacedByplayer = 0;
					
					if (noOfWickets < TOTALWICKETS) {
						System.out.println("current Score " + score + " Wickets " + noOfWickets + " |"
								+ ball + " Balls complted " );
					}
					System.out.println("Enter the player name: ");
			        pName = input.nextLine();
			        strvals.put(pName, playerscore);
			        
					
				} else if (Integer.valueOf(currentBall) <= 6) {					
                    
					int currentruns = Integer.valueOf(currentBall);

					score += currentruns;
					ball++;
					crntballNum++;
					playerscore += Integer.valueOf(currentBall);
					ballsfacedByplayer++;
					System.out.println("Current Score  " + score + " Wickets " + noOfWickets + " no of balls: " + ball);
				} else {
					System.out.println("Enter the correct score in b/w 0 to 6 or noball or wide or wicket");
				}

				if (noOfWickets == TOTALWICKETS) {
					System.out.println("All Out: ");
					System.out.println("Total Score : " + score + "|" + " Wickets: " + noOfWickets +"|"+ " no of balls faced the team: "
							+ crntballNum );
					System.exit(0);
				}
			}
			nextOver = currentOver + 1;
			System.out.println(nextOver == totalOvers ? " matched finished" : + nextOver + " Over Completed " );
			ball = 0;
			System.out.println(
					"Total Score  " + score + " | "+ " Wickets " + noOfWickets +"|" + " no of balls: " + crntballNum);
		}
		Integer n =strvals.get(pName);
		if(n!=null) {
			System.out.println(n +" and score "+ playerscore);
		}
    }

}
