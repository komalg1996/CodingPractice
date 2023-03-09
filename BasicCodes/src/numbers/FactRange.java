package numbers;

import java.util.Scanner;

public class FactRange {

	public static void main(String[] args) {
		System.out.println("Enter range:");
		Scanner sc = new Scanner(System.in);
		int range=sc.nextInt();
		for(int i=1;i<=range;i++) {
			System.out.println(i+"->"+fact(i));
		}
		
	}

	 static int fact(int i) {
		 int fact=1;
		 while(i>0) {
			 fact=fact*i;
			 i--;
		 }

		 return fact;
	}

}
