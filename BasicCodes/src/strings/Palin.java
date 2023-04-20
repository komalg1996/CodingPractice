package strings;

public class Palin {

	public static void main(String[] args) {
		String str = "sdds";
		String str2 = "";
		for (int i = str.length()-1 ; i >= 0; i--) {
			str2=str2+str.charAt(i);
		}
		if (str.equals(str2))
			System.out.println("palindrome");
		else
			System.out.println("not");
	}

}
