package myapp;

import java.util.Scanner;

public class ComputingBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();
		
		double weight = 0.45359237 * pounds;
		
		double height = 0.0254 * inches;
		
		double bmi = weight/(height * height);
		
		System.out.printf("BMI is %.4f",bmi);

		input.close();
	}

}
