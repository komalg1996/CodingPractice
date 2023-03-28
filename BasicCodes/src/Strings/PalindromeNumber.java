package Strings;

public class PalindromeNumber {

	public static void main(String[] args) {
		int r,temp;
		int sum=0;
		int num=4554;
		
		temp=num;	// hold num in temp
		while(num>0) {
			r=num%10;	// get remainder
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Is Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
