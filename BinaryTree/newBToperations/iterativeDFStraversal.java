package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
	
	public void iterativePostOrder(){
		Node temp = root;
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(temp);
		while(!s1.isEmpty()){
			temp = s1.pop();
			s2.push(temp);
			if(temp.left != null)
				s1.push(temp.left);
			if(temp.right != null)
				s1.push(temp.right);
		}
		while(!s2.isEmpty()){
			temp = s2.pop();
			System.out.print(temp.data+ " ");
		}
	}
	
	public void iterativePreOrder(){
		Node temp = root;
		Stack<Node> s1 = new Stack<Node>();
		if(temp == null)
			return;
		s1.push(temp);
		while(!s1.isEmpty()){
			temp = s1.pop();
			System.out.print(temp.data+" ");
			if(temp.right != null)
				s1.push(temp.right);
			if(temp.left != null)
				s1.push(temp.left);
			
		}
	}
	
	public void iterativeInorder(){
		Node temp = root;
		if(temp == null)
			return;
		Stack<Node> s1 = new Stack<Node>();
		while(true){
			if(temp != null){
				s1.push(temp);
				temp = temp.left;
			}else{
				if(s1.isEmpty()) break;
				temp = s1.pop();
				System.out.print(temp.data +" ");
				temp = temp.right;
			}
		}
		
	}
	public void levelorder(){
		levelorder(root);
	}
	public void levelorder(Node n){
		if(n == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(n);
		while(!q.isEmpty()){
			n = q.poll();
			System.out.print(n.data + " ");
			if(n.left != null)
				q.add(n.left);
			if(n.right != null)
				q.add(n.right);
		}
	}
	
	public void roottoleafsum(){
		int sum = 0;
		Node temp = root;
		for(int i = 0; i < arr.size(); i++){
			temp = arr.get(i);
			sum = sum + temp.data;
		}
		System.out.println("sum is " + sum);
	}
	
	public int height(){
		int h =height(root);
		System.out.println(h);
		return h;
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
