package array;

import java.util.Arrays;

public class ArrayTwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] sum = new int[2];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {

			j = i + 1;
			while (j < nums.length) {
				if (nums[i] + nums[j] == target) {
					sum[0] = i;
					sum[1] = j;
					System.out.println(Arrays.toString(sum));
					return sum;
				}
				j++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		System.out.println(Arrays.toString(nums));

		int target = 9;
		int[] out = twoSum(nums, target);
		System.out.println(Arrays.toString(out));
	}

}
