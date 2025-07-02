package practice;

import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time = 10000;
		
		for (int i = 0; i < 8; i++) {
			long newTime = time * 10*i; // increment i to the proper values
			Date d = new Date(newTime); // use date package
			System.out.println(d);
		}
}
}