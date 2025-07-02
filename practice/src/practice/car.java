package practice;

import java.util.Scanner;

public class car {

	// data fields
	private String model;
	private int year;
	private String color;
	
	// new method which declares new model, year & color
	public car(String model, int year, String color) {
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	// default constructor
	public car() {
		model = "honda";
		year = 2020;
		color = "blue";
	}
	
	// getters
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	// setters
	public void setModel(String newModel) {
		model = newModel;
	}
	
	public void setYear(int newYear) {
		year = newYear;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	// main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a model: ");
		String model = input.next();
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a color: ");
		String color = input.next();
		
		// refer to car method
		car car1 = new car(model, year, color);
		System.out.print("The car is a " + car1.getColor() + " " + car1.getYear() + " " + car1.getModel() + "."); // refer to getters (setters just an example)
		
		input.close();
	}
}
