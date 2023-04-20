package array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayEle {

	public static void main(String[] args) {
		int a[]= {4,5,6,7};
		System.out.println(Arrays.toString(a));
		
		//1
//		for(int i=0;i<a.length/2;i++) {
//			int t=a[i];
//			a[i]=a[a.length-1-i];
//			a[a.length-1-i]=t;
//		}
//		System.out.println(Arrays.toString(a));
		
		//2
		Integer arr[]= {5,4,3,2,1};
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
		
		//3
		int j=0;
//		int arr[]=new int[a.length];
//		for(int i=a.length-1;i>=0;i--) {
//			arr[j++]=a[i];
//		}
//		System.out.println(Arrays.toString(arr));
	}

}
