//. Write a Java program to remove duplicate elements from an array.     
package codeArray;

public class RemoveDuplicate {

	private static void removeDuplicate(String str) {
		
		String str2=new String();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(str2.indexOf(c)<0) {		///***
				str2=str2+c;
			}
		}
		System.out.println(str2);
		
	}
	public static void main(String[] args) {
		String str="abcaadbc";
		removeDuplicate(str);
	}

	

}
