//Write a Java program to test the equality of two arrays
package codeArray;

import java.util.Arrays;

public class TestEqual {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		
	boolean ans=Arrays.equals(arr1, arr2);
	if(ans==true)
		System.out.println("Equal");
	else
		System.out.println("NotEqual");
	}

}
