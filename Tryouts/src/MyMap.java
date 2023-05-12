import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		Student s1 = new Student(1, "komal", "DAC", 68);
		Student s2 = new Student(2, "shweta", "BAMS", 90);
		Student s3 = new Student(3, "prachi", "BSC", 80);
		Student s4 = new Student(4, "sakshi", "JAVA", 78);
		Student s5 = new Student(5, "dakshi", "DAC", 70);

		map.put(101, s1);
		map.put(102, s2);
		map.put(103, s3);
		map.put(104, s4);
		map.put(105, s5);

		// ways to iterate and print map
		// 1.syso
		System.out.println(map);

		Set s=map.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Student> m = (Entry<Integer, Student>) itr.next();
			System.out.println(m.getKey()+" "+m.getValue().name+" "+m.getValue().marks);
			
		}
		
		
		
		
		//way 2
//		System.out.println("-----using iterator-------");
//		Set s=map.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext()) {
//			Map.Entry<Integer, Student> m = (Entry<Integer, Student>) itr.next();
//			if(m.getValue().getMarks()>80) {
//			System.out.println(m.getKey()+" "+m.getValue());
//			}
//		}
//		
//		//way 3
//		System.out.println("-----using lambda-----");
//		map.forEach((k,v)->System.out.println(k+" "+v));
		
		

	}

}

//Student class
class Student {
	int id;
	String name;
	String course;
	int marks;

	public Student() {

	}

	public Student(int id, String name, String course, int marks) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}

}