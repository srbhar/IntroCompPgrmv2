package hw7_16;
import java.util.Scanner;
public class EightTwenty_ConnectFour {
	
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] grid = new int[6][7];
		// 1 will represent R
		// 2 will represent Y
		boolean playerwon = false;
		int playercounter = 0;
		while (!playerwon) {
			print(grid);
			System.out.print(playercounter % 2 == 0 ? "Drop a red disk at column (0-6): " : "Drop a yellow disk at column (0-6): ");
			int column = input.nextInt();
			fillspot(grid, column, playercounter % 2 == 0 ? 1 : 2);
			if (isConsecutiveFour(grid, playercounter % 2 == 0 ? 1 : 2)) {
				print(grid);
				System.out.print(playercounter % 2 == 0 ? "Red " : "Yellow ");
				System.out.println("won the connect four!");
				break;
			}
			playercounter++;
		}
	}
	
	public static void fillspot(int[][] grid, int column, int player) {
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][column] == 0) {
				grid[i][column] = player;
				break;
			}
		}
	}
	
	public static void print(int[][] grid) {
		int l = grid.length;
		for (int r = l-1; r >= 0; r--) {
			for (int c = 0; c < grid[0].length; c++) {
				if (grid[r][c] == 1) {
					System.out.print("|" + RED + "R" + RESET + "|");
				}
				else if (grid[r][c] == 2) {
					System.out.print("|" + YELLOW + "Y" + RESET + "|");
				}
				else { System.out.print("| |"); }
			}
			System.out.println();
		}
		for (int i = 0; i < 21; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
    public static boolean isConsecutiveFour(int[][] values, int player) {
        int rows = values.length;
        int cols = values[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int current = values[i][j];
                if (current != player) {
                	continue;
                }

                // horizontal
                if (j + 3 < cols &&
                    current == values[i][j + 1] &&
                    current == values[i][j + 2] &&
                    current == values[i][j + 3]) {
                    return true;
                }

                // vertical
                if (i + 3 < rows &&
                    current == values[i + 1][j] &&
                    current == values[i + 2][j] &&
                    current == values[i + 3][j]) {
                    return true;
                }

                // diagonal major
                if (i + 3 < rows && j + 3 < cols &&
                    current == values[i + 1][j + 1] &&
                    current == values[i + 2][j + 2] &&
                    current == values[i + 3][j + 3]) {
                    return true;
                }

                // diagonal minor
                if (i - 3 >= 0 && j + 3 < cols &&
                    current == values[i - 1][j + 1] &&
                    current == values[i - 2][j + 2] &&
                    current == values[i - 3][j + 3]) {
                    return true;
                }
            }
        }
        return false;
    }

}
