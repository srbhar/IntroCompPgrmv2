package practice;

public class GeometricObject {
 private String color = "white";
 private boolean filled;
 private java.util.Date dateCreated;

 /** Construct a default geometric object */
 public GeometricObject() {
 dateCreated = new java.util.Date();
 }

 /** Construct a geometric object with the specified color
 * and filled value */
 public GeometricObject(String color, boolean filled) {
 dateCreated = new java.util.Date();
 this.color = color;
 this.filled = filled;
 }

 /** Return color */
 public String getColor() {
 return color;
 }

 /** Set a new color */
 public void setColor(String color) {
 this.color = color;
 }

 /** Return filled. Since filled is boolean,
 its getter method is named isFilled */
 public boolean isFilled() {
 return filled;
 }

 /** Set a new filled */
 public void setFilled(boolean filled) {
 this.filled = filled;
 }

 /** Get dateCreated */
 public java.util.Date getDateCreated() {
 return dateCreated;
 }

 /** Return a string representation of this object */
 public String toString() {
 return "created on " + dateCreated + "\ncolor: " + color +
 " and filled: " + filled;
 }
 }

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
		System.out.println("Side 1 = " + side1 + ", Side 2 = " + side2 + ", Side 3 = " + side3 + ".");
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		System.out.println("Side 1 = " + side1 + ", Side 2 = " + side2 + ", Side 3 = " + side3 + ".");
	}
	
	public double getArea(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		return Math.sqrt((s-side1)*(s-side2)*(s-side3));
	}
	
	public double getPerimeter(double side1, double side2, double side3) {
		return side1+side2+side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
}