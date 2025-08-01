package practice;
import java.util.Scanner;
public class PigLatinTranslator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.next();
		input.close();
		System.out.print("Pig latin: " + translate(word));
	}
	
	public static String translate(String original) {
		
		original = original.toLowerCase();
		
		if (original.charAt(0) == 'a' || original.charAt(0) == 'e' || original.charAt(0) == 'i' || original.charAt(0) == 'o' || original.charAt(0) == 'u') {
			return original + "way";
		}
		
		return original.substring(1) + original.charAt(0) + "ay";
	}

}