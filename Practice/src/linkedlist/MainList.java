package linkedlist;

public class MainList {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);

		l.display();
		
//		l.removeDuplicates();
		
//		l.reverseWithoutStack();
//        l.display();
//        l.deleteByValue(30);
//        l.display();
		
		LinkedList l2 = new LinkedList();
		l2.insert(10);
		l2.insert(35);
		l2.insert(80);
		l2.insert(90);
		
		l2.display();
		
		LinkedList ans=LinkedList.merge(l, l2);
		ans.display();
	}

}
