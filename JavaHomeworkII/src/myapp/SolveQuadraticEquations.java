package myapp;

import java.util.Scanner;

public class SolveQuadraticEquations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        String whatsgood;

        if (discriminant > 0) {
            whatsgood = "two";
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The equation has "+ whatsgood + " real roots: %.6f and %.6f", root1, root2);
        } else if (discriminant == 0) {
            whatsgood = "one";
            double root = -b / (2 * a);
            System.out.println("The equation has " + whatsgood + " real root: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }

        input.close();
    }
}