package practice;
import java.util.Scanner;
public class TrappingFallingWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int length = input.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter value of array at " + i + ": ");
			arr[i] = input.nextInt();
		} input.close();
		System.out.print(compute(arr));
	}
	
	public static String compute(int[] arr) {
		int water = 0;
		for (int i = 1; i < arr.length-1; i++) {
			if (arr[i-1] > arr[i] && arr[i+1] > arr[i]) {
				water += arr[i-1] + arr[i-1]-arr[i];
				if (arr[i-1] > arr[i+1]) {
					water += arr[i+1];
				}
				else {
					water += arr[i-1];
				}
			}
		}
		if (arr[arr.length-2] > arr[arr.length-1]) {
			water += arr[arr.length-1];
		}
		if (water == 0) {
			return "We cannot trap water as there is no height bound on both sides.";
		}
		return "We trap " + water/2 + " units.";
	}

}
