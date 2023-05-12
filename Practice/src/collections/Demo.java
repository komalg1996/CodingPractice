package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		List<Employee1> empList=new ArrayList<Employee1>();
		
		empList.add(new Employee1(1, "Komal"));
		empList.add(new Employee1(2, "Pratik"));
		empList.add(new Employee1(3, "Prachi"));
		empList.add(new Employee1(4, "Shweta"));

		empList.add(new Employee1(7, "Prachi"));
		empList.add(new Employee1(9, "Prachi"));

		empList.add(new Employee1(8, "Shweta"));
		System.out.println(empList);
		
		List<Employee1> salList = new ArrayList<Employee1>();
		
		salList.add(new Employee1(2, 10000));
		salList.add(new Employee1(1, 13000));
		salList.add(new Employee1(5, 20000));
		
// to merge 2 lists on id
		
		List<Employee1> mergeList= new ArrayList<Employee1>();
		for(int i=0;i<empList.size();i++) {
			for(int j=0;j<salList.size();j++) {
			
				
				
			if(empList.get(i).id==salList.get(j).id) {
				empList.get(i).setSalary(salList.get(j).getSalary());
				mergeList.add(empList.get(i));
			}
			}
		}
		System.out.println("---->"+mergeList);
		System.out.println("---->"+empList.get(3).salary);
		
		Set<String> s = new HashSet<String>();
		
		for(int i=0;i<empList.size();i++) {
			for(int j=i+1;j<empList.size();j++) {
				if(empList.get(i).name==empList.get(j).name) {
					//System.out.println(empList.get(i).name);
					s.add(empList.get(i).name);
				}
			}
		}
		
		Collections.sort(empList);
		System.out.println(empList);
		//System.out.println(s);
		
		Collections.sort(empList,new MyComparator());
		System.out.println(empList);
	}

}
 class Employee1 implements Comparable{
	 int id;
	 String name;
	 double salary;
	 
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public Employee1(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	@Override
	public int compareTo(Object o) {
		Employee1 e1=(Employee1)o;
		if(this.id>e1.id)
		return -1;
		else if(this.id<e1.id)
			return  1;
		else
			return 0;
	}

	


	 
	
	
	 
	 
 }
 
 
 class MyComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return  o1.name.compareTo(o2.name);
		
		
	}

	
 }