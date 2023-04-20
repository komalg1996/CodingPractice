//Write a Java program to find the duplicate values of an array of string values
package codeArray;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateInString {

	private static Set<Character> findDuplicate(String s) {
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					set.add(s.charAt(i));
				}
			}
		}
		
		return set;
		
		
	}
	
	public static void main(String[] args) {
		String s="ghkfghk";
		System.out.println(findDuplicate(s));;
		
		

	}

	

}
