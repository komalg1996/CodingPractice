package array;

import java.util.Arrays;
//return max k from array in descending order;
public class ReturnMaxk {

	private static void returnMaxk(int[] arr, int k) {
		Arrays.sort(arr); // [1, 2, 3, 4, 4, 5, 6, 7, 7]
		System.out.println(Arrays.toString(arr));
		int[] temp = new int[k];
		int j = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] != arr[i - 1]) {
				//System.out.println(arr[i]);
				while (j < k) {
					temp[j] = arr[i];
					j++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 5, 6, 7, 7 };
		int k = 3;
		returnMaxk(arr, k);

	}

}
