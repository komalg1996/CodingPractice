
public abstract class Abst { //may or maynot have abstract method
	abstract int add();
	
	final int sub() {
		return 0;
		
	}
	int sub(int x,float y) {
		return 0;
		
	}
}
class MyAbst extends Abst {

	@Override
	int add() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		//Abst s = new Abst(); ----can’t create object for abstract class
		Abst a = new MyAbst(); //----can create reference of abstract class n give to child class object

	}
}