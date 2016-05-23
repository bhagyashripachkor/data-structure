package linkList;



public class reversek {
	static Node head = null;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void createfirst(int d){
		if (head == null){
			head = new Node(d);
		
		}else{
			Node current = head;
			Node n =new Node(d);
			if(n != null){
				n.next = head;
				head = n;
		
			}
		} 
	}
	
	void print(){
		Node n = head;
		while(n != null){
			System.out.print(" "+n.data);
			n = n.next;
		}
	}
	
	Node rev(Node head, int k){
		int count = 0;
		Node current = head;
		Node prev = null, next =null;
		while(count < k && current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		
		if(next != null)
			head.next = rev(next,k);
		
		return prev;
	}
	public static void main(String[] args){
		reversek s = new reversek();

		
//		a.createfirst(5);a.createfirst(10);a.createfirst(15);
//		b.createfirst(2);b.createfirst(8);b.createfirst(11);
		
		//c.merge2List(a, b);
		s.createfirst(2);
		s.createfirst(3);
		s.createfirst(4);
		s.createfirst(5);
		s.createfirst(6);
		s.print();
		System.out.println();
		int k = 3;
		head = s.rev(head,k);
		s.print();
		
	}
}
