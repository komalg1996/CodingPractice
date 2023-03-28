package Array;

import java.util.Arrays;

public class LeftRight {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int[] x =leftRigthDifference(nums);
		System.out.println(Arrays.toString(x));
	}

	public static int[] leftRigthDifference(int[] nums) {
		int[] leftSum = new int[nums.length]; 
        int[] rightSum = new int[nums.length]; 
        int[] answer = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
        	//System.out.println((leftSum[i]));
            leftSum[i + 1] = leftSum[i] + nums[i];
            
        }
        System.out.println(Arrays.toString(leftSum));
        for(int i = nums.length - 1 ; i > 0 ; i--)
        {
        	
            rightSum[i - 1] = rightSum[i] + nums[i]; 
        }
        System.out.println(Arrays.toString(rightSum));
        for(int i = 0 ; i < nums.length ; i++)
        {
            answer[i] = (int)Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
		

	}

}
