package classwork7_23;
import java.util.Collections;
import java.util.ArrayList;
public class RandomRectangleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Rectangle> list = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			double length = Math.random()*900 + 100;
			double width = Math.random()*900 + 100;
			Rectangle rec = new Rectangle(length, width);
			list.add(rec);
		}
		
		Collections.sort(list);
		
        for (Rectangle r : list) {
            System.out.println(r);
        }

	}

}
