package javahomework4;

import java.util.Scanner;

public class SixFour_IntegerReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int reversed = reverse(number);
		
		System.out.print(reversed);
		
		input.close();

	}
	
	public static int reverse(int number) {
		
		String hi = Integer.toString(number);
		String reversed = "";
		
		for (int i = hi.length() - 1; i >= 0; i--) {
			
			reversed += hi.charAt(i);
		}
		
		return Integer.parseInt(reversed);
		
		
	}

}
