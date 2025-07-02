package practice;

import java.util.Scanner;

public class TriangleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.print("Enter a color: ");
		String color = input.next();
		System.out.print("Enter a boolean value: ");
		boolean filled = input.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		GeometricObject properties = new GeometricObject(color, filled);
		
		System.out.println("The area is " + triangle.getArea(side1, side2, side3) + ".");
		System.out.println("The perimeter is " + triangle.getPerimeter(side1, side2, side3) + ".");
		
		System.out.println("The color is " + properties.getColor());
		System.out.println("Is it filled? " + properties.isFilled());
		
		input.close();

	}

}
