//Write a Program for number of characters in each WORD and count them
package Strings;

import java.util.Scanner;

public class CharInWords {

	public static void main(String[] args) {
		 {	
		 	 Scanner	sc=new	Scanner(System.in);	
		 	 System.out.println("enter	the	string");	
		 	 String	str=sc.nextLine();
		 	 String []str1= str.split(" ");
		 	 for(int i=0;i<str1.length;i++) {
		 		 System.out.println(str1[i]+"->"+str1[i].length());
		 	 }
		 	 
		 	 
		 	 
		 	 
//		 	 char[]ch=str.toCharArray();
//		 	 for(int i=0;i<ch.length;i++) {
//		 		 String s="";
//		 		 while(i<ch.length&& ch[i]!=' ') {
//		 			 s=s+ch[i];
//		 			 i++;
//		 		 }
//		 		 if(s.length()>0)
//		 			 System.out.println(s+"->"+s.length());
//		 	 }
		 	 
		 }		

			

	}

}
