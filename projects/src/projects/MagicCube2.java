package projects;
import java.util.Scanner;
import java.util.ArrayList;
public class MagicCube2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][][] cube = new int[6][3][3];
		ArrayList<Integer> startnums = new ArrayList<>();
		ArrayList<Integer> increments = new ArrayList<>();
		// get user input of all starting numbers and increments
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter starting number for ");
			switch(i) {
			case 0: System.out.print("top: ");
				break;
			case 1: System.out.print("front: ");
				break;
			case 2: System.out.print("right side: ");
				break;
			case 3: System.out.print("back: ");
				break;
			case 4: System.out.print("left side: ");
				break;
			}
			int startnum = input.nextInt();
			
			while (startnums.contains(startnum)) { // get unique increments and starting numbers
				System.out.print("That number was already used. Enter a unique starting number: ");
				startnum = input.nextInt();
			}
			startnums.add(startnum);
			System.out.print("Enter increment for face: ");
			int increment = input.nextInt();
			while (increments.contains(increment)) {
				System.out.print("That number was already used. Enter a unique increment number: ");
				increment = input.nextInt();
			}
			increments.add(increment);
		} input.close();
		// do magic squares for every face
		for (int i = 0; i < 5; i++) {
			fillsquare(cube, i, startnums, increments);
			print(cube, i);
		}
		// do magic square for bottom face
		cube[5][0][0] = startnums.get(4);
		cube[5][0][1] = 1;
		cube[5][0][2] = startnums.get(2);

		cube[5][1][0] = 1;
		cube[5][1][1] = startnums.get(0);
		cube[5][1][2] = 1;

		cube[5][2][0] = startnums.get(1);
		cube[5][2][1] = 1;
		cube[5][2][2] = startnums.get(3);

		print(cube, 5);
	}
	
	public static void fillsquare(int[][][] cube, int face, ArrayList<Integer> startnums, ArrayList<Integer> increments) {
		int start = startnums.get(face);
		int inc = increments.get(face);
		int num = start;
		int row = 0;
		int col = 1;
		cube[face][row][col] = num; // starts off in row 0 and column 1


		for (int i = 1; i < 9; i++) {
		num += inc;
		int nextrow = (row - 1 + 3) % 3;
		int nextcol = (col + 1) % 3; // up and to the right, wraps around if needed
		
		if (cube[face][nextrow][nextcol] != 0) {
			row = (row + 1) % 3;
		} // if taken, just move row one down
		else {
			row = nextrow;
			col = nextcol;
		}
			cube[face][row][col] = num; // set cube at that position to the number incremented
		}
	}
	
	public static void print(int[][][] cube, int face) {
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
			System.out.println("Bottom:"); // switch statement to know which face is being printed
			break;
		}
		
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("%3d", cube[face][r][c]); // print f for formatting
			}
			System.out.println();
		}
	}

}
