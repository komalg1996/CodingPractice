
public class Anagram2 {

	public static void main(String[] args) {
		String s1="marey";
		String s2="army";
		int count=0;
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						s2=s2.replace(""+s1.charAt(i), "");
						count++;
					}
				}
			}
			if(count==s1.length()) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
		}

	}

}
