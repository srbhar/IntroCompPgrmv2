package myapp;

import java.util.Scanner;

public class AreaAndVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		
		double radius = input.nextDouble();
		
		double length = input.nextDouble();
		
		double pi = 3.141592736923;
		
		double area = radius * radius * pi;
				
		double volume = area * length;
		
		System.out.println("The area is " + area);
		
		System.out.print("The volume is "+ volume);
		
		input.close();
		

	}

}
