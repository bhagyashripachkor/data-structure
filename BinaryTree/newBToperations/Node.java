package tree;


public class Node {

		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data =data;
			this.left = null;
			this.right = null;
		}
		
		Node(){
			data = 0;
			left = null;
			right= null;
		}
		void setLeft(Node n ){
			this.left = n;
		}
		
		void setRight(Node n){
			this.right = n;
		}
		
		Node getRight(){
			return right;
		}
		
		Node getLeft(){
			return left;
		}
		
		void setData(int d){
			this.data = d;
		}
		
		int getData(){
			return this.data;
		}
}
