//this is the one
public class Anagram3 {

	public static void main(String[] args) {
		String s1 = "mary";
		String s2 = "army";
		int count = 0;
		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					s2=s2.replace(""+s1.charAt(i),"");
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
