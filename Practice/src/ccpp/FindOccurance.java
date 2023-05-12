package ccpp;

import java.util.HashMap;

public class FindOccurance {

	public static void main(String[] args) {
		String s1 = "aaabbccc";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		System.out.println(map);
	}

}
