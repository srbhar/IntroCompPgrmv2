package practice;
import java.util.Scanner;
public class WordSearchMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] lowercase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		Scanner input = new Scanner(System.in);
		System.out.print("Matrix dimensions (rows & columns): ");
		int rows = input.nextInt();
		int cols = input.nextInt();
		char[][] matrix = new char[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				matrix[r][c] = lowercase[(int) (Math.random()*26)];
			}
		}
		
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				System.out.print(matrix[r][c] + " ");
			}
			System.out.println();
		}
		
		try {
			String[] input1 = new String[3];
		System.out.print("Enter input as: word x y: ");
		input1[0] = input.next();
		int x = input.nextInt();
		int y = input.nextInt();
		input1[1] = "" + x;
		input1[2] = "" + y;
		
		input.close();
		
		x = Integer.parseInt(input1[1]);
		y = Integer.parseInt(input1[2]);
		
		System.out.print(checkWord(matrix, input1[0], x, y));
		
		} catch (Exception e) {
			System.out.print("Please enter a valid coordinate.");
		}
		
	}
	
	public static String checkWord(char[][] matrix, String word, int x, int y) {
		String checkLtoR = "";
		for (int i = x; i < matrix.length; i++) { // check vertically right to left
			if (checkLtoR.length() < word.length()) {
				checkLtoR += "" + matrix[i][y];
			}
		}
		if (checkLtoR.equals(word)) {
			return "The word " + word + " was found vertically at row " + x + " and column " + y + ".";
		}
		String checkRtoL = "";
		for (int i = x; i >= 0; i--) { // check vertically left to right
			if (checkRtoL.length() < word.length()) {
				checkRtoL += matrix[i][y];
			}
		}
		if (checkRtoL.equals(word)) {
			return "The word " + word + " was found vertically at row " + x + " and column " + y + ".";
		}
		String checkTtoB = "";
		for (int i = y; i < matrix.length; i++) { // check horizontally right to left
			if (checkTtoB.length() < word.length()) {
				checkTtoB += matrix[x][i];
			}
		}
		if (checkTtoB.equals(word)) {
			return "The word " + word + " was found horizontally at row " + x + " and column " + y + ".";
		}
		String checkBtoT = "";
		for (int i = y; i >= 0; i--) { // check horizontally left to right
			if (checkBtoT.length() < word.length()) {
				checkBtoT += matrix[x][i];
			}
		}
		if (checkBtoT.equals(word)) {
			return "The word " + word + " was found horizontally at row " + x + " and column " + y + ".";
		}
		
		return "The word " + word + " was not found at row " + x + " and column " + y + ".";
	}

}
