package projects;
import java.util.Scanner;
public class SolveOddOrderMagicSquares {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter row and column length: ");
		int length = input.nextInt();
		System.out.print("Enter increment: ");
		int increment = input.nextInt();
		if (length == 1) {
		    System.out.println(increment);
		    input.close();
		    return;
		}
		int[][] arr = new int[length][length];
		int currentcol = (length-1)/2;
		arr[0][currentcol] = increment;
		int[] currentspot = {0,currentcol};
		for (int i = increment * 2; i <= length * length * increment; i += increment) {
			int[] nextspot = new int[2];
			
			nextspot = next(arr, currentspot, length);
			
			if (nextspotfilled(arr, nextspot)) {
				nextspot[0] = (currentspot[0] + 1) % arr.length;
				nextspot[1] = currentspot[1];
			}
				fillspot(arr, nextspot, i);
				currentspot = nextspot;
	}
		print(arr);
		
		input.close();
	}
		
	
	public static int[] next(int[][] arr, int[] currentspot, int length) {
		int rowmax = length-1;
		int colmax = length-1;
		int[] current = currentspot;

		int[] next = {current[0] - 1, current[1] + 1};
		if (next[0] < 0) {
		    next[0] = rowmax;
		}

		if (next[1] > colmax) {
		    next[1] = 0;
		}
		
		return next;
		
	}
	
	public static void fillspot(int[][] arr, int[] nextspot, int nextnum) {
		arr[nextspot[0]][nextspot[1]] = nextnum;
	}
	
	public static boolean nextspotfilled(int[][] arr, int[] nextspot) {
		if (arr[nextspot[0]][nextspot[1]] == 0) {
			return false;
		}
		return true;
	}
	
	public static void print(int[][] arr) {
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("%3d", arr[r][c]);
			}
			System.out.println();
		}
	}
}
