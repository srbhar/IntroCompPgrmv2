package chapter18homework;
import java.util.Scanner;
public class EighteenEleven_SumDigitsInAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int sum = sumDigits(input.nextInt());
		input.close();
		System.out.print("Sum: " + sum);
		
	}
	
	public static int sumDigits(long n) {
		if (n == 0) {
			return 0;
		}
		return (int) ((n % 10) + sumDigits(n/10));
	}

}
