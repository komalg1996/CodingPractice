
public class CallingStatic {

	void m1() {
		m3();//same class nonstatic to nonstatic -->direct call
		m2();
	}
	
	static void m2() {
		
		
	}
	
	void m3() {
		
		
	}
	public static void main(String[] args) {
		CallingStatic c =new CallingStatic();
		c.m1();//same class non static to static-->by object
		m2();//same class static to static direct call
		

	}

}
