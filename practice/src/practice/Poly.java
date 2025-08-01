package practice;
import java.util.Scanner;
public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first root: ");
		int root1 = input.nextInt();
		System.out.print("Enter the second root: ");
		int root2 = input.nextInt();
		System.out.print("Enter the third root: ");
		int root3 = input.nextInt();
		
		input.close();
		
		root1 *= -1;
		root2 *= -1;
		root3 *= -1;
		
		int origcoeff1 = root2 + root1;
		int origcoeff2 = root1 * root2;
		
		int coeff1 = root3 + origcoeff1;
		int coeff2 = origcoeff1 * root3 + origcoeff2;
		int coeff3 = origcoeff2 * root3;
		
		System.out.println("The polynomial is: ");
		System.out.print("x^3");
		System.out.print(coeff1 > 0 ? "+" + coeff1 + "x^2" : coeff1 + "x^2");
		System.out.print(coeff2 > 0 ? "+" + coeff2 + "x": coeff2 + "x");
		System.out.print(coeff3 > 0 ? "+" + coeff3 : coeff3);
		
		} catch (Exception e) {
			System.out.print("Please enter a valid value.");
		}
		

	}

}
