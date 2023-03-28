package numbers;

public class facto {
	public static void main(String[] args) {
		int num=5;
		int f = fact(num);
		System.out.println(f);
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}

//	private static int fact(int num) {
//		if(num==1) {
//			return 1;
//		}else {
//			return num*fact(num-1);
//		}
//		
//	}
//}