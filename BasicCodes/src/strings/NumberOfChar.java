package strings;

public class NumberOfChar {

	public static void main(String[] args) {
		int count = 0;
		String str = "Komal Ghorpade";
//		char ch[]=str.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]>=65 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122 || ch[i]>=48 && ch[i]<=57 && 
//					ch[i]!=32 && ch[i]!=',' && ch[i]!='.')
//			count++;
//
//		}
//		System.out.println("Number of char = "+ count);
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
		
	}

}
