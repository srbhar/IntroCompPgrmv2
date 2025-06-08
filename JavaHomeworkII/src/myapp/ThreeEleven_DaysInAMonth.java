package myapp;

import java.util.Scanner;

public class ThreeEleven_DaysInAMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month: ");
		int month = input.nextInt();

		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		int days;
		
		if (month % 2 == 1 && month <= 7) {
			
			days = 31;
				
		}
		
		else if (month % 2 == 0 && month > 7) {
			
			days = 31;
		
		}
		
		else if (month == 2) {
		
			days = 28;
		}
		
		else {
		
			days = 30;
		}
		
		if (year % 4 == 0 && month == 2) {
			
			days = 29;
			
			System.out.print("February " + year + " had " + days + " days.");
		}
		
		else {
			
			switch (month) {
			
			case 1: System.out.print("January"); break;
			case 2: System.out.print("February"); break;
			case 3: System.out.print("March"); break;
			case 4: System.out.print("April"); break;
			case 5: System.out.print("May"); break;
			case 6: System.out.print("June"); break;
			case 7: System.out.print("July"); break;
			case 8: System.out.print("August"); break;
			case 9: System.out.print("September"); break;
			case 10: System.out.print("October"); break;
			case 11: System.out.print("November"); break;
			case 12: System.out.print("December"); break;
			
		}
		
		System.out.print(" " + year + " had " + days + " days.");
	}
		input.close();
}
}
