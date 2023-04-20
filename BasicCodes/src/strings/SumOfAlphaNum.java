//Write a program to find the sum of numbers in an ALPHA NUMERIC STRING?
package strings;

public class SumOfAlphaNum {

	public static int findSum(String st) {
		String temp="0";
		int sum=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(Character.isDigit(ch))
			{
				temp+=ch;
				//System.out.println(temp);
			}
			
			else {
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		return sum+Integer.parseInt(temp);
		
	}
	public static void main(String[] args) {
		String st="12kom21";
		System.out.println(findSum(st));

	}

}
