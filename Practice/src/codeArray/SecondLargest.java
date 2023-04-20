//Write a Java program to find the second largest element in an array. 
//Write a Java program to find the second smallest element in an array.     
package codeArray;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int []arr= {5,7,9,8,3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));	//[3, 5, 7, 8, 9]
		System.out.println("2nd largest:"+arr[arr.length-2]);	//2nd largest
		System.out.println("2nd smallest:"+arr[1]);	//2nd smallest
		
	}

}
