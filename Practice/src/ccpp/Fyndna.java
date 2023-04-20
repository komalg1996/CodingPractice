package ccpp;

import java.util.ArrayList;
import java.util.Arrays;

public class Fyndna {

	public static void main(String[] args) {
		// int[] arr=new int[10];
		int[] arr = { 10, 3, 5, 77, 44, 23, 11 };
		int n = 7;
		int k = 3;
		kLength(arr,n,k);
		System.out.println();
	}

	private static void kLength(int[] arr, int n, int k) {
		
		//ArrayList<Integer> al = new ArrayList<Integer>());
		
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] ans = new int[k];
		int z=0;
		System.out.println(arr.length-1);
		for(int i=arr.length-1;i>=(arr.length-k);i--) {
			ans[z++]=arr[i];
			
		}
		System.out.println(Arrays.toString(ans));
	}

}
