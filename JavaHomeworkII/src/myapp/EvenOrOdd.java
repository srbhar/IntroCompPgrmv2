package myapp;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if (number % 2 == 0) {
			
			System.out.print("Even");
		}
		
		else {
			
			System.out.print("Odd");
		}
		
		input.close();

	}

}
