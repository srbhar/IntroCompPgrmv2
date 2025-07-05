package chapter11homework;

import java.util.Scanner;
import java.util.ArrayList;

public class ElevenThirteen_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		System.out.print("The distinct integers are: ");
		removeDuplicate(list);
		
		input.close();

	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		ArrayList<Integer> uniques = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) { // loop through all 10 integers, if not in the new list, add it
			boolean there = false;
			for (int j = 0; j < uniques.size(); j++) {
				if (uniques.get(j) == list.get(i)) {
					there = true;
					break;
				}
			}
			if (there == false) {
				uniques.add(list.get(i));
			}
		}
		
		System.out.print(uniques);
	}

}
