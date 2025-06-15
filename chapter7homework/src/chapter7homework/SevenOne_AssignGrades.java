package chapter7homework;

import java.util.Scanner;

public class SevenOne_AssignGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get input from user of students
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		
		int[] scores = new int[students];
		
		// get each student's score and store it in the scores array
		
		System.out.print("Enter " + students + " scores: ");
		for (int i = 0; i <= students-1; i++) {
			scores[i] = input.nextInt();
		}
		
		// initialize the best variable and find the best out of all of the scores
		
		int best = scores[0];
		
		for (int j = 0; j <= scores.length-1 ; j++) {
			if (scores[j] >= best) {
				best = scores[j];
			}
		}
		
		// print final grades based on curve
		
		for (int k = 0; k <= scores.length-1; k++) {
			
			if (scores[k] >= best-10) {
				
				System.out.println("Student " + k + " score is " + scores[k] + " and grade is A");
			}
			
			else if (scores[k] >= best-20) {
				
				System.out.println("Student " + k + " score is " + scores[k] + " and grade is B");
			}
			
			else if (scores[k] >= best-30) {
				
				System.out.println("Student " + k + " score is " + scores[k] + " and grade is C");
			}
			
			else if (scores[k] >= best-40) {
				
				System.out.println("Student " + k + " score is " + scores[k] + " and grade is D");
			}
			
			else {
					System.out.println("Student " + k + " score is " + scores[k] + " and grade is F");
			}
			
		}
		
		input.close();

	}

}
