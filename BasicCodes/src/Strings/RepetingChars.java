package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class RepetingChars {

	public static void main(String[] args) {
		String str="aabbccacdd";
		HashMap<Character, Integer> h= new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(h.get(str.charAt(i))==null) {
				h.put(str.charAt(i), 1);
			//	System.out.println(h);

			}else {
				h.put(str.charAt(i), h.get(str.charAt(i))+1);
				//System.out.println(h);

			}
		}
		System.out.println(h);
		
		
		
		//String str2="a3b2c3";
	//	int count=0;
//		ArrayList<Character> arr=new ArrayList<Character>();
//		for(int i=0;i<str.length();i++) {
//			count=0;
//			if(arr.contains(str.charAt(i))) {
//				continue;
//			}
//			arr.add(str.charAt(i));
//
//			for(int j=0;j<str.length();j++)
//			{
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//					}	
//			}
//			System.out.println(str.charAt(i)+"->"+ count);
//		}
	}

}
