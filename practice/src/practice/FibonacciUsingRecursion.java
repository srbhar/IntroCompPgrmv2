package practice;
import java.util.Scanner;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the fibonacci index: ");
		int index = input.nextInt();
		System.out.print("The fibonacci number at index " + index + " is " + fibonacci(index));
		input.close();

	}
	
	public static int fibonacci(int index) {
		if (index < 2) {
			return index;
		} else {
			return fibonacci(index-1) + fibonacci(index - 2);
		}
	}

}
