package strings;

public class StringPalindrome {
	private static boolean isPalindrome(String str) {
		String str1="";
		boolean flag=false;
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		if(str1.equals(str)) {
		flag= true;
		}
		return flag;
	}
	public static void main(String[] args) {
	        // Input string
	        String str = "geeks";
	 
	        // Convert the string to lowercase
	        str = str.toLowerCase();
	        boolean A = isPalindrome(str);
	        System.out.println(A);
	    

	}

	

}
