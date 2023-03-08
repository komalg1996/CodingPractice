package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {
	
	public static void printDuplicateCharacters(String str) {
		if(str==null) {
			System.out.println("Null String");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if(str.length()==1) {
			System.out.println("Single char String");
			return;
		}
		char []words=str.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		for(Character ch : words) {
			if(charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch)+1);
			}
			else {
				charmap.put(ch, 1);
			}
		}
		//printing map --- entrySet
		Set<Map.Entry<Character, Integer>> entrySet= charmap.entrySet();
		for(Map.Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		printDuplicateCharacters("java");
	}

}
