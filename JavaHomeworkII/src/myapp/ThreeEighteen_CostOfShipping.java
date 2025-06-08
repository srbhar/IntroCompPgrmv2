package myapp;

import java.util.Scanner;

public class ThreeEighteen_CostOfShipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package in pounds: ");
		double weight = input.nextDouble();
		
		double dollarcost;
		
		if (weight > 0 && weight < 1 || weight == 1) {
			
			dollarcost = 3.5;
			
			System.out.print("The cost is $" + dollarcost);
		}
		
		else if (weight > 1 && weight < 3 || weight == 3) {
			
			dollarcost = 5.5;
			
			System.out.print("The cost is $" + dollarcost);
		}
		
		else if (weight > 3 && weight < 10 || weight == 10) {
			
			dollarcost = 8.5;
			
			System.out.print("The cost is $" + dollarcost);
		}
		
		else if (weight > 10 && weight < 20 || weight == 20) {
			
			dollarcost = 10.5;
			
			System.out.print("The cost is $" + dollarcost);
		}
		
		else if (weight > 20) {
			
			System.out.print("The package cannot be shipped.");
		}
		
		else {
			
			System.out.print("Please enter a valid number that can be used to calculate the shipping cost.");
		}
		
		input.close();

	}

}
