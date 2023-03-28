package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BigSmall {

	public static void main(String[] args) {
		Integer a[]= {40,50,70,90,100};
		//1
//		int big=0,small=0;
//		for(int i=0;i<a.length;i++) {
//			big=a[0];
//			small=a[0];
//			if(big<a[i]) {
//				big=a[i];
//			}
//			if(small>a[i]) {
//				small=a[i];
//			}
//		}
//		System.out.println(big);
//		System.out.println(small);
		
		//2
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	
	//3
	List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		System.out.println(list.get(0));
	
	}
}
