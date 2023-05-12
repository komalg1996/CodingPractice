
public class Palindrome {

	public static void main(String[] args) {
//		int i=121;
//		int temp=0,mod=0,sum=0;
//		temp=i;
//		while(i>0) {
//			mod=i%10;
//			sum=(sum*10)+mod;
//			i=i/10;
//		}
//		if(sum==temp) {
//			System.out.println("is pali");
//		}else {
//			System.out.println("Not pali");
//		}
		
		//for string pali
		
		String s="aba";
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		if(s2.equals(s)) {
		System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is NOT palindrome");
		}
	}

}
