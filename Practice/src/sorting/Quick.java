package sorting;

import java.util.Arrays;

public class Quick {

	private static void quickSort(int[] arr,int low,int hi) {
		if(low>=hi) {
			return;
		}
		int start=low;
		int end=hi;
		int mid=start+(end-start)/2;
		int pivot=arr[mid];
		
		while(start<=end) {
			while(arr[start]<pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			}
			
			if(start<=end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		//now pivot is at correct index so sort 2 half
		quickSort(arr,low,end);
		quickSort(arr,start,hi);
	}
	
	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 5, 3 };
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	

}
