package Arrays;

public class MissingNum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 6, 7, 3, 8, 9 };
		boolean flag = true;
		for (int i = 1; i < 10; i++) {
			flag=false;
			for (int j = 0; j < arr.length; j++) { //
				if(arr[j]==i) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println(i);
			}
		}

	}
}
