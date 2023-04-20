//Write a Java program to find the maximum and minimum value of an array.
package codeArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMin {
	public static String findMaxMin(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
//		System.out.println("Max:"+arr[0]);
//		System.out.println("Min:"+arr[arr.length-1]);
		
		return "Min:"+arr[0]+" Max:"+arr[arr.length-1];
	}
	
	public static void main(String[] args) {
		int []arr= {50,70,10,20,60};
		String a= findMaxMin(arr);
		System.out.println(a);
	}

}
