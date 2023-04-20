package linkedlist;

import java.util.Stack;

public class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	// insert into linkedList at end
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}
		// if head is not=null
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

//display values in linkedLidt	
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}
		System.out.println();
	}

//insert at position
	public boolean insertAt(int data, int position) {
		if (position <= 0 || (head == null && position > 1)) {
			return false;
		}
		Node newnode = new Node(data);
		if (position == 1) {
			newnode.setNext(head);
			head = newnode;
			return true;
		}
		Node pre = head;
		for (int i = 1; i < position - 1; i++) {
			pre = pre.getNext();
			if (pre.getNext() == null) {
				return false;
			}
		}
		newnode.setNext(pre.getNext());
		pre.setNext(newnode);

		return true;
	}

//reverse list using stack
	public void reverse() {
		Stack<Node> s = new Stack<Node>();
		Node temp = head;
		while (temp != null) {
			s.push(temp);
			temp = temp.getNext();
		}
		while (!s.isEmpty()) {
			System.out.print(s.pop().getData() + "->");
		}
		System.out.println();

	}

//reverse list without using stack
	public void reverseWithoutStack() {
		if (head == null || head.getNext() == null) {
			return;
		}

		Node n1 = head, n2 = head.getNext();
		Node n3;
		while (n2 != null) {
			n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}

		head.setNext(null);
		head = n1;
	}

	// delete by value
	public boolean deleteByValue(int data) {
		if (head == null) {
			return false;

		}
		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}

		Node prev = head, del = head;

		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

//remove duplicate from list and return list
	public void removeDuplicates() {

		Node node = head;
		while (node.getNext() != null) {
			if (node.getData() == node.getNext().getData()) {
				node.setNext(node.getNext().getNext());
			} else {
				node = node.getNext();
			}
		}
		// to display
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}

	}

//merge 2 linkedList
	public static LinkedList merge(LinkedList L1, LinkedList L2) {
		// 2 variables pointing to head of 2 lists
		Node f = L1.head;
		Node s = L2.head;

		// create ans list to return
		LinkedList ans = new LinkedList();

		// traverse list till null
		while (f != null && s != null) {
			if (f.getData() < s.getData()) {
				ans.insert(f.getData());
				f = f.getNext();
			} else {
				ans.insert(s.getData());
				s = s.getNext();
			}
		}

		while (f != null) {
			ans.insert(f.getData());
			f = f.getNext();
		}
		while (s != null) {
			ans.insert(s.getData());
			s = s.getNext();
		}
		return ans;

	}

//end	
}
