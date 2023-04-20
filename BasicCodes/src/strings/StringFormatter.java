package strings;

public class StringFormatter {
//	public static String reverseString(String str) {
//		StringBuilder sb = new StringBuilder(str);
//		sb.reverse();
//		return sb.toString();
//
//	}
	public static String reverseString(String str) {
		char ch[]=str.toCharArray();
		String rev= " ";
		for(int i =ch.length-1;i>=0;i--) {
		rev+=ch[i];
		}
		return rev;

}
}