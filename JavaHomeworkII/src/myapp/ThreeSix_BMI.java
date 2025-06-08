package myapp;

import java.util.Scanner;

public class ThreeSix_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		// Prompt the user to enter height in inches
		System.out.print("Enter height in feet and remaining inches: ");
		double heightfeet = input.nextDouble();
		Double heightinches = input.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant

		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double inches = (heightfeet * 12) + heightinches;
		double heightInMeters = inches * METERS_PER_INCH;
		double bmi = weightInKilograms /
		(heightInMeters * heightInMeters);

		// Display result
		System.out.printf("BMI is %.2f",bmi);
		System.out.println();
		if (bmi < 18.5)
		System.out.println("Underweight");
		else if (bmi < 25)
		System.out.println("Normal");
		else if (bmi < 30)
		System.out.println("Overweight");
		else
		System.out.println("Obese");
		
		input.close();
		}

	}
