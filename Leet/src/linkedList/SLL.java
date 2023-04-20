package linkedList;

import java.util.Stack;

public class SLL {
	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}
	
	private static Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	private void insertFirst(int data) {
		Node newNode =new Node(data);
		if(newNode==null) 
			return ;
		if(head == null) {
			head = newNode;
			return;	
		}
		newNode.next=head;
		head=newNode;
	}
	
	private void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("Empty list");
		}
		while(temp!=null) {
			System.out.print(temp.data+"--> ");
			temp=temp.next;
		}
	}
	
	private Node reverse() {
		Stack<Node> s = new Stack();
		Node temp =head;
		while(temp.next!=null) {
    		s.push(temp);
    		temp=temp.next;
    	}
    	head=temp;
		while(!s.isEmpty()) {
			temp.next=s.pop();
			temp=temp.next;
			System.out.print(temp.data+"<<");
		}
		
		temp.next=null;
		return head;
}
	public Node reverseList(Node head) {
		if(head==null && head.next==null) {
			return head;
		}
		Node curr=head;
		Node previous=head;
		
		while (curr!=null) {
			Node temp = curr.next;
            curr.next = previous;
            previous = curr;
            curr = temp;
		}
		System.out.println(previous.data);
		return head; 
	}
	 
	private void findMiddle() {
		if(head == null)
			return;
		if(head.next==null)
			System.out.println("only 1 element in list"+head.data);
		Node temp=head;
		int counter=0;
		while(temp!=null) {
			temp=temp.next;
		counter++;
		}
		temp=head;
		for(int i=0;i<counter/2;i++) {
			temp=temp.next;
		}
		System.out.println("Middle Element is-->"+temp.data);

	}
	
	
	public static void main(String[] args) {
		SLL s = new SLL();
		s.insertFirst(20);
		s.insertFirst(10);
		s.insertFirst(50);
		s.insertFirst(1);
		s.insertFirst(5);
		//s.display();
		//s.findMiddle();
		head = s.reverseList(head);
		}

	

	

	

	

}
