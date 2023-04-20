package searching;

public class BinaryWithRecursion {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int val=6;
		System.out.println(binarySearchR(arr,0,arr.length-1,val));

	}

	private static int binarySearchR(int[] arr, int start, int end, int val) {
		if(end>=start && start<=arr.length-1) {
			int mid=start+(end-start)/2;
			if(arr[mid]==val) {
				return mid;
			}
			if(arr[mid]>val) {
				return binarySearchR(arr,start,mid-1,val);
			}
			return binarySearchR(arr,mid+1,end,val);
		}
		return -1;
	}

}
