
public class TryException {
	
	private static void checkAge(int age) throws AgeException{
		if(age>18) {
			System.out.println("Valid");
		}else {
			throw new AgeException("Invalid");
		}
	}
	
	
	
	public static void main(String[] args) throws AgeException{
		checkAge(15);
		
	}

	
}

class AgeException extends Exception{
	public AgeException(String msg) {
		super(msg);
	}
	
}