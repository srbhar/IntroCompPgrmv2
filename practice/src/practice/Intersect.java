package practice;
import java.util.*;
public class Intersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the constant d: ");
		int d = input.nextInt();
		System.out.print("Enter the constant f: ");
		int f = input.nextInt();
		System.out.print("Enter the constant g: ");
		int g = input.nextInt();
		System.out.print("Enter the constant m: ");
		int m = input.nextInt();
		System.out.print("Enter the constant b: ");
		int b = input.nextInt();
		
		input.close();
		
		int c1 = d;
		int c2 = f-m;
		int c3 = g-b;
		
		System.out.println("The intersection(s) is/are: ");
		
		double discriminant = (c2 * c2) - (4*c1*c3);

		
		if (discriminant < 0) {
			System.out.print("They do not intersect.");
		}
		else {
			double x1 = (-c2 + (Math.sqrt(discriminant)))/(2*c1);
			
			double y1 = m * x1 + b;
			System.out.println("(" + x1 + "," + y1 + ")");
			
			if (discriminant > 0) {
				double x2 = (-c2 - (Math.sqrt((c2 * c2) - (4*c1*c3))))/(2*c1);
				double y2 = m * x2 + b;
				System.out.print("(" + x2 + "," + y2 + ")");
			}
		}
				
		} catch (Exception e) {
			System.out.print("Please enter a valid input.");
		}
		
	}

}
