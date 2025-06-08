package myapp;

import java.util.Scanner;

public class GratuityAndTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityrate = input.nextDouble();
		
		double gratuity = (gratuityrate/100)*subtotal;
		
		double total = gratuity + subtotal;
		
		System.out.print("The gratuity is $" + gratuity + " and total is $" + total);
		
		input.close();

	}

}
