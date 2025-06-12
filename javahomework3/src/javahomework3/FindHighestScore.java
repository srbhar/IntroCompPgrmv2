package javahomework3;

import java.util.Scanner;

public class FindHighestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
        String bestName = "";
        int maxScore = Integer.MIN_VALUE;
		
		System.out.print("Enter number of students: ");
		int students = input.nextInt();
		
		int i;
		
		for (i = 1; i <= students; i++) {
			
            System.out.print("Enter name: ");
            String name = input.next();

            System.out.print("Enter score: ");
            int score = input.nextInt();
			
            if (score > maxScore) {
                maxScore = score;
                bestName = name;
            }
			
		}
		
		  System.out.println(bestName + " has the highest score of " + maxScore);
		  
		  input.close();

	}

}
