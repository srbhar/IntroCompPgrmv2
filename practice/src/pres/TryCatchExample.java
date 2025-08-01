package pres;
import java.util.Scanner;
public class TryCatchExample {

	public static void main(String[] args) {
		// This is a method that prints a number!
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter a number: "); // Code where error could occur.
			int number = input.nextInt();
			System.out.print("The number is " + number + ".");
		} catch (Exception e) { // If the input is not a number, it gives a message.
			System.out.print("This is not a number, my friend.");
		} // You can also catch multiple exceptions.
		// This can give different messages for different exceptions.
		input.close();
	}

}
