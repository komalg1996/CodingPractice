package array;

public class Zigzag {

	public static void main(String[] args) {
		int a1[] = { 2, 5, 33, 7, 3, 1 };
		int a2[] = { 3, 6, 8, 0, 9 };
		int res[]=new int[a1.length+a2.length];
		int i=0,j=0;
		for(int k=0;k<res.length;) {
			if(i<a1.length) {
				res[k]=a1[i];
				i++;
				k++;
			}
			if(j<a2.length) {
				res[k]=a2[j];
				j++;
				k++;
			}
		}
		for(int l=0;l<res.length;l++) {
			System.out.println(res[l]);
		}
		
	}

}
