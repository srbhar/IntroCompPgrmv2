package practice;
import java.util.Scanner;
public class EighteenNine_StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String nonreversed = input.next();
		System.out.print("Reversed: ");
		reverseDisplay(nonreversed);
		input.close();
	}
	
	public static void reverseDisplay(String value) {
		if (value.length() == 0) {
			return;
		} else {
			System.out.print(value.charAt(value.length()-1));
			reverseDisplay(value.substring(0, value.length()-1));
		}
	}

}
