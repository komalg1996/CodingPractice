package Strings;

public class ToLower {

	public static String toLowerCase(String s) {
		String ret="";
		for(int i = 0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				ret=ret+Character.toLowerCase(c);
			}else {
				ret=ret+c;
			}
		}
		
		return ret;

	}

	public static void main(String[] args) {
		String s = "Hello";
		String v = toLowerCase(s);
		System.out.println(v);
	}

}
