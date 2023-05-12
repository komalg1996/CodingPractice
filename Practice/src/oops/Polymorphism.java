package oops;

public class Polymorphism {

	public static void main(String[] args) {
		Bird b = new pigeon();
		b.sound();
	}

}

class Bird{
	public void sound(){
		System.out.println("Birds sound");
	}
}
class pigeon extends Bird{
	public void sound() {
		System.out.println("pigeon sound");
	}
}
class sparrow extends Bird{
	public void sound() {
		System.out.println("sparrow sound");
	}
}