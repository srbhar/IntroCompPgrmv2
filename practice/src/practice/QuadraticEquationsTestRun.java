package practice;
import java.util.Scanner;
public class QuadraticEquationsTestRun {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the values for a, b, and c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		QuadraticEquation values = new QuadraticEquation(a, b, c);
		
		if ((Math.pow(b, 2) - (4*a*c)) > 0) {
			System.out.print("Roots: " + values.getRoot1() + " " + values.getRoot2());
		}
	else if (((Math.pow(b, 2) - (4*a*c)) == 0)) {
		System.out.print("Root: " + values.getRoot1());
	}
	else {
		System.out.print("The equation has no roots.");
	}
input.close();
}
}