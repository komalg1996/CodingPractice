//Write a Java program to find the duplicate values of an array of integer values.     
package codeArray;

import java.util.Arrays;

public class DuplicateNum {

	public static void findDuplicate(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
		}
	}
		
	}
	public static void main(String[] args) {
		int[] arr= {24,23,24,82,12,23}; //24,23
		findDuplicate(arr);
		
	}

}
