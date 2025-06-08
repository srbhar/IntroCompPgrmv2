package myapp;

import java.util.Scanner;

public class ThreeNine_CheckISBN10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		        int isbnd = input.nextInt();

		        String isbns = String.format("%09d", isbnd);
		        int total = 0;

		        for (int i = 0; i < isbns.length(); i++) {
		        	int digit = Character.getNumericValue(isbns.charAt(i));
		            total += (i + 1) * digit;
		        }

		        int checksum = total % 11;
		        String checkChar = (checksum == 10) ? "X" : String.valueOf(checksum);

		        System.out.println("The ISBN-10 number is " + isbns + checkChar);
		        
		        input.close();
	}

}