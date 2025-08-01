package hw7_16;

public class SevenTwentyTwo_GameEightQueens {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[8][8];
		
        int row = 0;
        while (row < 8) {
            int[] cols = {0, 1, 2, 3, 4, 5, 6, 7};
            shuffle(cols);

            boolean placed = false;
            for (int i = 0; i < 8; i++) {
                int col = cols[i];
                if (safe(array, row, col)) {
                    array[row][col] = 1;
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                // restart if failed
                array = new int[8][8];
                row = 0;
            } else {
                row++;
            }
        }
        
		// print board
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array.length; c++) {
				System.out.print(array[r][c] == 1 ? "|" + RED + "Q" + RESET + "|" : "| |");
			}
			System.out.println();
		}

	}
	
	public static boolean safe(int[][] array, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (array[i][col] == 1) {
            	return false;
            }
        }

        // top left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (array[i][j] == 1) {
            	return false;
            }
        }

        // top right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < 8; i--, j++) {
            if (array[i][j] == 1) {
            	return false;
            }
        }

        return true;
	}
	
    public static void shuffle(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1));
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
