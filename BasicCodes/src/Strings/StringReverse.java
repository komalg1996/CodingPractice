package Strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length/2; i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
	//str=new String(ch);
	System.out.println("Reverse Str is:"+ new String(ch));
	}

}
