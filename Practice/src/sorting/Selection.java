package sorting;

import java.util.Arrays;

public class Selection {

	public static int[] selectionSort(int[] arr) {		//logic:last,max,swap
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int maxIndex= getMaxIndex(arr,0,last);
			//swap(arr,maxIndex,last);
			int temp=arr[last];
			arr[last]=arr[maxIndex];
			arr[maxIndex]=temp;
		}
		
		return arr;

	}
	static int getMaxIndex(int[] arr,int start,int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
				
			}
		}
		return max;
		
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 1, 2, 3 };
		System.out.println("Orignal Array: "+ Arrays.toString(arr));
		int[] arr2 = selectionSort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr2));
	}

}
