//find 1st not repeted character
package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeting {

	public static void main(String[] args) {
		String in = "AABCDBE";

		// WITHOUT COLLECTIONS

		for (int i = 0; i < in.length(); i++) {
			boolean flag = true;

			for (int j = 0; j < in.length(); j++) {
				if (i != j && in.charAt(i) == in.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(in.charAt(i));
				break;
			}
		}
		// OUTPUT C

		// using MAP
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		//to find 1st non repeted.--> entrySet
		for(Entry<Character, Integer> entrySet :map.entrySet()){
			if(entrySet.getValue()==1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}
		
		
	}

}
