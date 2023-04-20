//program check the given string is PALINDROME or not
package strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter string to find if its palindrome"); 
		Scanner in = new Scanner(System.in);
		String str1=in.nextLine();
		String str2="";
		char ch[]=str1.toCharArray();
		for(int i=0;i<=ch.length/2;i++) {
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}

		str2=new String(ch);
		if(str2.equals(str1))
			System.out.println("Palindrome");
		else
		System.out.println("Not palindrome");
		
	}

}


/*
 * String original,reverse="";
 * System.out.println("Enter string to find if its palindrome"); Scanner in =
 * new Scanner(System.in); original=in.nextLine(); for(int
 * i=original.length()-1;i>=0;i--) reverse=reverse+original.charAt(i);
 * if(original.equals(reverse)) System.out.println("Is palindrome"); else
 * System.out.println("not palindrome");
 */