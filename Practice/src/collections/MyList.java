package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(4);
		a.add(3);
		a.add(2);
		
		System.out.println(a);

		System.out.println(rotateLeft(2,a));
//		for(int i=0,j=a.size()-1;i<j;i++) {
//			int temp=a.remove(j);
//			a.add(i,temp);
//		}
//		System.out.println(a);
		
		//System.out.println(reverseArray(a));
	}
	//Reverse list
	//public static List<Integer> reverseArray(List<Integer> a) {
		
		//Collections.reverse(a);
		//return a;
	    
	   // }
	//left shift by 2
	 public static List<Integer> rotateLeft(int d, List<Integer> a) {
		 // perform left rotation without using built-in method  
/*		for(int i=0;i<d;i++) {
			int temp=a.get(0);
			
			for(int j=0;j<a.size()-1;j++) {
				a.set(j,a.get(j+1));
				
			}
			a.set(a.size()-1, temp);
		}
			
		 
		return a;
		    
		    }*/
		 
	 	//using built in methods
	 Collections.rotate(a, -(d));
	 return a;

}
}