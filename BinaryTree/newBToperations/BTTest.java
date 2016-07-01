package tree;

import java.util.ArrayList;

public class BT {
	Node root;
	int count;
	public BT(){
		root = null;
		count = 0;
	}
	ArrayList<Node> arr = new ArrayList<Node>();
	
	
	public void insert( int d){
		Node n = new Node(d);
		if(root == null){
			root = n;
			count++;
			arr.add(root);
			return;
		}
		else {
			Node temp = root;
			arr.add(n);
			for(int i = 0; i < arr.size(); i++) {
				temp = arr.get(i);
				if(temp.getLeft() == null){
					temp.left = n;
					count++;
					return;
				}
				if(temp.getRight() == null){
					temp.right = n;
					count++;
					return;
				}
					
			}
			
		}
	}
	
	public void height(){
		int h =height(root);
		System.out.println(h);
	}
	
	public int height(Node n){
		if(n == null)
			return 0;
		else{
			int lht = height(n.left);
			int rht = height(n.right);
			if(lht > rht)
				return (lht + 1);
			else
				return(rht + 1);
		}
	}
	int getsize(){
		return count;
	}
	
	public void search(int x){
		Node temp = root;
		int flag = 0;
		for(int i = 0; i < arr.size(); i++){
			temp = arr.get(i);
			if(temp.data == x){
				flag = 1;
				System.out.println("element found "+temp.data );
				break;
			}
			
		}
		if(flag == 0)
			System.out.println("element not found " );
	}
	public void preorder(){
		preorder(root);
	}
	public void preorder(Node n){
		if(n != null){
			System.out.print(n.data + " ");
			preorder(n.left);
			preorder(n.right);
			
		}
	}
	
	public void inorder(){
		inorder(root);
	}
	public void inorder(Node n){
		if(n != null){
			inorder(n.left);
			System.out.print(n.data + " ");
			inorder(n.right);
		}
	}

	public void postorder(){
		postorder(root);
	}
	public void postorder(Node n){
		if(n != null){
			postorder(n.left);
			postorder(n.right);
			System.out.print(n.data + " ");
		}
	}
}
