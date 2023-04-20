package collections;

import java.util.LinkedList;
import java.util.List;

//linkedList
public class MyLinkedList {

	public static void main(String[] args) {
		List<MyEmpList> ll=new LinkedList<MyEmpList>();
		ll.add(new MyEmpList(1, "Komal", "k@g.com", 70000));
		ll.add(new MyEmpList(1, "Komal", "k@g.com", 70000));
		ll.add(new MyEmpList(5, "Pratik", "p@s.com", 80000));
		ll.add(new MyEmpList(2, "Prachi", "p@g.com", 90000));
		ll.add(new MyEmpList(8, "Akash", "a@g.com", 50000));
		
		for(MyEmpList f: ll) {
			System.out.println(f);
		}
		
	}

}
