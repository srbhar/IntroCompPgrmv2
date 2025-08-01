package chapter18homework;
import java.util.Scanner;
public class EighteenTwentyFive_StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        input.close();
        System.out.println("Permutations:");
        displayPermutation(s);
        
	}
	
	public static void displayPermutation(String s) {
        displayPermutation("", s);
	}
	
	public static void displayPermutation(String s1, String s2) {
		
        if (s2.length() == 0) {
            System.out.println(s1); // when nothing's left, print string
        } else {
            for (int i = 0; i < s2.length(); i++) {
                char ch = s2.charAt(i);
                String remaining = s2.substring(0, i) + s2.substring(i + 1); // remove one char from s2 for the remaining
                displayPermutation(s1 + ch, remaining); // add character to current result and recurse again
            }
        }
        
	}

}
