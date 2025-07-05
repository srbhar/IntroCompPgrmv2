package chapter11homework;

import java.util.Scanner;

import java.util.ArrayList;

public class ElevenFour_MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sequence of numbers ending with 0: ");
		while (true) {
			int num = input.nextInt();
			if (num == 0) {
				break;
			}
			numbers.add(num);
		}
		
		int greatest = max(numbers);
		
		if (greatest == 0) {
			System.out.print("No numbers were entered or the list is 0.");
		} else {
		System.out.print("The greatest number is " + greatest);
		}
		
		input.close();
	}
	
	public static Integer max(ArrayList<Integer> list) {
		int greatest = 0;
		
		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i) > greatest) {
				greatest = list.get(i);
			}
		}
		
		if (greatest == 0) {
			return 0;
		} else {
			return greatest;
		}
	}

}
