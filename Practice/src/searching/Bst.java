package searching;

public class Bst {
	
	//create Node class
	class Node{
		private int data;
		private Node left;
		private Node right;
		
		
		public Node(int data) {
			this.data=data;
			left=right=null;
		}
	}
	
	public Node root;
	
	//inserting data in binary tree
	public boolean insertData(int data) {
		Node node=new Node(data);
//		if(node==null) {
//			return false;
//		}
		
		if(root==null) {
			root=node;
			return true;
		}
		
		Node temp=root;
		while(true) {
			if(temp.data==data) {
				return false;
			}
			if(data<temp.data) {
				if(temp.left==null) {
					temp.left=node;
				}
				temp=temp.left;
			}
			if(data>temp.data) {
				if(temp.right==null) {
					temp.right=node;
				}
				temp=temp.right;
			}
			
		}
	}
	//-------------Recursion-------------//
	//preOrder
	public void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	//inOrder
	public void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	//postOrder
	public void postOrder(Node root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void main(String[] args) {
		Bst b=new Bst();
		b.insertData(88);
		b.insertData(26);
		b.insertData(53);
		b.insertData(20);
		b.insertData(11);
		b.insertData(92);
		
		b.preOrder(b.root);
		System.out.println();
		b.inOrder(b.root);
		System.out.println();
		b.postOrder(b.root);

	}

}
