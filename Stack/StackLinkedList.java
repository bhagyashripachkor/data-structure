package stack;

public class StackLinkedList {
	Node top;
	class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	void push(int d){
		Node n = new Node(d);
		if(top == null){
			
			top = n;
		}else{
			n.next = top;
			top = n;
		}
	}
	void pop(){
		if(top == null)
			System.out.println("stack is empty");
		else{
			Node temp = top;
			top = temp.next;
			System.out.println("popped"+temp.data);
		}
	}
	void peek(){
		if(top == null)
			System.out.println("stack is empty");
		else{
			System.out.println("peek"+top.data);
		}
	}
	void print(){
		Node temp = top;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args){
		StackLinkedList sll = new StackLinkedList();
		sll.push(5);
		sll.print();
		System.out.println();
		sll.push(4);
		sll.print();
		System.out.println();
		sll.push(3);
		sll.print();
		System.out.println();
		sll.pop();
		sll.print();
		System.out.println();
		sll.peek();
	}
}
