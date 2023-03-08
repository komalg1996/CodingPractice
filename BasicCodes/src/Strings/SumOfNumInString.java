package Strings;

public class SumOfNumInString {

	public static void main(String[] args) {
		int j=0;
		String str = "ANHC12NS89";
		char[] ch = str.toCharArray();
		for(int i =0;i<str.length();i++) {
			if(ch[i]>=48 && ch[i]<=57)
			j+=ch[i]-48;	
		}
		System.out.println(j);
	}

}
