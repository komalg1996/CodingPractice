import java.util.Scanner;

public class Excep {
	public static void main(String[] args) throws AgeException {
		System.out.println("Enter Age:");
		Scanner sc =new Scanner(System.in);
		int age= sc.nextInt();
		if(age>18)
			System.out.println("OK");
		else {
			throw new AgeException("age below 18");
			//System.out.println();
		}
	}
}
	class AgeException extends Exception{
	AgeException (String msg){
		super(msg);
	}
}