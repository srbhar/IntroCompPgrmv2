package practice;
import java.util.Scanner;

public class EighteenThirteen_LargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Use recursion for this problem
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list of eight integers: ");
		int[] integers = new int[8];
		for (int i = 0; i < 8; i++) {
			integers[i] = input.nextInt();
		}
		int largest = largest(integers, 0, 0);
		System.out.print("Largest: " + largest);
		input.close();
	}
	
	public static int largest(int[] integers, int index, int max) {
		if (index == integers.length) {
			return max;
		}
		if (integers[index] > max) {
			max = integers[index];
		}
		return largest(integers, index + 1, max);
	}

}
