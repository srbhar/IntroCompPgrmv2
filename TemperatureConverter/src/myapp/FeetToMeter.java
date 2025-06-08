package myapp;

import java.util.Scanner;

public class FeetToMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		double meters = feet * 0.305;
		
		System.out.print(feet + " feet is " + meters + " meters ");
		
		input.close();

	}

}
