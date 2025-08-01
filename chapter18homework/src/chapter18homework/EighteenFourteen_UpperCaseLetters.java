package chapter18homework;
import java.util.Scanner;
public class EighteenFourteen_UpperCaseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.next();
		input.close();
		System.out.print("Uppercase letters: " + uppercaseCount(s));
	}
	
	public static int uppercaseCount(String s) {
		if (s.length() == 0) {
			return 0;
		}
		char ch = s.charAt(s.length()-1);
		if (Character.isUpperCase(ch)) {
			return 1 + uppercaseCount(s.substring(0, s.length()-1));
		}
		else {
		return uppercaseCount(s.substring(0, s.length()-1)); }
	}

}
