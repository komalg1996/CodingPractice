package numbers;

public class WithoutLoop {

	public static void main(String[] args) {

	    {
	        printNos(10);
	    }

	}

	private static void printNos(int i) {
		if(i>0) {
			
			printNos(i-1);
			System.out.println(i+" ");
		}
		return;
	}

}
