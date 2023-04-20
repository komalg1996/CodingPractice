package strings;

public class ReverseEachWord {

	
	public static String reverseWords(String s) {
		String[]word=s.split("\\s");
		String newstr="";
		for(String w : word) {
		StringBuilder sb = new StringBuilder(w);
		sb.reverse();
		newstr+=sb.toString()+" ";
		}
		return newstr;
		
	}
	
	public static void main(String[] args) {
		String s = "we like riding";
		System.out.println(reverseWords(s));
	}

}
