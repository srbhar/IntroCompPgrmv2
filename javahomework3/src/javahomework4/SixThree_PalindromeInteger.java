package javahomework4;

import java.util.Scanner;

public class SixThree_PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int original = input.nextInt();
		
		int reversed = reverse(original);
		
		if (isPalindrome(original)) {
			System.out.println(original + " is a palindrome.");
		} else {
			System.out.println(original + " is not a palindrome.");
		}
		
		input.close();

	}
	
	public static int reverse(int original) {
		
		String hi = Integer.toString(original);
		
		String reversed = "";
		
		for (int i = hi.length()-1; i >= 0; i--) {
			
			reversed += hi.charAt(i);
		}
		
		return Integer.parseInt(reversed);
		
	}
	
	public static boolean isPalindrome(int number) {
		
		int reversed = reverse(number);
		return number == reversed;

}
}
