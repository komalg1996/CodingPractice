package numbers;

public class Palindrome {

	public static void main(String[] args) {
		int num=1234;
		int rem=0;
		int sum=0;
		int temp=num;
		//string
		Integer n1=1211;
		String s= n1.toString();
		System.out.println(s);
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse += s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println("IsPalindrome");
		}else {
			System.out.println("IsNotPalindrome");
		}
		
		
		
		//number
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
//		if(temp==sum) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not Palindrome");
//
//		}
		System.out.println("reverse:"+sum);
	}

}
