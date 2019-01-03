package Excel;

import java.util.Scanner;

public class game {
  public final static int totalOvers = 20;
  public final static String BallType_wid = "wide";
  public final static String BallType_nob = "Noball";
  public final static String BallType_fBall= "FairBall";
  public final static int Total_Wicket = 10;
  
	public static void main(String[] args) {
		
		
//		int ballsperOver = 6;
//		int numberofballs =0;	
//		int overs=0;
//		int wickets_no = 0;
//		int numof_balls=0;
//		int score = 0;
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter ball Type: ");
//		String currentBall = input.nextLine();
		
				
//				if(currentBall.equalsIgnoreCase(BallType_wid)||currentBall.equalsIgnoreCase(BallType_nob)) {
					
//					System.out.println("Current ball type: "+currentBall);
//					System.out.println("previous score: "+score);
//					score++;
//					System.out.println("Current score: "+score);
					cricDisplay();
		}
	
	
	public static void cricDisplay() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of overs");
		int totalovers = sc.nextInt();
		System.out.println("Enter Total Balls In Each Over");
		int ballcount = sc.nextInt();
		int totalruns = 0;
		int runs = 0;
		for (int i = 1; i <= totalovers; i++) {
			for (int j = 1; j <= ballcount; j++) {
				System.out.println("Enter Ball Type:");
				String ballType = sc.next();
				if (ballType.equals("wide") || ballType.equals("NoBall")) {
					runs = runs + 1;
					totalruns = totalruns + runs;
					ballcount = ballcount + 1;
					System.out.println("The Ball type is " + ballType + " so an extra run is added");
				} else if (ballType.equals("fair")) {
					System.out.println("enter total runs scored for this ball:");
					runs = sc.nextInt();
					if (runs == 6 || runs == 4) {
						runs = totalruns + runs;
						System.out.println("total no. of runs scored: " + runs);
					} else {
						System.out.println("enter no. of wickets:");
						int wickets = 0;
						wickets = sc.nextInt() + wickets;
						runs = totalruns + runs;
						System.out.println("total no. of runs scored: " + runs);
						System.out.println("Total No. of Wickets = " + wickets);
					}

				}
			}
		}
	}



}
