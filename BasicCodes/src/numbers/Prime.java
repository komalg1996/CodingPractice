package numbers;

public class Prime {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for(int i=2;i<10;i++) {
			count=0;
			for(int j=2;j<i;j++) {
				if((i%j)==0) {
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
//			sum=sum+i;
//			System.out.println(sum);
		}
		
		

	}

}
