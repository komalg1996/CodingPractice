package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TryMap {
	
	
	public static void main(String[] args) {
		HashMap<Student, String> map = new HashMap<Student, String>();
		map.put(new Student(1, "Komu", 78), "DAC");
		map.put(new Student(2, "Pratik", 90), "BTec");
		map.put(new Student(3, "Prachi", 85), "MCA");

		System.out.println(map);
		
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Student,String > m=(Entry) itr.next();
			System.out.println(m.getKey().rollNo+"..."+m.getKey().name);
		}
		
		
	}

}

class Student{
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}