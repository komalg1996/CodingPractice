package oops;


class Student{
	//private data members
	private int id;
	private String name;
	
	//public getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(101);
		s1.setName("komal");
		System.out.println(s1.getId()+" "+s1.getName());
	}

}
