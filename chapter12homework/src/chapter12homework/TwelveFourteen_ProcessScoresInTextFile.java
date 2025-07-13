package chapter12homework;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TwelveFourteen_ProcessScoresInTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter file name: ");
		String filename = input.next();
		
		ArrayList<Double> scores = new ArrayList<>();
		
		java.io.File file = new java.io.File(filename);
		Scanner filereader = new Scanner(file);
		
		double total = 0;
		
		while (filereader.hasNext()) {
			scores.add(filereader.nextDouble());
		}
		
		for (int i = 0; i < scores.size(); i++) {
			total += scores.get(i);
		}
		
		double average = total / scores.size();
		
		System.out.print("Total: " + total + ". Average: " + average + ".");
		
		filereader.close();
		input.close();

	}

}
