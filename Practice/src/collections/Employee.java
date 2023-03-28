package collections;

import java.util.Objects;

public class Employee {
	int id;
	String name;

	public Employee() {

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	

}

class Salary {
	int id;
	double salary;

	Salary() {

	}

	public Salary(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	public String toString() {
		return "Salary [id=" + id + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
	class Merge{
		int id;
		String name;
		double salary;
		 
		public Merge(int id, String name, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Merge [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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
		
		
		
		
	}


