//Write a Java program to reverse an array of integer values.     
package codeArray;

import java.util.Arrays;

public class Rev {

	private static int[] arrReverse(int[] arr) {
		int[] rev=new int[arr.length];
		int k=0;
		for(int i=rev.length-1;i>=0;i--) {
			rev[k++]=arr[i];
		}
		//System.out.println(Arrays.toString(rev));
		return rev;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int [] x=arrReverse(arr);
		System.out.println(Arrays.toString(x));
	}


}
