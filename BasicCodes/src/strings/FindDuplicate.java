//Java program to print all duplicate characters in a string
package strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
	private static void countDuplicateCharacters(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] chArr = str.toCharArray();
		for(char c : chArr ) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			
			}else{
				map.put(c, 1);
			}
		}
//		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//			if(entry.getValue()>1) {
//				System.out.println(entry.getKey()+":"+entry.getValue());
//			}
//		}
		System.out.println(map);
			
	}

	public static void main(String[] args) {
		{
			// Given String str
			String str = "geeksforgeeks";

			// Function Call
			countDuplicateCharacters(str);
		}

	}

}
