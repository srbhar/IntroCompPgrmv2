package projects;
import java.util.Scanner;
import java.util.ArrayList;
public class MagicCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [][][] cube = new int[6][3][3];
		ArrayList<Integer> startingnums = new ArrayList<>();
		for (int i = 0; i < cube.length-1; i++) {
			System.out.print("Enter starting number for ");
			switch(i) {
			case 0:
				System.out.print("top: ");
				break;
			case 1:
				System.out.print("front: ");
				break;
			case 2:
				System.out.print("right side: ");
				break;
			case 3:
				System.out.print("back: ");
				break;
			case 4:
				System.out.print("left side: ");
				break;
			case 5:
				System.out.print("bottom: ");
				break;
			}
			
			int num = input.nextInt();
			while (startingnums.contains(num)) {
				System.out.print("That starting number has already been entered. Enter a unique number: ");
				num = input.nextInt();
			}
			startingnums.add(num);
		}
		
		for (int i = 0; i < cube.length-1; i++) { // does not include bottom face
		int[][] face = new int[3][3];
		int startnum = startingnums.get(i);
		int currentcol = 1;
		face[0][1] = startnum;
		int[] currentspot = {0,currentcol};
		for (int j = startnum+1; j <= startnum+8; j++) {
			int[] nextspot = new int[2];
			
			nextspot = next(face, currentspot, 3);
			
			if (nextspotfilled(face, nextspot)) {
				nextspot[0] = (currentspot[0] + 1) % face.length;
				nextspot[1] = currentspot[1];
			}
				fillspot(cube, nextspot, j, i);
				currentspot = nextspot;
	
		print(cube, face, i);
		
		}
		
		input.close();
		
		// fill bottom face
		cube[5][0][0] = startingnums.get(4);
		cube[5][0][1] = 1;
		cube[5][0][2] = startingnums.get(2);
		cube[5][1][0] = 1;
		cube[5][1][1] = startingnums.get(0);
		cube[5][1][2] = 1;
		cube[5][2][0] = startingnums.get(1);
		cube[5][2][1] = 1;
		cube[5][2][2] = startingnums.get(3);
		
		print(cube, face, 5);
	}
	}
		
	
	public static int[] next(int[][] arr, int[] currentspot, int length) {
		int rowmax = length-1;
		int colmax = length-1;
		int[] current = currentspot;

		int[] nextone = {current[0] - 1, current[1] + 1};
		if (nextone[0] < 0) {
		    nextone[0] = rowmax;
		}

		if (nextone[1] > colmax) {
		    nextone[1] = 0;
		}
		
		return nextone;
		
	}
	
	public static void fillspot(int[][][] cube, int[] nextspot, int nextnum, int face) {
		cube[face][nextspot[0]][nextspot[1]] = nextnum;
	}
	
	public static boolean nextspotfilled(int[][] arr, int[] nextspot) {
		if (arr[nextspot[0]][nextspot[1]] == 0) {
			return false;
		}
		return true;
	}
	
	public static void print(int[][][] cube, int[][] arr, int face) {
		switch (face) {
		case 0:
			System.out.println("Top:");
			break;
		case 1:
			System.out.println("Front:");
			break;
		case 2:
			System.out.println("Right side:");
			break;
		case 3:
			System.out.println("Back:");
			break;
		case 4:
			System.out.println("Left side:");
			break;
		case 5:
			System.out.println("Bottom:");
			break;
		}
		
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr.length; c++) {
				System.out.print(cube[face][r][c] + " ");
			}
			System.out.println();
		}
	}
		

	}