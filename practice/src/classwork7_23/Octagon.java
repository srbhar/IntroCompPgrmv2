package classwork7_23;

public class Octagon extends Shape implements Comparable<Octagon>{
	
	private double sidevalue;
	
	public double getSideValue() {
		return sidevalue;
	}
	
	public void setSideValue(double sidevalue) {
		this.sidevalue = sidevalue;
	}
	
	public double getArea() {
		return ((2 + 4/Math.sqrt(2))*sidevalue*sidevalue);
	}
	
	public double getPerimeter() {
		return sidevalue * 8;
	}

	@Override
	public int compareTo(Octagon o) {
		// TODO Auto-generated method stub
        if (this.getSideValue() > o.getSideValue()) {
            return 1;
        } else if (this.getSideValue() < o.getSideValue()) {
            return -1;
        } else {
            return 0;
        }
	}

}
