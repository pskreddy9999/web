package Excel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cricket {
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

		Scanner input = new Scanner(System.in);

		for (; currentOver < totalOvers; currentOver++) {

			for (; ball < ballperOver;)
 {

				System.out.println("Enter Ball Type ");
				String currentBall = input.nextLine();

				if (currentBall.equalsIgnoreCase(BALLTYPE_NOB) || currentBall.equalsIgnoreCase(BALLTYPE_WID)) {
					System.out.println("Its " + currentBall);
					score++;
					System.out.println("Current Score  " + score + " Wickets " + noOfWickets + " no of balls: " + ball);
				} else if (currentBall.equalsIgnoreCase("w")) {
					noOfWickets++;
					ball++;
					crntballNum++;
					if (noOfWickets < TOTALWICKETS) {
						System.out.println("current Score " + score + " Wickets " + noOfWickets + " |"
								+ " Balls complted " + ball);
					}
				} else if (Integer.valueOf(currentBall) <= 6) {

					int currentruns = Integer.valueOf(currentBall);

					score += currentruns;
					ball++;
					crntballNum++;
					System.out.println("Current Score  " + score + " Wickets " + noOfWickets + " no of balls: " + ball);
				} else {
					System.out.println("Enter the correct score in b/w 0 to 6 or noball or wide or wicket");
				}

				if (noOfWickets == TOTALWICKETS) {
					System.out.println("All Out: ");
					System.out.println("Total Score : " + score + "|" + " Wickets: " + noOfWickets + " no of balls: "
							+ "|" + crntballNum + " : number balls faced the team");
					System.exit(0);
				}
			}
			nextOver = currentOver + 1;
			System.out.println(nextOver == totalOvers ? " matched finished" : " Over Completed " + nextOver);
			ball = 0;
			System.out.println(
					"Total Score  " + "|" + score + " Wickets " + noOfWickets + "|" + " no of balls: " + crntballNum);
		}
	}


}
