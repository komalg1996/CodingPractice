//88. Merge Sorted Array
package array;

import java.util.Arrays;

public class Merge {

	 public static void merge(int[] nums1, int m, int[] nums2, int n) { 
		 int i=m-1; // will point at m-1 index of nums1 array
		 int j=n-1;// will point at n-1 index of nums2 array
		 int k=nums1.length-1;//will point at the last position of the nums1 array
		 
		 while(j>=0) {
			 if(i>=0 && nums1[i]>nums2[j]) {
				 nums1[k]=nums1[i];
				 k--;
				 i--;
			 }else {
				 nums1[k]=nums2[j];
				 k--;
				 j--;
			 }
		 }
		 System.out.println(Arrays.toString(nums1));
	 }
	 
	public static void main(String[] args) {
		int []nums1 = {1,2,3,0,0,0};
		int []nums2 = {2,5,6};
		int m = 3,  n = 3;
		//output : [1,2,2,3,5,6]
		merge(nums1,m,nums2,n);
		
	}

}
