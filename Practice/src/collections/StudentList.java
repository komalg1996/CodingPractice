package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList implements Comparable{

	int rollno;
	String name;
	int marks;
	
	
	
	public StudentList(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	

	public StudentList(int rollno, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
	}

	

	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
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
		return "StudentList [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	


	public static void main(String[] args) {
		List<StudentList> l1=new ArrayList<StudentList>();
		l1.add(new StudentList(1, "komal"));
		l1.add(new StudentList(2, "pratik"));
		l1.add(new StudentList(3, "kartik"));
		l1.add(new StudentList(4, "prachi"));
		
		//System.out.println(l1);

		
		List<StudentList> l2=new ArrayList<StudentList>();
		l2.add(new StudentList(4, 80));
		l2.add(new StudentList(2, 75));
		l2.add(new StudentList(1, 90));

		//System.out.println(l2);
		
		List<StudentList> l3=new ArrayList<StudentList>();
		for(int i=0;i<l1.size();i++) {
			for(int j=0;j<l2.size();j++) {
				
				if(l1.get(i).getRollno()==l2.get(j).rollno) {
					l1.get(i).setMarks(l2.get(j).getMarks());
					l3.add(l1.get(i));
				}
				
			}
		}
		//System.out.println(l3);
//		Collections.sort(l3);
//		System.out.println(l3);
//		System.out.println(l3.get(0).name);
//		
		Collections.sort(l3,new MyComparator2());
		System.out.println(l3);
	}



	@Override
	public int compareTo(Object o) {
		StudentList s1= (StudentList) o;
		if(this.marks>s1.marks)
		return -1;
		else if(this.marks<s1.marks)
			return 1;
		else
		return 0;
	}


}

class MyComparator2 implements Comparator<StudentList>{

	@Override
	public int compare(StudentList o1, StudentList o2) {
		
		return o1.name.compareTo(o2.name);
	}

	
	
}
