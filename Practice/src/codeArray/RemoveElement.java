//Write a Java program to remove a specific element from an array
package codeArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr = { 22, 11, 44, 33, 66 };
		int el = 11;
		int j = 0;
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] != el) {
				temp[j++] = arr[i];
			}
		}
		for (int a : temp) {
			System.out.print(a + " ");
		}
	}

	/*
	 * //array to list List<Integer> li = new ArrayList<Integer>(); for (int i = 0;
	 * i < arr.length; i++) { li.add(arr[i]); } System.out.println(li);
	 * 
	 * Iterator itr=li.iterator(); while(itr.hasNext()) { int data =
	 * (Integer)itr.next(); if(data==11) { itr.remove(); } } System.out.println(li);
	 * 
	 * //list to array Object[]a2=li.toArray(); for(Object o:a2) {
	 * System.out.print(o+" "); }
	 */

}
