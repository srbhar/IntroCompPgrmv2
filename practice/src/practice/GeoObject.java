package practice;

public abstract class GeoObject implements Comparable {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	private int obj1area;
	private int obj2area;
	
	/** Construct a default geometric object */
	public GeoObject() {
	dateCreated = new java.util.Date();
	}
		
	/** Construct a geometric object with color and filled value */
	public GeoObject(String color, boolean filled) {
	dateCreated = new java.util.Date();
	this.color = color;
	this.filled = filled;
	}
	
	public int max(int obj1area, int obj2area) {
		if (obj1area > obj2area)  {
			return obj1area;
		} else {
			return obj2area;
		}
	}
	
	public int getObj1Area() {
		return obj1area;
	}
	
	public int getObj2Area() {
		return obj2area;
	}

	public void setObj1Area(int obj1area) {
		this.obj1area = obj1area;
	}
	
	public void setObj2Area(int obj2area) {
		this.obj2area = obj2area;
	}
	
	/** Return color */
	public String getColor() {
	return color;
	}
}
