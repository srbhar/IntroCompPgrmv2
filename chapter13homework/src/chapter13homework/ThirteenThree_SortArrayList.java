package chapter13homework;
import java.util.ArrayList;
import java.util.Collections;
public class ThirteenThree_SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(43);
		list.add(1);
		list.add(20);
		sort(list);
		System.out.println(list);
		

	}
	
	public static void sort(ArrayList<Integer> list) {
		for (int i = list.size(); i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (list.get(j+1) < list.get(j)) {
					Collections.swap(list, j+1, j);
				}
			}
		}
	}

}
