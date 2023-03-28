package collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		//list1
		List<Employee> empList = new ArrayList<Employee>();
		
		//employee objects
		Employee e1 = new Employee(1, "abc");
		Employee e2 = new Employee(2, "xyz");
		Employee e3 = new Employee(3, "pqr");
		Employee e4 = new Employee(4, "lmn");
		Employee e5 = new Employee(5, "opq");
		
		//adding employee objects in list
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
//		empList.add(e4);
//		empList.add(e5);
		
		//display empList
		for(Employee e:empList) {
			//System.out.println(e.id+" "+e.name);
			System.out.println(e.toString());
		}
		
		//list2
		List<Salary> salList = new ArrayList<Salary>();
		Salary s1 = new Salary(1, 20000.00);
		Salary s2 = new Salary(2, 30000.00);
		Salary s3 = new Salary(3, 10000.00);
		
		//adding salary objects in list
		salList.add(s1);
		salList.add(s2);
		salList.add(s3);
		
		//display salList
		for(Salary s : salList) {
			System.out.println(s.toString());
		}
		
		//merge list1 & 2 on Id
		List<Merge> merge=new ArrayList<Merge>();
		for(int i=0;i<empList.size();i++) {
			if(empList.get(i).id==salList.get(i).id) {
				merge.add(new Merge(empList.get(i).id, empList.get(i).name, salList.get(i).salary));
			}
		}
		System.out.println(merge);
		
	}

}
