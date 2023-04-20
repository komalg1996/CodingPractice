package array;

public class PrimeNum {

	public static void main(String[] args) {
		int num=50;
		int count=0;
		for(int i=2;i<50;i++) {
			count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
				count=1;
				break;
				}
			}
		if(count==0) {
			System.out.println(i);
		}
		}
	}

}
