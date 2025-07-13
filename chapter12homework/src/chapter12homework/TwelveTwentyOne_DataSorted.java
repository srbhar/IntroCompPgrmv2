package chapter12homework;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TwelveTwentyOne_DataSorted {

	public static void main(String[] args) throws FileNotFoundException {
		
		// read strings from file and add to array list called strings
		File file = new File("SortedStrings.txt");
		ArrayList<String> strings = new ArrayList<>();
		Scanner fileread  = new Scanner(file);
		while (fileread.hasNext()) {
			strings.add(fileread.next());
		}
		
		fileread.close();
		
		// check if strings list is sorted or not
		boolean sorted = true;
		for (int i = 0; i < strings.size()-1; i++) {
			if (strings.get(i).compareTo(strings.get(i+1)) > 0) {
				sorted = false;
				break;
			}
		}
		
		if (sorted) {
			System.out.print("Sorted.");
		}
		
		else {

		    System.out.println("Not sorted. First 2 violations (or 1 if applicable):");
		    int count = 0;
		    for (int i = 0; i < strings.size() - 1 && count < 2; i++) {
		        if (strings.get(i).compareTo(strings.get(i + 1)) > 0) {
		            System.out.println(strings.get(i + 1));
		            count++;
		        }
		    }
		

	}

}

}