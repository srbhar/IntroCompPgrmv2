package chapter8homework;

import java.util.Scanner;

public class EightNine_TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] board = new int[3][3];
		
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			
			printboard(board);
			
			if (count % 2 == 0) {
			System.out.println("Enter a row (0, 1, or 2) for player O: ");
			} else {
				System.out.println("Enter a row (0, 1, or 2) for player X: ");
			}
			int temp = input.nextInt();
			if (count % 2 == 0) {
				System.out.println("Enter a column (0, 1, or 2) for player O: ");
			} else {
				System.out.println("Enter a column (0, 1, or 2) for player X: ");
			}
			int temp2 = input.nextInt();
			if (count % 2 == 0) {
				board[temp][temp2] = 2;
			} else {
				board[temp][temp2] = 1;
			}
			count++;
			
			boolean checkrowflag1 = checkrowmethod(board, 1);
			boolean checkcolflag1 = checkcolmethod (board, 1);
			boolean checkmajordiagflag1 = checkmajordiagmethod (board, 1);
			boolean checkminordiagflag1 = checkminordiagmethod (board, 1);
			
			boolean checkrowflag2 = checkrowmethod(board, 2);
			boolean checkcolflag2 = checkcolmethod (board, 2);
			boolean checkmajordiagflag2 = checkmajordiagmethod (board, 2);
			boolean checkminordiagflag2 = checkminordiagmethod (board, 2);
			
			if (checkrowflag1 || checkcolflag1 || checkmajordiagflag1 || checkminordiagflag1) {
			System.out.print("X player won");
			break;
			} else if (checkrowflag2 || checkcolflag2 || checkmajordiagflag2 || checkminordiagflag2) {
				System.out.print("O player won");
				break;
				}
			}
		
		input.close();
	}
		
	public static boolean checkrowmethod(int[][] board, int value) {
	
		boolean status = false;
		
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == value && board[i][1] == value && board[i][2] == value) {
				status = true;
				break;
		}
	}
		return status;

	}
	
	public static boolean checkcolmethod(int[][] board, int value) {
		
		boolean status = false;
		
		for (int i = 0; i < 3; i++) {
			if (board[0][i] == value && board[1][i] == value && board[2][i] == value) {
				status = true;
				break;
			}
		}
		
		return status;
	}
	
	public static boolean checkmajordiagmethod(int[][] board, int value) {
		
		boolean status = true;
		
		for (int i = 0; i < 3; i++) {
			if (board [i][i] != value) {
				status = false;
				break;
			}
		}
		
		return status;
	}
	
	public static boolean checkminordiagmethod(int[][] board, int value) {
		
		boolean status = false;
		
		if (board[0][2] == value && board[1][1] == value && board[2][0] == value) {
			status = true;
		}
		
		return status;
	}
	
	private static void printboard(int [][] board) {
		
		for (int i = 0; i < 3; i++) {
		    for (int k = 0; k < 13; k++) {
		        System.out.print("-");
		    }
		    System.out.println();
		    
		    for (int j = 0; j < 3; j++) {
		        System.out.print("| ");
		        if (board[i][j] == 1) {
		            System.out.print("X ");
		        } else if (board[i][j] == 2) {
		            System.out.print("O ");
		        } else {
		            System.out.print("  ");
		        }
		    }
		    System.out.println("|");
		}

	}
}