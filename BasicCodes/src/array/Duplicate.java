package array;

public class Duplicate {

	public static void main(String[] args) {
		int arr[]= {2,5,33,5,7,3,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
