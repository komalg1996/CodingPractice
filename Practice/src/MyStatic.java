
public class MyStatic {

	private MyStatic() {
		
	}
	
	public static void main(String[] args) {
		MyStatic a = new MyStatic();
		MyStatic b = new MyStatic();

		a.m1();
		b.m1();
		// System.out.println(a.hashCode());

	}

	void m1() {
		System.out.println(this.hashCode());
		m2(); // current obj
		//this.m2();
	}

	void m2() {
		System.out.println(this.hashCode());

	}
}
	class A{
		A p=new A();
		//MyStatic p1 =new MyStatic();		//constructor can b private
	}
