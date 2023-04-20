package ccpp;

import java.util.Arrays;

//delete k elements from end and add at front
public class DeleteKAddFront {

	public static int[] deleteAndAdd(int[] arr, int k) {
		int m=1;
		while(m<=k) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {	//shifting
				arr[i]=arr[i-1];
				System.out.print(arr[i]+" ");
			}
			arr[0]=temp;
			m++;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr= {9,8,7,6,5,4,3};		//len=7
		System.out.println("Before: "+Arrays.toString(arr));
		int k=3;
		deleteAndAdd(arr,k);
		System.out.println("After: "+Arrays.toString(arr));
	}

}
