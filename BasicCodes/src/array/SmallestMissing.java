//find the smallest missing number in array2 bt present in array1. else return -1.
package array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SmallestMissing {

	public static int findmissing(int[] arr1, int[] arr2) {
		int x = 0;
		Set<Integer> set1 = new HashSet<Integer>();
		for (int num : arr1) {
			set1.add(num);
		}
		System.out.print(set1);

		Integer smallestMissing = null;
		
		for(int num:arr2) {
			if(set1.contains(num)) {
				continue;
			} 
			if (smallestMissing == null || num > smallestMissing) {
                smallestMissing = num;
            }
		}
		System.out.println(smallestMissing);
		return smallestMissing;
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 3, 9, 6, 100, 22, 6, 12 };
		int[] arr2 = { 3, 9, 3, 3, 6, 50, 100, 40, 12 }; // op=22
		int x = findmissing(arr1, arr2);
	}

}
