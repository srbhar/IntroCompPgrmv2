package chapter13homework;

public class Rectangle extends GeometricObject {
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * length;
	}
}