//Write a Java program to insert an element (specific position) into an array.     
package codeArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class AddAtPosition {

	private static void addAtPos(int[] arr, int pos, int value) {
		int len=arr.length+1;
		int[]a1=new int [len];
		for(int i=0;i<len;i++) {
			if(i<pos-1) {
				a1[i]=arr[i];
				System.out.println(a1[i]);
			}else if(i==pos-1) {
				a1[i]=value;
				System.out.println(a1[i]);

			}else {
				a1[i]=arr[i-1];
				System.out.println(a1[i]);

			}
		}
		
		
	}
	public static void main(String[] args) {
		
		
		int []arr1= {55,24,31,88};
		int pos=2;
		int value=100;
		addAtPos(arr1,pos,value);
		
//		Integer []arr= {55,24,31,88};
//		List<Integer> list= new ArrayList<Integer>(Arrays.asList(arr));
//		list.add(1, 100);
//		arr = list.toArray(arr);  
//		System.out.println("Array after adding element: "+Arrays.toString(arr));  

		




}
}
