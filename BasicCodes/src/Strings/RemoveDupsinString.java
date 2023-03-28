package Strings;

public class RemoveDupsinString {
	 static String removeDups(String S) {
	        String str=new String();
	        int len=S.length();
	        for(int i=0;i<len;i++){
	            char c=S.charAt(i);
	            
	            if(str.indexOf(c)<0){
	                str=str+c;
	            }
	        }
	        return str;
	    }
	public static void main(String[] args) {
		String S="kokozz";
		String res=removeDups(S);
		System.out.println(res);
	}

}
