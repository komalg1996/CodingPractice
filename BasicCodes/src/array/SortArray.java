package array;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 33, 7, 3, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
//					int t = arr[i];
//					arr[i] = arr[j];
//					arr[j] = t;

					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}