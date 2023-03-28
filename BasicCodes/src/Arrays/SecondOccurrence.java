package Arrays;

public class SecondOccurrence {

	public static void main(String[] args) {
		int[] a = { 4, 5, 4, 1, 1, 2 };
		int inx = occurrence(a, 4, 2);
		if(inx>0) {
			System.out.println("ele fount at:"+inx);
		}else {
			System.out.println("invalid");
		}
	}

	static int occurrence(int a[], int ele, int oc) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (ele == a[i])
				count++;
			if (count == oc)
				return i;
		}
		return -1;
	}

}
