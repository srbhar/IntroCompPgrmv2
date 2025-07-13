package chapter12homework;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TwelveThirty_OccurrencesOfEachLetter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		String filename = input.next();
		input.close();

		int[] occurrences = new int[26];
		
		File file = new File(filename);
		Scanner fileread = new Scanner(file);
		while (fileread.hasNext()) {
			String string = fileread.next();
		    for (int i = 0; i < string.length(); i++) {
		        char ch = string.charAt(i);
		        if (Character.isLetter(ch)) {
		            ch = Character.toUpperCase(ch);
		            occurrences[ch - 'A']++;
		        }
		}

	}
		
		char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println("Number of " + alphabets[i] + "'s: " + occurrences[i]);
		}
		
		fileread.close();

}
}