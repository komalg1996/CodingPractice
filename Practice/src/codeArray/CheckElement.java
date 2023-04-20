//-----check if array contains given value------
package codeArray;

import java.util.ArrayList;
import java.util.List;

public class CheckElement {

	public static void main(String[] args) {
		int []arr= {1,2,3,4};
		int value=4;
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);	
		} 
		System.out.println(al);
		System.out.println(al.contains(value));
	}

}
