package chapter13homework;

public class ThirteenTwelve_SumAreasOfGeometricObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeometricObject[] shapes = { new Circle(1.0), new Circle(3.3), new Rectangle(2.5, 5.0), new Rectangle(1.2, 2.0) };
		
		double totalarea = CalculateArea.sumArea(shapes);
		System.out.println(totalarea);
		

	}

}
