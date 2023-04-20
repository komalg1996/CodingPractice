package oops;

class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class Puppy extends Dog{
	void play() {
		System.out.println("playing");
	}
}

class Cat extends Animal{
	void fight() {
		System.out.println("fighting");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.eat();
		p.bark();
		p.play();
		
		Cat c=new Cat();
		c.eat();
		c.fight();

		Animal a=new Dog();
		
	}

}
