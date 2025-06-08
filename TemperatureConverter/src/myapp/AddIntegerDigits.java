package myapp;

import java.util.Scanner;

public class AddIntegerDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		
		int user = input.nextInt();
		
		int k = user % 100;
		
		int c = k%10;
		
		int b = k/10;
		
		int a = user/100;
		
		int sum = a+b+c;
		
		System.out.print("The sum of the digits is " + sum);
		
		input.close();

	}

}
