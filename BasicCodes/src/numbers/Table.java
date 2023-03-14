package numbers;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		System.out.println("Enter Num:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j =1;j<=10;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
		}
		System.out.println();
	}

}
