package javahomework4;

import java.util.Scanner;

public class SixTwentyThree_OccurencesOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string followed by a character: ");
		String str = input.next();
		char a = input.next().charAt(0);
		
		int hey = count(str, a);
		
		System.out.print("The letter " + a + " occurs in the word " + str + " " + hey + " times.");
		
		input.close();

	}
	
	public static int count(String str, char a) {
		
		int common = 0;
		
		for (int i = 0; i <= str.length()-1; i++) {
			char ch = str.charAt(i);
			if (a == ch) {
				common++;
			}
		}
		
		return common;
	}

}
