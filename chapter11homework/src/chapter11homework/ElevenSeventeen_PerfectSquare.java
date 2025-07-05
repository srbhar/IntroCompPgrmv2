package chapter11homework;

import java.util.Scanner;
import java.util.ArrayList;

public class ElevenSeventeen_PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> factors = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int morig = m;
		
		// prime factors to array list
		
		for (int i = 2; i< morig/2; i++) {
			if (m % i == 0) {
				while (m % i == 0) {
					m = m/i;
					factors.add(i);
				}
			}
		}
		
		if (m > 1) { factors.add(m); }
	
		// new array for number of times a number appears in the array list
		
		int [] times = new int[morig+1];
		
		for (int value : factors) {
			times[value]++;
		}
		
		int n = 1;
		
		for (int i = 0; i < times.length; i++) {
			if (times[i] % 2 == 1) {
				n *= i;
			}
		}
		
		int product = morig * n;
		
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		System.out.print("m * n is " + product);
		
		input.close();

	}

}
