package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter string to reverse:");
		Scanner sc = new Scanner (System.in);
		String str= sc.nextLine();
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2+=str.charAt(i);
		}
		System.out.println("Original:"+str);
		System.out.println("Reverse:"+str2);

		
//		char [] ch = str.toCharArray();
//		for(int i=0;i<=ch.length/2;i++) {
//			char t=ch[i];
//			ch[i]=ch[ch.length-1-i];
//			ch[ch.length-1-i]=t;
//		}
//		str2=new String(ch);
//		System.out.println("reverse:"+str2);

	}

}
