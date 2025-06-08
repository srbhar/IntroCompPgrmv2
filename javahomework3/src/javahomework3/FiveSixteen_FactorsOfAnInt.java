package javahomework3;

import java.util.Scanner;

public class FiveSixteen_FactorsOfAnInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		
		int i = 1;
		
		while (i < a/2) {
			
			i = i +1;
			
			while (a % i == 0) {
				
				a = a/i;
				
				System.out.print(i + " ");

			}
			
		}
		
		if (a != 0 && a != 1) {
			
			System.out.print(a);
		}
		
		input.close();
	}

}
