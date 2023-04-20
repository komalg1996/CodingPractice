//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number
package codeArray;

public class SumEqTo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };	//1,5 2,4
		int val= 6;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==val) {
					System.out.println(arr[i]+" + "+arr[j]);
				}
			}
		}
	}
}
