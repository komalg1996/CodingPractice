//find number of digits in given number
package numbers;

public class CountDigitsInNum {
	
	public static int findDigits(int num) {
		int temp=num;
		int count=0;
		//System.out.println(temp);
		while(temp!=0) {
			temp=temp/10;
			count++;
		}
		//System.out.println(count);
		return count;
		
	}
	public static void main(String[] args) {
		int num=5243;
		int digits=findDigits(num);
		System.out.println("Number of digits are: "+digits);
	}

}
