package classwork7_23;

public class OctagonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Octagon o1 = new Octagon();
		o1.setSideValue(5);
		Octagon o2 = new Octagon();
		o2.setSideValue(10);
		
		System.out.println("Octagon 1: Side value " + o1.getSideValue() + ", area " + o1.getArea() + ", perimeter " + o1.getPerimeter());
		System.out.println("Octagon 2: Side value " + o2.getSideValue() + ", area " + o2.getArea() + ", perimeter " + o2.getPerimeter());
		
        int result = o1.compareTo(o2);
        if (result == 0) {
            System.out.println("Both octagons have the same side length.");
        } else if (result < 0) {
            System.out.println("Octagon 1 has a smaller side than Octagon 2.");
        } else {
            System.out.println("Octagon 1 has a larger side than Octagon 2.");
        }

	}

}
