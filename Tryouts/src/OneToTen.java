
public class OneToTen {

	static void printNums(int i) {
		if(i>0) {
			printNums(i-1);
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		printNums(10);

	}

}
