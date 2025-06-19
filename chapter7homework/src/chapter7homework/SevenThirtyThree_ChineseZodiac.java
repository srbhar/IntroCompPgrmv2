package chapter7homework;

import java.util.Scanner;

public class SevenThirtyThree_ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
		
		int remainder = year % 12;
		
		System.out.print(zodiacs[remainder]);
		
		input.close();

	}

}
