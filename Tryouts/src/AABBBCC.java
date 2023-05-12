
public class AABBBCC {

	public static void main(String[] args) {
		String s= "a2b3c2";
		String s2="";
		for(int i=0;i<s.length();i=i+2) {
			int x= Integer.parseInt(""+s.charAt(i+1));
		for(int j=0;j<x;j++) {
			System.out.print(s.charAt(i));
		}
			
		}

	}

}
