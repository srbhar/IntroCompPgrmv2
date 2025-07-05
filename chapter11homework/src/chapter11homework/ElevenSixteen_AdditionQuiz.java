package chapter11homework;

import java.util.Scanner;

import java.util.ArrayList;

public class ElevenSixteen_AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		ArrayList<Integer> entries = new ArrayList<>();
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
		"What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		entries.add(answer);
		
		while (number1 + number2 != answer) {
		System.out.print("Wrong answer. Try again. What is "
		+ number1 + " + " + number2 + "? ");
		answer = input.nextInt(); // added component to the while loop where if it has already been entered
		boolean there = false; // then the user has to enter again
		for (int i = 0; i < entries.size(); i++) {
			if (answer == entries.get(i)) {
				there = true;
				break;
			}
		}
		if (there == false) {
			entries.add(answer);
		} else {
			System.out.println("You already entered " + answer);
		}
		}
		
		System.out.println("You got it!");
		
		input.close();
	}

}
