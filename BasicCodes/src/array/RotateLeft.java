package array;

import java.util.Arrays;

public class RotateLeft {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int k=2;
		int []arr2=rotateLeft(arr,k);
		System.out.println(Arrays.toString(arr2));
		
	}
	//1
//	public static int[] rotateLeft(int[]arr, int k) {
//		int temp=0;
//		for(int i=0;i<k;i++) {
//			temp=arr[0];
//			for(int j=0;j<arr.length-1;j++) {
//				arr[j]=arr[j+1];
//			}
//			arr[arr.length-1]=temp;
//		}
//		
//		return arr;
//	}
	
	//2		{1,2,3,4}
//	public static int[] rotateLeft(int[]arr, int k) {
//		int temp[]=new int[k];
//		temp[0]=arr[0];
//		temp[1]=arr[1];
//		for(int i=0;i<arr.length-2;i++) {
//			arr[i]=arr[i+2];
//		}
//		arr[arr.length-2]=temp[0];
//		arr[arr.length-1]=temp[1];
//		
//		return arr;
//	}
	
	
	//3 public static void arraycopy (Object src, int srcPos, Object dest, int destPos, int length)  
	public static int[] rotateLeft(int[]arr, int k) {
		int temp[]=new int [k];
		System.arraycopy(arr, 0, temp, 0, k);
		System.arraycopy(arr, 2, arr, 0, arr.length-2);
		System.arraycopy(temp, 0, arr, arr.length-2, k);
		
		return arr;
	}

}
