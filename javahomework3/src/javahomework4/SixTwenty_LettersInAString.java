package javahomework4;

import java.util.Scanner;

public class SixTwenty_LettersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input: ");
		String s = input.nextLine();
		
		int lettercount = countLetters(s);
		
		System.out.print("There are " + lettercount + " letters in this string.");

	}
	
	public static int countLetters(String s) {
		
		int lettercount = 0;
		
		for (int i = 0; i <= s.length()-1; i++) {
			
			char ch = s.charAt(i);
			
			if (Character.isLetter(ch)) {
				lettercount++;
			}
		}
		
		return lettercount;
	}

}
