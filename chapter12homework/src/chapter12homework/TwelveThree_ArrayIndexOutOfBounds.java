package chapter12homework;
import java.util.Scanner;
public class TwelveThree_ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
		}
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the index: ");
			int index = input.nextInt();
			System.out.print("Number: " + array[index]);
			input.close();
		} catch (Exception e) {
			System.out.print("Please enter a valid index.");
		}

	}

}
