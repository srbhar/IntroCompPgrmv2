package practice;

public class GeoObjectTestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeoObject circle1 = new GeoObject();
		circle1.setObj1Area(1);
		GeoObject circle2 = new GeoObject();
		circle2.setObj2Area(2);
		int max = max(circle1.getObj1Area(), circle2.getObj2Area());
		System.out.println(max);

	}

}
