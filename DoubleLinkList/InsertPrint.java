package linkList;

public class DoubleLinkList {
	Node head;
	class Node{
		int data;
		Node prev,next;
		public Node(int d){
			this.data = d;
			this.prev = null;
			this.next = null;
		}
	}
	void insertfirst(int d){
	
		Node n = new Node(d);
		if(head == null){
		
			head = n;
		}else{
			Node temp = head;
			n.next = temp;
			temp.prev = n;
			head = n;
			
		}
	}
	
	void insertlast(int d){
		Node n = new Node(d);
		if(head == null){
		
			head = n;
		}else{
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
		
			n.prev = temp;
			temp.next = n;
			
		}
	}
	void print(){
		
		Node n = head;
		if(head == null)
			return;
		else{
			
		while(n != null){
			
			System.out.print(n.data + " ");
			n = n.next;
		}
		}
	}
	void insetatpos(int d, int pos){
		Node n = head;
		if(head == null)
			return;
		else{
			if(pos == 1)
				insertfirst(d);
			else{
				Node temp = head;
				Node newn = new Node(d);
				for(int i = 1;i < pos - 1; i++){
					temp = temp.next;
				}
		
				newn.next = temp.next;
				temp.next.prev = newn;
				newn.prev = temp;
				temp.next = newn;
			}
		}
	}
	public static void main(String[] args){
		DoubleLinkList dll = new DoubleLinkList();
		dll.insertfirst(5);
		dll.print();
		System.out.println();
		dll.insertfirst(6);
		dll.print();
		System.out.println();
		dll.insertfirst(7);
		dll.print();
		dll.insertlast(4);
		System.out.println();
		dll.print();
		dll.insetatpos(1, 3);
		System.out.println();
		dll.print();
	}
}
