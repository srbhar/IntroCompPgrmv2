package classwork7_23;

public class Rectangle extends Shape implements Comparable<Rectangle>{
	
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return length * 2 + width * 2;
	}

	@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		if (this.getArea() == o.getArea()) {
			return 0;
		}
		else if (this.getArea() > o.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
    public String toString() {
        return String.format("Length: " + BLUE + "%.2f" + RESET + ", Width: " + BLUE + "%.2f" + 
    RESET + ", Area: " + BLUE + "%.2f" + 
    RESET + ", Perimeter: " + BLUE + "%.2f" + RESET,
                length, width, getArea(), getPerimeter());
    }

}
