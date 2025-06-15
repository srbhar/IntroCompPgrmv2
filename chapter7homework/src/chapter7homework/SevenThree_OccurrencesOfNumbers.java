package chapter7homework;

import java.util.Scanner;

public class SevenThree_OccurrencesOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] counts = new int[101];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int number = input.nextInt();
		
		while (number != 0) {
			if (number >= 1 && number <= 100) {
                counts[number]++;
            }
            number = input.nextInt();
		}
		
		for (int i = 1; i <= 100; i++) {
			
			if (counts[i] > 0) {
				System.out.print(i + " occurs " + counts[i]);
				
				if (counts[i] == 1) {
					System.out.print(" time.");
				} else {
					System.out.print(" times.");
				}
				
				System.out.println();
			}
		}
		
		input.close();

	}

}
