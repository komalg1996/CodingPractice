package numbers;

public class Reverse {

	public static void main(String[] args) {
		int n = 543;
		int temp=n,sum=0;
		
		while(n>0) {
			
			sum=(sum*10)+(n%10);
			n=n/10;
		}
		System.out.println("Reverse is: "+sum);

	}

}
