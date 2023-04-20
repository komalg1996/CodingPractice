package strings;

import java.util.Arrays;

public class SpacesCount {

	public static void main(String[] args) {
		String s1 = " We learn coding  ";
//		String []s2=s1.split(" ");
//		System.out.println(Arrays.toString(s2));
//		int spaces=s2.length-1;
//		System.out.println(spaces);
	
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("num of count="+count);

	}
}
