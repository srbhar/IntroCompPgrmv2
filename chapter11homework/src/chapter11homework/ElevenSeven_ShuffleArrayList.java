package chapter11homework;

import java.util.ArrayList;

public class ElevenSeven_ShuffleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(5);
		list.add(123);
		list.add(23);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(4);
		list.add(32);

		shuffle(list);

	}
	
	public static void shuffle(ArrayList<Integer> list) {
		int sizeoflist = list.size();
		
		for (int i = 0; i < sizeoflist; i++) {
			int num1 = (int)(Math.random()*sizeoflist);
			int num2 = (int)(Math.random()*sizeoflist);
			int temp = list.get(num1);
			list.set(num1, list.get(num2));
			list.set(num2, temp);
		}
		
		System.out.print(list);
		
	}

}
