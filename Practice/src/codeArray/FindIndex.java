//Write a Java program to find the index of an array element.     
package codeArray;

public class FindIndex {

	public static void main(String[] args) {
		int []arr= {22,11,44,33,66};
		int el=11;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==el) {
				System.out.println("index is "+ i);
			}
		}
	}

}
