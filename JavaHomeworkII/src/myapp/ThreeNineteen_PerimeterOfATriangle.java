package myapp;

import java.util.Scanner;

public class ThreeNineteen_PerimeterOfATriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Three edges of the triangle: ");
		double edgeone = input.nextDouble();
		double edgetwo = input.nextDouble();
		double edgethree = input.nextDouble();
		
		if ((edgeone + edgetwo > edgethree) && (edgeone + edgethree > edgetwo) && (edgetwo + edgethree > edgeone)) {
			
			double perimeter = edgeone + edgetwo + edgethree;
			
			System.out.print("The perimeter is " + perimeter + ".");
		}
		
		else {
			
			System.out.print("The input is invalid.");
		}
		
		input.close();

	}

}
