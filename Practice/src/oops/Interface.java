package oops;

interface Drawable {
	void draw();
}

class Triangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawing triangle");
	}

}

class Square implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}

}

public class Interface {

	public static void main(String[] args) {
		Drawable d=new Triangle();
		d.draw();
		Drawable d1=new Square();
		d1.draw();

	}

}
