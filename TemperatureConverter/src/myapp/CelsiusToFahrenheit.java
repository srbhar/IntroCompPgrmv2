package myapp;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				
				System.out.print("Enter a degree in Celsius: ");
				double celsius = input.nextDouble();
				
				double fahrenheit = (9. / 5.) * celsius + 32.;
				
				System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
				
				input.close();
	}
}