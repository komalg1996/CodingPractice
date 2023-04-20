//1221. Split a String in Balanced Strings


package Strings;

public class SplitBalance {

	 public static int balancedStringSplit(String s) {
		 int count=0;
		 int flag=0;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)=='R')
				 count++;
			 if(s.charAt(i)=='L')
				 count--;
			 if(count==0)
				 flag++;
				 
		 }
		return flag;
	        
	    }
	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));
	}

}
