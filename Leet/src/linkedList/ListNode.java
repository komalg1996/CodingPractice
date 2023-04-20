//876. Middle of the Linked List


package linkedList;

import java.util.Stack;

import linkedList.SLL.Node;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {

	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	ListNode head;

	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}
	
}

class Solution1 {
    public ListNode middleNode(ListNode head) {
    	if(head == null)
			return null;
		if(head.next==null)
			System.out.println("onlu 1 element in list"+head.val);
		ListNode temp=head;
		int counter=0;
		while(temp!=null) {
			temp=temp.next;
		counter++;
		}
		temp=head;
		for(int i=0;i<counter/2;i++) {
			temp=temp.next;
		}
			//System.out.println("Middle Element is-->"+temp.val);
			return temp;
    }
}   
    class Solution {
        public ListNode reverseList(ListNode head) {
        	Stack<ListNode> stack = new Stack<ListNode>();
        	ListNode temp=head;
        	while(temp.next!=null) {
        		stack.push(temp);
        		temp=temp.next;
        	}
        	head=temp;
    		while(!stack.isEmpty()) {
    			temp.next=stack.pop();
    			temp=temp.next;
    			//System.out.println(stack.pop().data+" ");
    		}
    		temp.next=null;
    		System.out.println();
			return head;
            
        }
}