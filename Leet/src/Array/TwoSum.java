//https://leetcode.com/problems/two-sum/
package Array;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
    	int out[]= new int[2];
    	for(int i=0;i<nums.length;i++) {
    		int j=i+1;
    		while(j<nums.length) {
    			if(nums[i]+nums[j]==target) {
    				out[0]=i;
    				out[1]=j;
    			return out;
    			}
    			j++;
    		}
    	}
		return null;
        
    }
	public static void main(String[] args) {
		int [] nums = {7,13,8,11,2,15} ;
		int target = 9;
		int[] out = twoSum(nums, target);
		System.out.println(Arrays.toString(out));
	}
}
