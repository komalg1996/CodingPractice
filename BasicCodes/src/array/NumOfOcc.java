package array;

public class NumOfOcc {

	public static void main(String[] args) {
		int []a= {11,22,22,55,44,11,66,11};
		numOfOcc(a,11);
		
	}

	private static void numOfOcc(int[] a, int k) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k)
				count++;
		}
		System.out.println(count);
	}

}
