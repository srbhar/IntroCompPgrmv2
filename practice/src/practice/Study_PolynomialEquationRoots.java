package practice;

import java.util.Scanner;
import java.util.ArrayList;

public class Study_PolynomialEquationRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the components of a polynomial equation: ");
		while (input.hasNextInt()) {
			numeros.add(input.nextInt());
		}
		
		ArrayList<Integer> prr = new ArrayList<>(); // factors of last number of the polynomial equation
		ArrayList<Integer> pfactors = new ArrayList<>();
		
		for (int i = 0; i < numeros.get(numeros.size()-1); i++) {
			if (numeros.get(numeros.size()-1) % i == 0) {
                pfactors.add(i);
            }
		}
		
		ArrayList<Integer> qfactors = new ArrayList<>();
		
		for (int i = 0; i < numeros.get(0); i++) {
			if (numeros.get(0) % i == 0) {
                qfactors.add(i);
            }
		}
		
		

	}

}
