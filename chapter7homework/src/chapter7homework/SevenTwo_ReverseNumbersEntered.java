package chapter7homework;

import java.util.Scanner;

public class SevenTwo_ReverseNumbersEntered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] integers = new int[10];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		
		for (int i = 0; i <= 9; i++) {
			integers[i] = input.nextInt();
			
		}
		
		for (int j = 9; j >= 0; j--) {
			
			System.out.print(integers[j] + " ");
		}
		
		input.close();

	}

}
