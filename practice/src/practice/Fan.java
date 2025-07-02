package practice;

public class Fan {
	
	// instance variables
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	} // best practice to set defaults in constructor
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	public boolean getOn() {
		return on;
	}
	
	public void setOn(boolean newOn) {
		on = newOn;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public String toString() {
		if (on) {
			return speed + ", " + radius + ", " + color + ".";
		} else {
			return color + ", " + radius + ". Fan is off.";
		}
	}

}
