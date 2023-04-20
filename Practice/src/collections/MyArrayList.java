package collections;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<>();
		al.add(10);	//0
		al.add(20);	//1
		al.add(30); //2
		al.add(40);
		al.add(50);
		al.add(30);		//duplicate allowed, insersion order preserved
//		System.out.println(al);
//		System.out.println(al.get(2));
//		al.remove(1);	
//		System.out.println(al);
//		al.set(2, 100);
//		System.out.println(al);
//		System.out.println(al.indexOf(30));		//[10, 20, 30, 40, 50, 30]--> 2
		//System.out.println("Size is: "+al.size());
		
		
		ArrayList<Integer> al2 =new ArrayList<>();
		//System.out.println(al2);
		
		//al2.addAll(al);
		//System.out.println(al2);
		al2.add(500);
		al2.add(400);
		al2.add(100);
		al2.add(900);
		al2.addAll(2, al);
		System.out.println(al2);
		System.out.println(al2.contains(60));
		System.out.println(al2.contains(100));
	}

}
