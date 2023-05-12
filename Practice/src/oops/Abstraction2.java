package oops;

abstract class Animal1{
	public abstract void sound();
}
 class Lion extends Animal1{

	@Override
	public void sound() {
		System.out.println("roring");
		
	}
	
}

public class Abstraction2 {
	
	public static void main(String[] args) {
		Animal1 a = new Lion();
		a.sound();

	}

	
	
}
