
public class Override {


	public static void main(String[] args) {
		C c= new C();
		c.m1();
//		((B)c).m1();
//		((A)((B)c)).m1(); 
	}

}
class A{
	void m1() {
		System.out.println("Print A");
	}
}
class B{
	void m1() {
		System.out.println("Print B");
	}
}
class C{
	void m1() {
		System.out.println("Print C");
	}
}