package ccpp;

public class CheckDecimal {

	public static void main(String[] args) {
		double d=6.25;
		int a=(int) d;
		System.out.println(a);
		if(d==a) {
			System.out.println("False: Not Decimal");
		}else {
			System.out.println("True:"+ d +" Is Decimal");
		}
	}
 
}



