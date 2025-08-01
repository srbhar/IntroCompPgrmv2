package chapter13homework;

public class CalculateArea {
	
	public static double sumArea(GeometricObject[] a) {
		
		double totalarea = 0;
		for (GeometricObject object : a) {
			totalarea += object.getArea();
		}
		
		return totalarea;
			
	}

}
