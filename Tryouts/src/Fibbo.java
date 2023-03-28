
public class Fibbo {

	public static void main(String[] args) {
		int num=10;
		int n1=0,n2=1,n3=0;
		while(n1<10) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
