package array;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectArray {

	public static void main(String[] args) {
		int[] nums1 = {4,9,5}; 
		int[] nums2 = {9,4,9,8,4};
		int [] ans=intersect(nums1,nums2);
		System.out.println(Arrays.toString(ans));

	}
	// Runtime: 1 ms, faster than 99.13% of Java online submissions for Intersection of Two Arrays II.
	// Memory Usage: 42.5 MB, less than 92.71% of Java online submissions for Intersection of Two Arrays II.

	    public static int[] intersect(int[] nums1, int[] nums2) {
	        // Sort both the arrays first...
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        // Create an array list...
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        // Use two pointers i and j for the two arrays and initialize both with zero.
	        int i = 0, j = 0;
	        while(i < nums1.length && j < nums2.length){
	            // If nums1[i] is less than nums2[j]...
	            // Leave the smaller element and go to next(greater) element in nums1...
	            if(nums1[i] < nums2[j]) {
	                i++;
	            }
	            // If nums1[i] is greater than nums2[j]...
	            // Go to next(greater) element in nums2 array...
	            else if(nums1[i] > nums2[j]){
	                j++;
	            }
	            // If both the elements intersected...
	            // Add this element to arr & increment both i and j.
	            else{
	                arr.add(nums1[i]);
	                i++;
	                j++;
	            }
	        }
	        // Create a output list to store the output...
	        int[] output = new int[arr.size()];
	        int k = 0;
	        while(k < arr.size()){
	            output[k] = arr.get(k);
	            k++;
	        }
	        return output;
	    }
	
}
