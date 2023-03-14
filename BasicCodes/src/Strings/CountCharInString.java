//Write a program to COUNT number of CHARACTERS in a String?	
package Strings;

import java.util.Scanner;

public class CountCharInString {

	public static void main(String[] args) {
		System.out.println("Enter string to count chars:");
		Scanner sc = new Scanner (System.in);
		String str= sc.nextLine();
		int counter=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
				counter++;
		}
		System.out.println(counter);
	}

}
