package Strings;

public class RemoDup {

	private static String removeDups(String s) {
		String str=new String();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(str.indexOf(c)<0)
				str=str+c;
		}
		
		return str;
	}

	public static void main(String[] args) {
		String S="kokozm";
		String res=removeDups(S);
		System.out.println(res);
	}

	
}
