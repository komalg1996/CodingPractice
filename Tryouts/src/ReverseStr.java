//1. Write a program to reverse a String :
//For example String s= “abcdef” expected Output ---  >  fedcba

public class ReverseStr {

	public static void main(String[] args) {
	//way 1
		String s= "abcdef";
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2+=s.charAt(i);
		
		}
		System.out.println(s2);
	
	//way 2
		String str="komal";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
