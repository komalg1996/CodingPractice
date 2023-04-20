package searching;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid;

		while (low <= high) {

			mid = (low + high) / 2;

			if (arr[mid] == key) {
				return mid;
			}

			if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 8, 5, 9, 2, 6, 4, 1 };
		int value = 2;
		int index = binarySearch(arr, value);
		System.out.println("index of " + value + " is " + index);
	}

}
/*
 * int start = 0; int end = arr.length - 1; int mid; while(start<=end) { mid =
 * (start + end) / 2;
 * 
 * if (value == arr[mid]) { return mid; } if (value < arr[mid]) { end = mid - 1;
 * 
 * } else { start = mid + 1; } }
 * 
 * return -1; }
 */