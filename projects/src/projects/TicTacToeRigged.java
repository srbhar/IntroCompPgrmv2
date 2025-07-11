package projects;

import java.util.Scanner;

public class TicTacToeRigged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] board = new int[3][3];
		int count = 0;
		Scanner input = new Scanner(System.in);
		printboard(board);
		System.out.print("Tic-Tac-Toe: Who is going to play first? (X for computer, O for you): ");
			String player = input.next();
			if (player.equals("X")) {
				count = 1;
			} else if (player.equals("O")) {
				count = 2;
			}
		for (int i = 0; i < 9; i++) {
			if (count == 1) {
				play(board, i);
				printboard(board);
				count = 2;
			} else {
				System.out.print("Enter a spot #: ");
				int spot = input.nextInt();
				if (spot == 1) {
					board[0][0] = 2;
				} else if (spot == 2) {
					board[0][1] = 2;
				} else if (spot == 3) {
					board[0][2] = 2;
				} else if (spot == 4) {
					board[1][0] = 2;
				} else if (spot == 5) {
					board[1][1] = 2;
				} else if (spot == 6) {
					board[1][2] = 2;
				} else if (spot == 7) {
					board[2][0] = 2;
				} else if (spot == 8) {
					board[2][1] = 2;
				} else if (spot == 9) {
					board[2][2] = 2;
				}
				
				count = 1;
			}
			
			boolean checkrowflagX = checkrowmethod(board, 1);
			boolean checkcolflagX = checkcolmethod(board, 1);
			boolean checkmajordiagflagX = checkmajordiagmethod(board, 1);
			boolean checkminordiagflagX = checkminordiagmethod(board, 1);
			
			boolean checkrowflagO = checkrowmethod(board, 2);
			boolean checkcolflagO = checkcolmethod(board, 2);
			boolean checkmajordiagflagO = checkmajordiagmethod(board, 2);
			boolean checkminordiagflagO = checkminordiagmethod(board, 2);
			
			if (checkrowflagX || checkcolflagX || checkmajordiagflagX || checkminordiagflagX) {
			System.out.print("Computer won, loser.");
			break;
			} else if (checkrowflagO || checkcolflagO || checkmajordiagflagO || checkminordiagflagO) {
				System.out.print("You won."); // never happening if my code works
				break;
			} 
			
			if (i == 8) {
				System.out.print("You tied with the computer.");
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
	
	public static void printboard(int [][] board) {
		
		int[][] display = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for (int i1 = 0; i1 < 3; i1++) {
		    for (int k = 0; k < 13; k++) {
		        System.out.print("-");
		    }
		    System.out.println();
		    
		    for (int j = 0; j < 3; j++) {
		        System.out.print("| ");
		        if (board[i1][j] == 1) {
		            System.out.print("X ");
		        } else if (board[i1][j] == 2) {
		            System.out.print("O ");
		        } else {
		            System.out.print(display[i1][j] + " ");
		        }
		    }
		    System.out.println("|");
		}
  
	}
	
	public static void play(int[][] board, int movenumber) {
		
		if (tryToWin(board)) return;
		if (tryToBlockUserWin(board)) return;
		if (blockUserFork(board)) return;
		
		if (movenumber == 0) {
			if (board[1][1] == 0) {
				board[1][1] = 1;
				return;
			}
		}
		
		// if there are two one's in a row, take the winning spot!
		boolean two1inrow0 = two1inrow(board, 0);
		boolean two1inrow1 = two1inrow(board, 1);
		boolean two1inrow2 = two1inrow(board, 2);
		// if there are two one's in a column, take the winning spot!
		boolean two1incol0 = two1incol(board, 0);
		boolean two1incol1 = two1incol(board, 1);
		boolean two1incol2 = two1incol(board, 1);
		// if there are two one's in a major or minor diagonal, take the winning spot!
		boolean two1inmajordiag = two1inmajordiag(board);
		boolean two1inminordiag = two1inminordiag(board);
		// if there are two in a row, fill the empty spot to block the user's play
		boolean two2inrow0 = two2inrow(board, 0);
		boolean two2inrow1 = two2inrow(board, 1);
		boolean two2inrow2 = two2inrow(board, 2);
		// if there are two in a column, fill the empty spot to block the user's play
		boolean two2incol0 = two2incol(board, 0);
		boolean two2incol1 = two2incol(board, 1);
		boolean two2incol2 = two2incol(board, 2);
		// if there are two in a major and minor diagonal, fill the empty spot to block the user's play
		boolean two2inmajordiag = two2inmajordiag(board);
		boolean two2inminordiag = two2inminordiag(board);
		// if there are only one's in a row, fill another spot with a one
		boolean onesinrow0 = onesinarow(board, 0);
		boolean onesinrow1 = onesinarow(board, 1);
		boolean onesinrow2 = onesinarow(board, 2);
		// if there are only one's in a column, fill another spot with a one
		boolean onesincol0 = onesinacol(board, 0);
		boolean onesincol1 = onesinacol(board, 1);
		boolean onesincol2 = onesinacol(board, 2);
		// if there are only one's in a major and minor diagonal, fill another spot with a one
		boolean onesinmajordiag = onesinmajordiag(board);
		boolean onesinminordiag = onesinminordiag(board);
		// if all the slots in a row are empty, fill one of the slots with a one
		boolean row0empty = rowempty(board, 0);
		boolean row1empty = rowempty(board, 1);
		boolean row2empty = rowempty(board, 2);
		// if all the slots in a column are empty, fill one of the slots with a one
		boolean col0empty = colempty(board, 0);
		boolean col1empty = colempty(board, 1);
		boolean col2empty = colempty(board, 2);
		// if all the slots in a major or minor diagonal are empty, fill one of the slots with a one
		boolean majordiagempty = majordiagempty(board);
		boolean minordiagempty = minordiagempty(board);
		
		if (two1inrow0) {
			rowwin(board, 0);
		}
		else if (two1inrow1) {
			rowwin(board, 1);
		}
		else if (two1inrow2) {
			rowwin(board, 2);
		}
		else if (two1incol0) {
			colwin(board, 0);
		}
		else if (two1incol1) {
			colwin(board, 1);
		}
		else if (two1incol2) {
			colwin(board, 2);
		}
		else if (two1inmajordiag) {
			majordiagwin(board);
		}
		else if (two1inminordiag) {
			minordiagwin(board);
		}
		else if (two2inrow0) {
			fillemptyrowspot(board, 0);
		}
		else if (two2inrow1) {
			fillemptyrowspot(board, 1);
		}
		else if (two2inrow2) {
			fillemptyrowspot(board, 2);
		}
		else if (two2incol0) {
			fillemptycolspot(board, 0);
		}
		else if (two2incol1) {
			fillemptycolspot(board, 1);
		}
		else if (two2incol2) {
			fillemptycolspot(board, 2);
		}
		else if (two2inmajordiag) {
			fillemptymajordiagspot(board);
		}
		else if (two2inminordiag) {
			fillemptyminordiagspot(board);
		}
		else if (onesinrow0) {
			fillrowwith1(board, 0);
		}
		else if (onesinrow1) {
			fillrowwith1(board, 1);
		}
		else if (onesinrow2) {
			fillrowwith1(board, 2);
		}
		else if (onesincol0) {
			fillcolwith1(board, 0);
		}
		else if (onesincol1) {
			fillcolwith1(board, 1);
		}
		else if (onesincol2) {
			fillcolwith1(board, 2);
		}
		else if (onesinmajordiag) {
			fillmajordiagwith1(board);
		}
		else if (onesinminordiag) {
			fillminordiagwith1(board);
		}
		else if (row0empty) {
			fillemptyrow(board, 0);
		}
		else if (row1empty) {
			fillemptyrow(board, 1);
		}
		else if (row2empty) {
			fillemptyrow(board, 2);
		}
		else if (col0empty) {
			fillemptycol(board, 0);
		}
		else if (col1empty) {
			fillemptycol(board, 1);
		}
		else if (col2empty) {
			fillemptycol(board, 2);
		}
		else if (majordiagempty) {
			fillemptymajordiag(board);
		}
		else if (minordiagempty) {
			fillemptyminordiag(board);
		}
		else {
			int row = (int)(Math.random()*3);
			int col = (int)(Math.random()*3);
			while (board[row][col] != 0) {
				row = (int)(Math.random()*3);
				col = (int)(Math.random()*3);
			}
			board[row][col] = 1;
		}
	}
	
	public static boolean tryToWin(int[][] board) {
		for (int i = 0; i < 3; i++) {
			if (two1inrow(board, i)) { rowwin(board, i); return true; }
			if (two1incol(board, i)) { colwin(board, i); return true; }
		}
		if (two1inmajordiag(board)) { majordiagwin(board); return true; }
		if (two1inminordiag(board)) { minordiagwin(board); return true; }
		return false;
	}
	

	public static boolean tryToBlockUserWin(int[][] board) {
		for (int i = 0; i < 3; i++) {
			if (two2inrow(board, i)) { fillemptyrowspot(board, i); return true; }
			if (two2incol(board, i)) { fillemptycolspot(board, i); return true; }
		}
		if (two2inmajordiag(board)) { fillemptymajordiagspot(board); return true; }
		if (two2inminordiag(board)) { fillemptyminordiagspot(board); return true; }
		return false;
	}
	
	public static boolean blockUserFork(int[][] board) {
		int[][] forks = {
			{0, 0}, {0, 2}, {2, 0}, {2, 2}
		};

		// check if center is empty
		if (board[1][1] == 0) {
			board[1][1] = 1;
			return true;
		}

		// check if opponent has any 2 corners with the center
		int userCorners = 0;
		for (int[] corner : forks) {
			if (board[corner[0]][corner[1]] == 2) {
				userCorners++;
			}
		}
		if (userCorners >= 2) {
			// take edge
			if (board[0][1] == 0) { board[0][1] = 1; return true; }
			if (board[1][0] == 0) { board[1][0] = 1; return true; }
			if (board[1][2] == 0) { board[1][2] = 1; return true; }
			if (board[2][1] == 0) { board[2][1] = 1; return true; }
		}

		return false;
	}
	
	public static boolean two1inrow(int[][] board, int row) {
		if ((board[row][0] == 1 && board[row][1] == 1 && board[row][2] == 0) || (board[row][0] == 1 && board[row][2] == 1 && board[row][1] == 0) || (board[row][1] == 1 && board[row][2] == 1 && board[row][0] == 0)) {
			return true;
		}
		return false;
	}
	
	public static boolean two1incol(int[][] board, int col) {
		if ((board[0][col] == 1 && board[1][col] == 1 && board[2][col] == 0) || (board[0][col] == 1 && board[2][col] == 1 && board[1][col] == 0) || (board[1][col] == 1 && board[2][col] == 1 && board[0][col] == 0)) {
			return true;
		}
		return false;
	}
	
	public static boolean two1inmajordiag(int[][] board) {
		if ((board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 0) || (board[0][0] == 1 && board[2][2] == 1 && board[1][1] == 0) || (board[1][1] == 1 && board[2][2] == 1 && board[0][0] == 0)) {
			return true;
		}
		return false;
	}
	
	public static boolean two1inminordiag(int[][] board) {
		if ((board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 0) || (board[0][2] == 1 && board[2][0] == 1 && board[1][1] == 0) || (board[1][1] == 1 && board[2][0] == 1 && board[0][2] == 0)) {
			return true;
		}
		return false;
	}
	
	public static void rowwin(int[][] board, int row) {
		for (int i = 0; i < 3; i++) {
			if (board[row][i] == 0) {
				board[row][i] = 1;
				return;
			}
		}
	}
	
	public static void colwin(int[][] board, int col) {
		for (int i = 0; i < 3; i++) {
			if (board[i][col] == 0) {
				board[i][col] = 1;
				return;
			}
		}
	}
	
	public static void majordiagwin(int[][] board) {
		for (int i = 0; i < 3; i++) {
			if (board[i][i] == 0) {
				board[i][i] = 1;
				return;
			}
		}
	}
	
	public static void minordiagwin(int[][] board) {
		if (board[0][2] == 0) {
			board[0][2] = 1;
			return;
		}
		else if (board[1][1] == 0) {
			board[1][1] = 1;
			return;
		}
		else if (board[2][0] == 0) {
			board[2][0] = 1;
			return;
		}
	}
	
	public static boolean two2inrow(int[][] board, int row) {
		if ((board[row][0] == 2 && board[row][1] == 2 && board[row][2] == 0) || (board[row][0] == 2 && board[row][2] == 2 && board[row][1] == 0) || (board[row][1] == 2 && board[row][2] == 2 && board[row][0] == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void fillemptyrowspot(int[][] board, int row) {
		int pick = (int)(Math.random()*3);
		while (board[row][pick] != 0) {
			pick = (int)(Math.random()*3);
		}
		board[row][pick] = 1;
	}
	
	public static boolean two2incol(int[][] board, int col) {
		if ((board[0][col] == 2 && board[1][col] == 2 && board[2][col] == 0) || (board[0][col] == 2 && board[2][col] == 2 && board[1][col] == 0) || (board[1][col] == 2 && board[2][col] == 2 && board[0][col] == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void fillemptycolspot(int[][] board, int col) {
		int pick = (int) (Math.random()*3);
		while (board[pick][col] != 0) {
			pick = (int)(Math.random()*3);
		}
		board[pick][col] = 1;
	}
	
	public static boolean two2inmajordiag(int[][] board) {
		if ((board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 0) || (board[0][0] == 2 && board[2][2] == 2 && board[1][1] == 0) || (board[1][1] == 2 && board[2][2] == 2 && board[0][0] == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean two2inminordiag(int[][] board) {
		if ((board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 0) || (board[0][2] == 2 && board[2][0] == 2 && board[1][1] == 0) || (board[1][1] == 2 && board[2][0] == 2 && board[0][2] == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void fillemptymajordiagspot(int[][] board) {
		if (board[0][0] == 0) {
			board[0][0] = 1;
		} else if (board[1][1] == 0) {
			board[1][1] = 1;
		} else if (board[2][2] == 0) {
			board[2][2] = 1;
		}
	}
	
	public static void fillemptyminordiagspot(int[][] board) {
		if (board[0][2] == 0) {
			board[0][2] = 1;
		} else if (board[1][1] == 0) {
			board[1][1] = 1;
		} else if (board[2][0] == 0) {
			board[2][0] = 1;
		}
	}
	
	public static boolean onesinarow(int[][] board, int row) {
		for (int i = 0; i < 3; i++) {
			if (board[row][i] == 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void fillrowwith1(int[][] board, int row) {
		int pick = (int)(Math.random()*3);
		while (board[row][pick] != 0) {
			pick = (int)(Math.random()*3);
		}
		board[row][pick] = 1;
	}
	
	public static boolean onesinacol(int[][] board, int col) {
		for (int i = 0; i < 3; i++) {
			if (board[i][col] == 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void fillcolwith1(int[][] board, int col) {
		int pick = (int)(Math.random()*3);
		while (board[pick][col] != 0) {
			pick = (int)(Math.random()*3);
		}
		board[pick][col] = 1;
	}
	
	public static boolean onesinmajordiag(int[][] board) {
		for (int i = 0; i < 3; i++) {
			if (board[i][i] == 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void fillmajordiagwith1(int[][] board) {
		int pick = (int)(Math.random()*3);
		while (board[pick][pick] != 0) {
			pick = (int)(Math.random()*3);
		}
		board[pick][pick] = 1;
	}
	
	public static boolean onesinminordiag(int[][] board) {
		if (board[0][2] == 2) {
			return false;
		}
		else if (board[1][1] == 2) {
			return false;
		}
		else if (board[2][0] == 2) {
			return false;
		}
		return true;
	}
	
	public static void fillminordiagwith1(int[][] board) {
		while (true) {
		    int pick = (int)(Math.random()*3);
		    if (pick == 0 && board[0][2] == 0) {
		        board[0][2] = 1;
		        break;
		    } else if (pick == 1 && board[1][1] == 0) {
		        board[1][1] = 1;
		        break;
		    } else if (pick == 2 && board[2][0] == 0) {
		        board[2][0] = 1;
		        break;
		    }
		}
	}
	
	public static boolean rowempty(int[][] board, int row) {
		for (int i = 0; i < 3; i++) {
			if (board[row][i] == 1 || board[row][i] == 2) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean colempty(int[][] board, int col) {
		for (int i = 0; i < 3; i++) {
			if (board[i][col] == 1 || board[i][col] == 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void fillemptyrow(int[][] board, int row) {
		int col = (int)(Math.random()*3);
		board[row][col] = 1;
	}
	
	public static void fillemptycol(int[][] board, int col) {
		int row = (int)(Math.random()*3);
		board[row][col] = 1;
	}
	
	public static boolean majordiagempty(int[][] board) {
		for (int i = 0; i < 3; i++) {
			if (board[i][i] == 1 || board[i][i] == 2) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean minordiagempty(int[][] board) {
		if (board[0][2] == 2 || board[1][1] == 2 || board[2][0] == 2 || board[0][2] == 1 || board[1][1] == 1 || board[2][0] == 1) {
			return false;
		}
		return true;
	}
	
	public static void fillemptymajordiag(int[][] board) {
		int i = (int)(Math.random()*3);
		board[i][i] = 1;
	}
	
	public static void fillemptyminordiag(int[][] board) {
		int pick = (int)(Math.random()*3);
		switch (pick) {
		case 0:
			board[0][2] = 1;
			break;
		case 1:
			board[1][1] = 1;
			break;
		case 2:
			board[2][0] = 1;
			break;
		}
	}
}
