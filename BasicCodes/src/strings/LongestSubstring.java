package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		String s1="java";
		String s2=longestSubString(s1);
			System.out.println(s2);	
	}

	private static String longestSubString(String s1) {
		String longest=null;
		int longestlength=0;
		Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		
		char []arr=s1.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>longestlength) {
				longestlength=map.size();
				longest=map.keySet().toString();
			}
		}
		
		return longest;
	}

}
