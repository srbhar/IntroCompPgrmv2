package hw7_16;
import java.util.Scanner;
import java.util.ArrayList;
public class SevenThirtyFive_Hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean runagain = true;
		String[] words = {"person", "mother", "child", "water", "computer", "tickle", "pickle", "mushroom", "hibiscus", "troll", "cart", "cat", "think", "hoodie", "rodent", "chiropractor", "mask", "godzilla", "blizzard", "truncate", "programming", "supercalifragilisticexpialidocious"};
		while (runagain) {
		String word = words[(int) (Math.random()*words.length)];
		char[] wordparts = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			wordparts[i] = word.charAt(i); // adding parts of the word to new array
		}
		char[] shown = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			shown[i] = '*';
		}
		int errors = 0;
		ArrayList<Character> guesses = new ArrayList<>(); // stores what the user already guessed
		while (wordparts.length > 0) {
			System.out.print("(Guess) Enter a letter in word ");
			for (int i = 0; i < shown.length; i++) {
				System.out.print(shown[i]); // print shown
			}
			System.out.println(": ");
			char guess = input.next().charAt(0); // user input is single character
			if (guesses.contains(guess)) {
				System.out.println(guess + " was already guessed.");
				continue;
			} else { guesses.add(guess); } // otherwise add guess to the list
			boolean there = false;
			for (int i = 0; i < word.length(); i++) {
				if (wordparts[i] == guess) {
					shown[i] = guess; // add guess to what's shown if it's in the word
				}
			}
			for (int i = 0; i < wordparts.length; i++) {
				if (wordparts[i] == guess) {
					there = true; // check if it is in the word at all
					break;
				}
			}
			if (!there) {
				errors++; // catch number of times the person missed
				System.out.println(guess + " is not in the word.");
				continue;
			}
			int off = 0;
			for (int i = 0; i < shown.length; i++) {
				if (!Character.isLetter(shown[i])) { // if it's not a letter, add to the off count
					off++;
				}
			}
			if (off == 0) {
				break; // break out to print the rest
			}
			
		}
		System.out.print("The word is " + word + ". You missed " + errors);
		System.out.println(errors == 1 ? " time." : " times.");
		System.out.println(errors > 6 ? "You lost the game buddy." : "You did not lose the game!");
		System.out.println("Do you want to play again? Enter y or n: ");
		String decision = input.next();
		if (decision.equals("n")) {
			runagain = false;
			System.out.println("Have a great day!");
			return;
		}
		else {
			runagain = true;
		}
		}

	}

}
