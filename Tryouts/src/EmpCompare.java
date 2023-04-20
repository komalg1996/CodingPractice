import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpCompare {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(5, "abc"));
		emp.add(new Employee(2, "asd"));

		emp.add(new Employee(7, "zxc"));

		emp.add(new Employee(1, "qwe"));

//		Collections.sort(emp);
//		System.out.println(emp);
		
		ArrayList<Employee> emp2 =new ArrayList<Employee>(emp);
		
		Collections.sort(emp2,new nameComparator());
		System.out.println(emp2);
		
	}

}

class nameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
	
}
