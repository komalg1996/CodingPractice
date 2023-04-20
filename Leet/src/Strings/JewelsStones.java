package Strings;

import java.util.HashSet;
import java.util.Set;

public class JewelsStones {

	public static int numJewelsInStones(String jewels, String stones) {
//		int count = 0;
//		for (int j = 0; j < stones.length(); j++) {
//			for (int i = 0; i < jewels.length(); i++) {
//				if (jewels.charAt(i) == stones.charAt(j)) {
//					count = count + 1;
//				}
//			}
//		}
//
//		return count;

		int count = 0;
		Set set = new HashSet<>();
		for (int i : jewels.toCharArray()) //charAt(i)
			set.add(i);
		for (int j : stones.toCharArray())
			if (set.contains(j))
				count++;
		return count;
	}

	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";

		int a = numJewelsInStones(jewels, stones);
		System.out.println(a);
	}

}
/*
 * { HashMap<Character, Integer> hm = new HashMap<>(); for(char ch :
 * stones.toCharArray()) hm.put(ch,hm.getOrDefault(ch,0)+1); int res=0; for(char
 * ch : jewels.toCharArray()) res+=hm.getOrDefault(ch,0); return res; }
 */