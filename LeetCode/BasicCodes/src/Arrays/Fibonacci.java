package Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int num=50;
		int n1=0,n2=1,n3=0;
		
		for(int i=0;i<num;i++) {
			if(n1>50) {
				break;
			}
				
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
		
	}

}
