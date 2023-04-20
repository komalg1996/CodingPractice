//1365. How Many Numbers Are Smaller Than the Current Number
package array;

import java.util.Arrays;

public class SmallerThanCurrent {

	public static void main(String[] args) {
		int[] nums = { 8, 1, 2, 2, 3 };
		int []x=smallerNumbersThanCurrent(nums);
		System.out.println(Arrays.toString(x));
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] count = new int[101];
        int[] res = new int[nums.length];
        
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
           
        }
        
        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];    
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else 
                res[i] = count[nums[i] - 1];
        }
        
        return res;

	}

}
