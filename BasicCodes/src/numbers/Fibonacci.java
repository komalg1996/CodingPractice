//fibonacci without recursion
package numbers;

public class Fibonacci {

	public static void main(String[] args) {
//		int n1 = 0, n2 = 1, n3, i, count = 10;
//		System.out.print(n1 + " " + n2); // printing 0 and 1
//
//		for (i = 2; i < count; i++) { // loop starts from 2 because 0 and 1 are already printed
//			n3 = n1 + n2;
//			System.out.print(" " + n3);
//			n1 = n2;
//			n2 = n3;
//		}
	
	//-------------------------
		int range= 50;
		int n1=0,n2=1,n3=0;
			while(n1<range) {
				System.out.print(n1+" ");
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
		}
		
		
	}

