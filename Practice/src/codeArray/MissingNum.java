//Write a Java program to find a missing number in an array
package codeArray;

public class MissingNum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 8 }; // 3,5,7
		boolean flag = false;
		for (int i = 1; i <= 10; i++) {
			flag = false;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==i) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.print(i+" ");
			}
		}
	}

}
