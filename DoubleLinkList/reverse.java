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
	int size(){
		int s = 0;
		Node temp = head;
		while(temp != null){
			s++;
			temp = temp.next;
		}
		s++;
		return s;
	}
	void insertbeforeele(int ele, int d){
		int s = size();
		if(head == null)
			insertfirst(ele);
		else{
			Node temp = head;
			for(int i = 1; i <s; i++) {
				if(temp.next.data == ele)
					break;
				temp=temp.next;
			}
		
			Node n = new Node(d);
			n.next =temp.next;
			temp.next.prev = n;
			n.prev = temp;
			temp.next = n;
		}
	}
	void insertafterele(int ele, int d){
		int s = size();
		if(head == null)
			insertfirst(ele);
		else{
			Node temp = head;
			for(int i = 1; i <s; i++) {
				if(temp.data == ele)
					break;
				temp=temp.next;
			}
			Node n = new Node(d);
			n.next = temp.next;
			temp.prev = n;
			n.prev = temp;
			temp.next = n;
		}
	}
	void deletefirst(){
		if(head == null){
			System.out.println("list is empty");
		}else{
			Node temp = head;
			temp.next.prev = null;
			head = temp.next;
		}
	}
	void deleteele(int d){
		int s = size();
		if(head == null){
			System.out.println("list is empty");
		}else{
			Node temp = head;
			for(int i = 0;i < s; i++){
				if(temp.next.data == d)
					break;
				temp = temp.next;
			}
			
			temp.next = temp.next.next;
			temp.next.next.prev = temp;
		}
	}
	void reverse(){
		 Node prev = null;
		    while (head != null) {
		        Node next = head.next;
		        head.next = prev;
		        prev = head;
		        head = next;
		    }
		   
		
		head = prev;
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
		dll.insertbeforeele(1,3);
		System.out.println();
		dll.print();
		dll.insertafterele(1,2);
		System.out.println();
		dll.print();
		dll.deletefirst();
		System.out.println();
		dll.print();
		dll.deleteele(1);
		System.out.println();
		dll.print();
		dll.reverse();
		System.out.println();
		dll.print();
	}
}
