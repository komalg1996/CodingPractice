package collections;
//Arraylist
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyEmpList implements Comparable<MyEmpList> {

	public static void main(String[] args) {
		List<MyEmpList> emp = new ArrayList<MyEmpList>();
		emp.add(new MyEmpList(1, "Komal", "k@g.com", 70000));
		emp.add(new MyEmpList(5, "Pratik", "p@s.com", 80000));
		emp.add(new MyEmpList(2, "Prachi", "p@g.com", 90000));
		emp.add(new MyEmpList(8, "Akash", "a@g.com", 50000));
		emp.add(new MyEmpList(4, "Suraj", "s@g.com", 60000));

		// System.out.println(emp);
//		for (MyEmpList e : emp) {
//			System.out.println(e);
//		}

		//---> sort MyEmpList on id

		Collections.sort(emp);
		for (MyEmpList e : emp) {
			System.out.println(e);
		}
		System.out.println();
		Collections.sort(emp,new Mcomparable());
		for (MyEmpList e : emp) {
			System.out.println(e);
		}
	}

	int id;
	String name;
	String email;
	double salary;

	public MyEmpList() {

	}

	public MyEmpList(int id, String name, String email, double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "MyEmpList [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(MyEmpList o) {
		if (this.id > o.id)
			return 1;
		else if (this.id < o.id)
			return -1;
		else
			return 0;
		
		
	}

}

class Mcomparable implements Comparator<MyEmpList>{

	@Override
	public int compare(MyEmpList o1, MyEmpList o2) {
		return o1.salary>o2.salary?1:(o1.salary<o2.salary)?-1:0;
		 
	}
	
}
