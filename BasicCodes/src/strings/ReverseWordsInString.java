package strings;

import java.util.Arrays;

public class ReverseWordsInString {

	static String reverseWords(String S)
    {
		String str2="";
		String[] a=S.split("\\.");
		int len = a.length;
		for(int i=len-1;i>=0;i--)
		{
			str2+=a[i]+".";
		}
        return str2;
    }
	public static void main(String[] args) {
		String S = "i.like.this.program.very.much";
		String newstr=reverseWords(S);
		System.out.println(newstr);
	}

}
