package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayEle {

	public static void main(String[] args) {
//		int a[]= {4,5,6,7};
//		for(int i=0;i<a.length/2;i++) {
//			int t=a[i];
//			a[i]=a[a.length-1-i];
//			a[a.length-1-i]=t;
//		}
		Integer a[]= {5,4,3,2,1};
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}

}
