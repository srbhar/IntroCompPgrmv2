package chapter8homework;

public class EightFour_WeeklyHours {

    public static void main(String[] args) {
// 2d array with employee hour data
        int[][] matrix = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        // array to hold employee index and total hours
        int[][] employeeData = new int[8][2];

        // weekly hours for each employee
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
            employeeData[i][0] = i;
            employeeData[i][1] = total;
        }

        // sort the employee data by total hours (descending)
        for (int i = 0; i < employeeData.length; i++) {
            for (int j = i + 1; j < employeeData.length; j++) {
                if (employeeData[i][1] < employeeData[j][1]) {
                    int[] temp = employeeData[i];
                    employeeData[i] = employeeData[j];
                    employeeData[j] = temp;
                }
            }
        }

        // print the sorted results
        System.out.println("Employee hours from greatest to least:");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.println("Employee " + employeeData[i][0] + ": " + employeeData[i][1] + " hrs");
        }
    }

}
