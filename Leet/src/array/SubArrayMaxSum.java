package array;

import java.util.Arrays;

public class SubArrayMaxSum {

	public static void main(String[] args) {
		int []nums = {-2,1,-3,4,-1,2,1,-5,4};
		Arrays.sort(nums);														 
		System.out.println(Arrays.toString(nums));//[-5, -3, -2, -1, 1, 1, 2, 4, 4]
		int sum=0;
		for(int i=0;i<nums.length-1;i++) {
		sum=nums[i]+nums[i+1];
		}
		System.out.println(sum);
	}

}
