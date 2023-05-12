
public class Anagram {

	public static void main(String[] args) {
		String s1="maryy";
		String s2="army";
		int count=0;
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
					s2=s2.replaceFirst(""+s1.charAt(i), "");
						count++;
						//System.out.println(s2);
					}
				}
			}
			if(count==s1.length()) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not");
			}
		}
	}

}
