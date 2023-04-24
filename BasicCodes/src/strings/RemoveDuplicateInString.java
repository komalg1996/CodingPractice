//reffer it
package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String s = "programming";

		// Approach 1: by java 8

		StringBuilder sb1 = new StringBuilder();
		s.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println("way 1 " + sb1);

		// Approach 2: indexOf() of string class

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int idx = s.indexOf(ch, i + 1);
			if (idx == -1) {
				sb.append(ch);
			}
		}
		System.out.println("way 2 " + sb);

		// Approach 3: char array

		char[] arr = s.toCharArray();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = 1;
					break;
				}
			}
			if (count == 0) {
				sb2.append(arr[i]);
			}
		}
		System.out.println("way 3 " + sb2);
		
		//Approach 4: set interface
		
		StringBuilder sb3 = new StringBuilder();
		Set<Character> set =new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		//to get each character from set use foreach loop
		for(Character c: set) {
			sb3.append(c);
		}
		System.out.println("way 4 "+ sb3);
		
		

	}

}
