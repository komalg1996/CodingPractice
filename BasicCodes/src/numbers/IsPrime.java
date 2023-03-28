package numbers;

public class IsPrime {

	public static void main(String[] args) {
		int num=7;
		int count = 0;
		for(int i=2;i<num;i++) {
			if((num%i)==0) {
				count = 1;
			}
		}
		if(count==1) {
			System.out.println("Not prime");
		}else {
			System.out.println("Prime");
		}
	}

}
