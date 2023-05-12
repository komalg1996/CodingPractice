//2. Write a program to add the integers available in the string:
//For example : String s = “10value8with20value”; then the sum should be10+8+20 = 38

public class AddNumsInString {

	public static void main(String[] args) {
		String s = "10value8with20value";
		String s2="";
		int digit=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
			//	s2+=s.charAt(i);
				s2=s.substring(i, i+1);
				digit+=Integer.parseInt(s2);
			}
			
		}
		System.out.println(digit);
//		int num=Integer.parseInt(s2);
//		System.out.println(num);
//		
//	
//		int mod=0,sum=0;
//		int temp=num;
//		while(num>0) {
//			mod=num%10;
//			sum=sum+mod;
//			num=num/10;
//		}
//		System.out.println(sum);//11

	}

}
