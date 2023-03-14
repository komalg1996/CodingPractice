package numbers;

import java.util.Scanner;

public class FactTillRange {

	public static int fact(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter range to print factorial:");
		Scanner sc = new Scanner(System.in);
		int range= sc.nextInt();
		for(int i=1;i<=range;i++) {
			System.out.println(i+"-->"+fact(i));
		}
	}

}
