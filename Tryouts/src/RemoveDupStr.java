import java.util.LinkedHashSet;

//String s="abaacdc" -->abcd
public class RemoveDupStr {

	public static void main(String[] args) {// TODO Auto-generated method stub
//way 1
		String s = "abcdefabcdef";

		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (!(hs.contains(s.charAt(i)))) {
				hs.add(s.charAt(i));
			}
		}

		System.out.println(hs);

//way 2
//		String s="abaacdc";
//		String s2="";
//		for(int i=0;i<s.length();i++) {
//			Boolean found=false;
//			for(int j=0;j<s2.length();j++) {
//				if(s.charAt(i)==s2.charAt(j)) {
//					found=true;
//					break;
//				}
//			}
//			if(found==false) {
//				s2=s2+s.charAt(i);
//			}
//		}
//		System.out.println(s2);
//		
	}

}
