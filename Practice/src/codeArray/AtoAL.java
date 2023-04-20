package codeArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AtoAL {

	public static void main(String[] args) {
		int []arr= {2,3,4,5};
		System.out.println(Arrays.toString(arr));
		//. Write a Java program to convert an array to ArrayList.     
		List<Integer> al=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
		System.out.println(al);
		
		//Write a Java program to convert an ArrayList to an array.     
		Object []o=al.toArray();
		for(Object k:o) {
			System.out.print(k+" ");
		}
		
	}

}
