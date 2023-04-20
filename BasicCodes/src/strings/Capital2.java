package strings;

public class Capital2 {

	private static String upperlower(String s1) {
		String s="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(Character.isUpperCase(c)) {
				s=s+Character.toLowerCase(c);	
			}else {
				s=s+Character.toUpperCase(c);
			}
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		String s1="I LoVe mY counTry";
		System.out.println(upperlower(s1));

	}


}
