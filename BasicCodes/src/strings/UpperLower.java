package strings;

public class UpperLower {

	public static String changeCase(String str) {
		String newstr="";
		
		for(int i=0;i<str.length();i++) {
			char x=str.charAt(i);
			if(Character.isUpperCase(x)) {
				newstr=newstr+Character.toLowerCase(x);
			}else {
				newstr=newstr+Character.toUpperCase(x);
			}
		}
		
		return newstr;
	}
	
	public static void main(String[] args) {
		String str="All the BEST";
		//str.toLowerCase();
		System.out.println(str);
		System.out.println(changeCase(str));
		

	}

}
