
public class CallingStatic2 {

	public static void main(String[] args) {
		CallingStatic cc=new CallingStatic();
		cc.m1();//non static in static of other class -->by object
		CallingStatic.m2();//static in static of other class-->class name.method_name
	}
	void m4() {
		CallingStatic cc2 =new CallingStatic();
		cc2.m3();//non static in nonstatic of other class -->by object
		//CallingStatic.m3();
	}
}
