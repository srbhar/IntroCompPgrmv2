package chapter13homework;

public class Circle extends GeometricObject {
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
}