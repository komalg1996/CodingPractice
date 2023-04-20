package strings;

import java.util.Arrays;

public class RemoveAndReturn {

	private static String remove(String str) {
		String newstr = " ";
		String[] temp = str.split("_");
		// System.out.println(Arrays.toString(ch));
		for (int i = 0; i < temp.length; i++) {
			newstr = newstr + temp[i];
		}
		return newstr;
	}

	public static void main(String[] args) {
		String str = "Hello_ I_ am_ fine!!!";
		System.out.println("Before:" + str);
		String str2 = remove(str);
		System.out.println("After:" + str2);

	}
}
