package Strings;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s= "Hello World koko";
		int a=lengthOfLastWord(s);
		System.out.println(a);
	}
	  public static int lengthOfLastWord(String s) {
		  int ans = 0;
	        String[] arr = s.split(" ");
	        
	        for (int i = 0; i < arr.length; i++) {
	            ans = arr[i].length();
	        }
	        return ans;
	    }
	        
	    
}
