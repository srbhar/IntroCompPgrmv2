package myapp;

import java.util.Scanner;

public class CalculatingEnergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double waterkg = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialtemp = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finaltemp = input.nextDouble();
		
		double energyneeded = waterkg * (finaltemp-initialtemp) * 4184;
		
		System.out.print("The energy needed is " + energyneeded);
		
		input.close();
	}

}
