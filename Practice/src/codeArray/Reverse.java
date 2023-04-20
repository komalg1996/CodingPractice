//take array of 5 elements and reverse it
package codeArray;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int []arr= {5,4,3,2,1};
//		for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" ");
//		}
		System.out.println(Arrays.toString(arr));
		
		int []rev= new int[arr.length]; 
		int k=0;
		for(int i=arr.length-1;i>=0;i--) {
			rev[k++]=arr[i];
		}
//		for(int j=0;j<rev.length;j++) {
//		System.out.print(rev[j]+" ");
//		}
		System.out.println(Arrays.toString(rev));
	}

}
