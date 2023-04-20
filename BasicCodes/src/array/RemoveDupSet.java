package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupSet {

	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,40,50,50};  
		System.out.println("Orignal "+Arrays.toString(arr));
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);

	}

	private static int removeDuplicateElements(int[] arr, int len) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<len;i++) {
			set.add(arr[i]);
		}
		System.out.println("Duplicates removed "+set);
		
		
		Integer[] array=set.toArray(new Integer[0]);
		System.out.println("Converted to Array "+Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("After sorting array "+Arrays.toString(array));

		return 0;
	}

}
