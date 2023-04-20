package sorting;

import java.util.Arrays;

public class Bubble {

	public static int[] sortArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					//System.out.println(Arrays.toString(arr));
				}
			}
		}
		
		return arr;
		
	}
	public static void main(String[] args) {
		int [] arr= {3,1,5,4,2};
		System.out.println("Orignal Array: "+ Arrays.toString(arr));
		int [] arr2=sortArray(arr);
		System.out.println("Sortrd Array: "+Arrays.toString(arr2));
	}

}
