package numbers;

public class SwapingWays {

	public static void main(String[] args) {
		int a=50,b=30;
		System.out.println("Before swapping: a="+a+" b="+b);
		
		//1st way by #rd variable
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("After swapping: a="+a+" b="+b);

		//2nd way +&-
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swapping: a="+a+" b="+b);
		
		//3rd way *&/
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("After swapping: a="+a+" b="+b);

		//4th way bitwise
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println("After swapping: a="+a+" b="+b);
		
		//5th way
		b=a+b-(a=b);
		System.out.println("After swapping: a="+a+" b="+b);

	}

}
