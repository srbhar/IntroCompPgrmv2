package practice;

import java.util.Scanner;

public class car {

	private String model;
	private int year;
	private String color;
	
	public car(String model, int year, String color) {
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	public car() {
		model = "honda";
		year = 2020;
		color = "blue";
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setModel(String newModel) {
		model = newModel;
	}
	
	public void setYear(int newYear) {
		year = newYear;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a model: ");
		String model = input.next();
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a color: ");
		String color = input.next();
		
		car car1 = new car(model, year, color);
		System.out.print("The car is a " + car1.getColor() + " " + car1.getYear() + " " + car1.getModel() + ".");
		
		input.close();
	}
}
