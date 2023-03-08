//using 2 for loop and LinkedHashset
package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateUsingFor {

	public static void main(String[] args) {
		System.out.println(findDuplicate("code decode"));
	}

	private static Set<Character> findDuplicate(String string) {
		Set<Character> duplicate = new LinkedHashSet<Character>();
		for(int i=0;i<string.length();i++) {
			for(int j=i+1;j<string.length();j++) {
				if(string.charAt(i)==string.charAt(j)) {
					duplicate.add(string.charAt(j));
				}
			}
		}
		return duplicate;
	}

}
