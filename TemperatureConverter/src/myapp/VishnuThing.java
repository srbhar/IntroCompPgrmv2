package myapp;

import java.util.Scanner;

public class VishnuThing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Prompt user to enter the time zone offset
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the time zone offset to GMT: ");
		        int offset = input.nextInt();

		        // Get total milliseconds since midnight, Jan 1, 1970
		        long totalMilliseconds = System.currentTimeMillis();

		        // Get total seconds since midnight, Jan 1, 1970
		        long totalSeconds = totalMilliseconds / 1000;

		        // Get current second
		        long currentSecond = totalSeconds % 60;

		        // Get total minutes
		        long totalMinutes = tot
		        	
	}

}
