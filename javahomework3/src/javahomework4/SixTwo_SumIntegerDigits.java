package javahomework4;

import java.util.Scanner;

public class SixTwo_SumIntegerDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = sumDigits();
		
		System.out.print("Sum: " + n);

	}
	
	public static int sumDigits() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int nummy = input.nextInt();
		
		int n = 0;

		while (nummy > 0) {
			
			int digit = nummy % 10;
			n += digit;
			nummy = nummy/10;
			
			input.close();
		}
		
		return n;
		
	}
}
