package myapp;

import java.util.Scanner;

public class ThreeTwentySix_UsingLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		System.out.print("Is " + integer + " divisible by 5 and 6? ");
		
		if (integer%5 == 0 && integer%6 == 0) {
			
			System.out.println(true);
		}
		
		else {
			
			System.out.println(false);
		}
		
		System.out.print("Is " + integer + " divisible by 5 or 6? ");
		
		if (integer%6 == 0 || integer % 5 == 0) {
			
			System.out.println(true);
		}
		
		else {
			
			System.out.println(false);
		}
		
		System.out.print("Is " + integer + " divisible by 5 or 6, but not both? ");
		
		if ((integer % 6 == 0 || integer % 5 == 0) && (integer % 6 != 0 || integer % 5 != 0)) {
			
			System.out.println(true);
		}
		
		else {
			
			System.out.print(false);
		}

		input.close();
	}

}
