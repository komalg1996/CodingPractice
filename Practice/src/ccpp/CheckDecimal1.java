package ccpp;

public class CheckDecimal1 {

	public static void main(String[] args) {
		System.out.println(isDecimal(6.25));

	}

	private static boolean isDecimal(double d) {
		
		return d%1!=0;
	}

}
