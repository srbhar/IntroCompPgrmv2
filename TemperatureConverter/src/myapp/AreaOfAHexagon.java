package myapp;

import java.util.Scanner;

public class AreaOfAHexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		
		double side = input.nextDouble();
		
		double rootthree = Math.sqrt(3);
		
		double area = ((3*rootthree)/2)*(side * side);
		
		System.out.printf("The area of the hexagon is %.4f", area);
		
		input.close();

	}

}
