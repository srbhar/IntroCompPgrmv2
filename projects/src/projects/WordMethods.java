package projects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
public class WordMethods {
    public static final String RESET = "\u001B[0m";
    public static final String MAGENTA = "\u001B[35m";
	public static void main(String[] args) throws FileNotFoundException {
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 's', 'q', 'u', 'v', 'w', 't', 'h', 'p', 'i', 'm', 'n', 'k', 'j', 'l'};
		filterWordsByCharacter("Words.txt", letters);
		ArrayList<String> palindromes = findPalindrome("Words.txt");
		System.out.println(MAGENTA + "Palindromes:" + RESET);
		System.out.println(palindromes);
		ArrayList<String> wordladder = generateWordLadder("Words.txt", "beaks", "beaky");
		System.out.println(MAGENTA + "Wordladder:" + RESET);
		if (wordladder != null) {
			System.out.println(wordladder);
		} else {
			System.out.println("Not possible.");
		}
		abstemious("Words.txt");
		
	}
	
	public static void filterWordsByCharacter(String fileName, char[] letters) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner fileread = new Scanner(file);
		System.out.println(MAGENTA + "Words without character list: " + RESET);
		int count = 0; // just for format
		while (fileread.hasNext()) {
			String s = fileread.next();
			if (s.length() == 0) { continue; }
			boolean hasletter = false;
			for (int i = 0; i < letters.length; i++) {
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == letters[i]) {
						hasletter = true;
						break;
					}
				}
				if (hasletter) { break; }
			}
			if (!hasletter) {
				System.out.print(s + " ");
				count++;
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		fileread.close();
	}
	
	public static ArrayList<String> findPalindrome(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner read = new Scanner(file);
		ArrayList<String> list = new ArrayList<>();
		while (read.hasNext()) {
			String s = read.next();
			if (s.length() == 0) {
				continue;
			}
			if (isPalindromeRecursive(s)) {
				list.add(s);
			}
		}
		read.close();
		return list;
	}
	
	public static ArrayList<String> generateWordLadder(String fileName, String startWord, String endWord) throws FileNotFoundException {
	    File file = new File(fileName);
	    Scanner read = new Scanner(file);
	    ArrayList<String> words = new ArrayList<>();
	    while (read.hasNext()) {
	        String word = read.next().toLowerCase();
	        if (word.length() == startWord.length()) {
	            words.add(word);
	        }
	    }
	    read.close();

	    ArrayList<String> ladder = new ArrayList<>();
	    ladder.add(startWord);
	    String current = startWord;
	    while (!current.equals(endWord)) {
	        boolean moved = false;

	        for (String word : words) {
	            if (diffisone(current, word) && !ladder.contains(word)) {
	                ladder.add(word);
	                current = word;
	                moved = true;
	                break;
	            }
	        }

	        if (!moved) { // no next word
	            return null;
	        }
	    }

	    return ladder;
	}
	
	public static boolean diffisone(String word1, String word2) {
	    if (word1.length() != word2.length()) return false;
	    int differences = 0;
	    for (int i = 0; i < word1.length(); i++) {
	        if (word1.charAt(i) != word2.charAt(i)) {
	            differences++;
	        }
	        if (differences > 1) return false;
	    }
	    return differences == 1;
	}
	
	public static boolean isPalindromeRecursive(String s) {
		if (s.length() == 1 || s.length() == 0) {
			return true;
		}
		if (s.charAt(0) == s.charAt(s.length()-1)) {
			return isPalindromeRecursive(s.substring(1, s.length()-1));
		}
		else {
			return false;
		}
	}
	
	public static ArrayList<String> findAnagrams(String fileName, String word) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> words = new ArrayList<>();
		ArrayList<String> sortedwords = new ArrayList<>();
		File file = new File(fileName);
		Scanner read = new Scanner(file);
		
		char[] temp = word.toCharArray();
		Arrays.sort(temp);
		String wordsorted = new String(temp); // sort word given
		
		while (read.hasNext()) {
			String s = read.next();
			words.add(s); // new array list with all the words
		}
		for (int i = 0; i < words.size(); i++) {
			String s = words.get(i);
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			sortedwords.add(sorted); // for each string add the sorted version
			if (sortedwords.contains(wordsorted)) {
				list.add(words.get(i)); // add the non anagrammed word and return the list
			}
		} read.close();
		return list;
	}
	
	public static void abstemious(String filename) throws FileNotFoundException {
		ArrayList<String> abstemious = new ArrayList<>();
		ArrayList<String> doubly = new ArrayList<>();
		boolean a = false;
		boolean e = false;
		boolean i = false;
		boolean o = false;
		boolean u = false;
		File file = new File(filename);
		Scanner read = new Scanner(file);
		while (read.hasNext()) {
			String s = read.next();
			a = e = i = o = u = false;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'a') { a = true; }
				else if (s.charAt(j) == 'e') { e = true; }
				else if (s.charAt(j) == 'i') { i = true; }
				else if (s.charAt(j) == 'o') { o = true; }
				else if (s.charAt(j) == 'u') { u = true; }
			}
			if (a == true && e == true && i == true && o == true && u == true) {
				abstemious.add(s);
			}
		}
		System.out.println(MAGENTA + "Abstemious:" + RESET);
		System.out.println(abstemious);
		System.out.println(MAGENTA + "Doubly abstemious:" + RESET);
		
		for (int k = 0; k < abstemious.size(); k++) {
			String s = abstemious.get(k);
			boolean a1 = false;
			boolean e1 = false;
			boolean i1 = false;
			boolean o1 = false;
			boolean u1 = false;
			for (int p = 0; p < s.length(); p++) {
				if (s.charAt(p) == 'a') {
					a1 = true;
				} else if (s.charAt(p) == 'e') {
					if (!a1) break;
					e1 = true;
				} else if (s.charAt(p) == 'i') {
					if (!a1 || !e1) break;
					i1 = true;
				} else if (s.charAt(p) == 'o') {
					if (!a1 || !e1 || !i1) break;
					o1 = true;
				} else if (s.charAt(p) == 'u') {
					if (!a1 || !e1 || !i1 || !o1) break;
					u1 = true;
					if (!doubly.contains(s)) {
						doubly.add(s);
					}
				}
			}
		}
		System.out.println(doubly);
	}
	

}
