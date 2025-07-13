package chapter12homework;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwelveFifteen_WriteAndReadData {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("Exercise12_15.txt");

		if (file.exists()) {
			System.out.println("File already exists. Please delete it and run the program again.");
			System.exit(1);
		}
		
		PrintWriter output = new PrintWriter(file);
		
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100 + 1);
		}
		
		for (int i = 0; i < array.length; i++) {
			output.print(array[i] + " ");
		}
		
		output.close();
		
		int[] readarray = new int[100];
		Scanner fileread = new Scanner(file);
		for (int i = 0; i < readarray.length; i++) {
			readarray[i] = fileread.nextInt();
		}
		
		// perform bubble sort on the array
		
		for (int i = 0; i < readarray.length - 1; i++) {
			for (int j = 0; j < readarray.length - 1 - i; j++) {
				if (readarray[j] > readarray[j + 1]) {
					int temp = readarray[j];
					readarray[j] = readarray[j + 1];
					readarray[j + 1] = temp;
				}
			}
		}
		
		System.out.print("Sorted: ");
		for (int i = 0; i < readarray.length; i++) {
			System.out.print(readarray[i] + " ");
		}
		
		fileread.close();
	}

}
