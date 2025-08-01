package practice;

public class MaximumRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[][] matrix = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        System.out.println(maximalRectangle(matrix));
        
		}

    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxArea = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    int width = Integer.MAX_VALUE;
                    for (int k = i; k < rows && matrix[k][j] == '1'; k++) {
                        int currentWidth = 0;
                        while (j + currentWidth < cols && matrix[k][j + currentWidth] == '1') {
                            currentWidth++;
                        }
                        width = Math.min(width, currentWidth);
                        int height = k - i + 1;
                        int area = width * height;
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
        }
        
        return maxArea;
    }
	}