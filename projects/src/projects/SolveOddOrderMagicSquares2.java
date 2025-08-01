package projects;
import java.util.Scanner;
public class SolveOddOrderMagicSquares2 {
	
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter row and column length: ");
		int length = input.nextInt();
		if (length % 2 == 0) {
			System.out.print("ONLY ODD LENGTH MAGIC SQUARES ARE SUPPORTED.");
			return;
		}
		System.out.print("Enter starting num: ");
		int start = input.nextInt();
		System.out.print("Enter increment: ");
		int increment = input.nextInt();
		if (length == 1) {
		    System.out.println(MAGENTA + start + RESET);
		    input.close();
		    return;
		}
		int[][] arr = new int[length][length];
		int currentcol = (length-1)/2;
		arr[0][currentcol] = start;
		int[] currentspot = {0,currentcol};
		for (int i = start + increment; i < start + length * length * increment; i += increment) {
			int[] nextspot = next(arr, currentspot, length);
			
			if (nextspotfilled(arr, nextspot)) {
				nextspot[0] = (currentspot[0] + 1) % arr.length;
				nextspot[1] = currentspot[1];
			}
				fillspot(arr, nextspot, i);
				currentspot = nextspot;
	}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}
		print(arr, sum);
		
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
	
	public static void print(int[][] arr, int sum) {
	    int length = arr.length;

	    int[] colSums = new int[length];
	    int diag1 = 0, diag2 = 0;
	    // top right corner
	    System.out.printf(YELLOW + "%" + (length * 5 + 5) + "d\n" + RESET, sum);

	    for (int r = 0; r < length; r++) {
	        int rowSum = 0;

	        for (int c = 0; c < length; c++) {
	            System.out.printf(MAGENTA + "%5d" + RESET, arr[r][c]);
	            rowSum += arr[r][c];
	            colSums[c] += arr[r][c];
	            if (r == c) {
	            	diag1 += arr[r][c];
	            }
	            if (r + c == length - 1) {
	            	diag2 += arr[r][c];
	            }
	        }
	        // row by row print
	        System.out.printf("   > " + BLUE + "%3d\n" + RESET, rowSum);
	    }
	    // bottom
	    for (int c = 0; c < length; c++) {
	        System.out.printf(BLUE + "%5d" + RESET, colSums[c]);
	    } // remaining diagonal
	    System.out.printf(YELLOW + "   %3d\n" + RESET, sum);
	}
}
