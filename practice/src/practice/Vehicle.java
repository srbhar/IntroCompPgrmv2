package practice;

public class Vehicle {

	private int wheels;
	private int doors;
	
	public Vehicle() {
		wheels = 4;
		doors = 4;
	}
	
	public Vehicle(int wheels, int doors) {
		this.wheels = wheels;
		this.doors = doors;
	}
	
	public void move() {
		System.out.println("Vehicle is flying");
	}
	
	
}

class Car extends Vehicle {
	
	private String make;
	private int year;
	
	public Car() {
		super();
	}
	
	public void move() {
		System.out.println("Car is flying");
	} // overriding (same parameters)
	
}