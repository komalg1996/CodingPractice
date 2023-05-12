package oops;

public class InheritanceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//single level:In this one class i.e., the derived class inherits properties from its parental class.
	class A{
		
	}
	class B extends A{
		
	}
//Multilevel:This one class is derived from another class which is also derived from another class
	class A1{
		
	}
	class B1 extends A1{
		
	}
	class C1 extends B1{
		
	}
//Hierarchical:In this one parental class has two or more derived classes or we can say that two or more child classes have one parental class.
	class A2{
		
	}
	class B2 extends A2{
		
	}
	class C2 extends A2{
		
	}
}
