package myapp;

import java.util.Scanner;

public class ThreeTwelve_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
	      System.out.print("Enter a three-digit integer: ");
	        String number = input.nextLine();

	        int a = Character.getNumericValue(number.charAt(0));
	        int b = Character.getNumericValue(number.charAt(1));
	        int c = Character.getNumericValue(number.charAt(2));
	        
	        String status;
	        
	        if (a == c) {
	        	
	        	status = " is ";
	        }
	        
	        else {
	        	
	        	status = " is not ";
	        }
	        
	        System.out.print(number + status + "a palindrome.");
	        
	        input.close();

	}

}
