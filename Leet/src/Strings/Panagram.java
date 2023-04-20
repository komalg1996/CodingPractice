package Strings;

import java.util.HashMap;

public class Panagram {
	public static boolean checkIfPangram(String sentence) {
//
//		int flag = 0;
//		for (char i = 'a'; i <= 'z'; i++) {
//			if (sentence.contains(String.valueOf(i))) {
//				flag = 1;
//				break;
//			}
//		}
//		if (flag == 1)
//			return false;
//		return true;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < sentence.length(); i++) {
			map.put(sentence.charAt(i), 1);
		}

		if (map.size() == 26) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		String sentence = "dfghjkcvbnmwertyuio";
		System.out.println(checkIfPangram(sentence));

	}

}
