package chapter8homework;

public class EightSixteen_Sort2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] m = {
                {4, 2}, {1, 7}, {4, 5},
                {1, 2}, {1, 1}, {4, 1}
            };

            sort(m);

            // print sorted array
            for (int i = 0; i < m.length; i++) {
                System.out.println("{" + m[i][0] + ", " + m[i][1] + "}");
            }
        }

        public static void sort(int[][] m) {
            for (int i = 0; i < m.length - 1; i++) {
                for (int j = i + 1; j < m.length; j++) {
                    if (m[j][0] < m[i][0] || 
                       (m[j][0] == m[i][0] && m[j][1] < m[i][1])) {
                        // swap the rows
                        int temp0 = m[i][0];
                        int temp1 = m[i][1];
                        m[i][0] = m[j][0];
                        m[i][1] = m[j][1];
                        m[j][0] = temp0;
                        m[j][1] = temp1;
                    }
                }
            }
        }
}
