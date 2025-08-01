package practice;
import java.util.Scanner;
import java.util.ArrayList;
public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		int[] nums = new int[input.nextInt()];
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter num at position " + i + ": ");
			nums[i] = input.nextInt();
		} input.close();
		ArrayList<Integer> display = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			display.add(nums[i]);
		}
		System.out.println("The array is " + display + ".");
		System.out.print("Will you land on the last index? - ");
		int jump = 0;
		for (int i = 0; i < nums.length; i += jump) {
			jump += nums[i];
			if (jump == nums.length-1) {
				System.out.print(true);
				return;
			}
		}
		System.out.print(false);
	}

}
