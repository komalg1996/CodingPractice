package numbers;

import java.util.Scanner;

public class ArmstrongCheck {
	private static boolean isArmstrong(int num) {
		int temp,digits=0,last=0,sum=0;
		temp = num;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		while(temp>0) {
			last=temp%10;
			sum+=(Math.pow(last, digits));
			temp=temp/10;
		}
		if(num==sum)
			return true;
		else return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isArmstrong(num)) {
			System.out.println("Num is Armstrong");
		}
		else 
		{
			System.out.println("Num is NOT Armstrong");
		}
		
	}

	
}
