
public class ReverseCase {

	public static String changeCase(String s1) {
		String newstr="";
		for(int i=0;i<s1.length();i++) {
			if(Character.isUpperCase(s1.charAt(i))) {
				newstr+=Character.toLowerCase(s1.charAt(i));
			}else {
				newstr+=Character.toUpperCase(s1.charAt(i));
			}
		}
		
		
		return newstr;
	}
	
	public static void main(String[] args) {
		String s1="I Am PlaceD In DassauT SystemS";
		System.out.println(changeCase(s1));
	}

}
