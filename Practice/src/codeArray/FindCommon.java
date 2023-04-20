//Write a Java program to find the common elements between two arrays (string values)
package codeArray;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindCommon {

	public static Set<Character> findCommon(String s1,String s2){
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j) && s1.charAt(i)!=' ') {
					set.add(s1.charAt(i));
				}
			}
		}
		
		return set;
		
	}
	
	
	public static void main(String[] args) {
		String s1="i learn coding";
		String s2="i enjoy coding";
		System.out.println(findCommon(s1,s2));

	}

}
