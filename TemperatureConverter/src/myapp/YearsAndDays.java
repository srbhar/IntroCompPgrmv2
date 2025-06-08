package myapp;

import java.util.Scanner;

public class YearsAndDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		if input = 
		
		int minsinayear = 525600;
		
		int years = minutes/minsinayear;
				
		int k = minutes%minsinayear;
		
		int minsinaday = 1440;
		
		int days = k/minsinaday;
		
		System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
		
		input.close();

	}

}
