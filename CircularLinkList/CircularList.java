package linkList;

public class CircularList {
	Node start=null,end=null;
	int size = 0;
	class Node{
		int data;		
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
			
		}
	}
	
	boolean isEmpty(){
		if (size == 0);
		return true;
	}
	void count(){
		int count = 0;
		Node p = start;
		if(p != null){
			while(p.next != start){
				count++;
				p = p.next;
			}
			count++;
			System.out.println(count);
		}
	}
	void insert(int d){
		
		if(start == null){
			Node n = new Node(d);
			start = n;
			n.next = n;
		}
		else{
			Node temp = start;
			System.out.println("in else");
	
			while(temp.next != start){
				temp = temp.next;
			}
			Node newn = new Node(d);
			temp.next = newn;
			newn.next = start;
			size++;
		}
			
	}
	void insertfirst(int d){
		if(start == null){
			Node n = new Node(d);
			n.next = start;
			start = n;
			
		}else{
			Node temp = start;
			Node n = new Node(d);
			while(temp.next != start)
				temp = temp.next;
			temp.next = n;
			n.next = start;
			start = n;
		}
	}
	void insertatpos(int d, int pos){
		
		if(start == null){
			Node n = new Node(d);
			n.next = start;
			start = n;
		}else{
			if(pos == 1){
				insertfirst(d);
			}else{
				Node n = new Node(d);
				Node temp = start;
				for(int i = 1; i < pos-1; i++){
					temp = temp.next;					
				}
				System.out.println("temp"+temp.data);
				n.next = temp.next;
				temp.next = n;
			}
		}
	}
	void print(){
		Node p=start;
		if(p != null){
			while(p.next != start){
				System.out.print(p.data+"->");
				p = p.next;
			}
			System.out.print(p.data+"\n");
		}
	}
	void deleteatpos(int pos){
		if(start == null)
			return;
		else{
			Node temp1 = start;
			Node temp2 = start;
			if(pos == 1){
				
				while(temp2.next != start)
					temp2 = temp2.next;
		
				temp2.next = temp1.next;
				start = temp1.next;
				
			}else{
				for(int i = 1; i < pos-1; i++){
					temp1 = temp1.next;
				}
				
				temp1.next = temp1.next.next;
			}
		}
	}
//	void split(){
//		if(start == null)
//			return;
//		else{
//			Node sptr = start;
//			Node fptr = start;
//			
//		}
//	}
	public static void main(String[] args){
		CircularList c = new CircularList();
		c.insert(5);
		c.print();
		c.insert(8);
		c.print();
		c.insert(12);
		c.print();
		c.count();
		c.insertfirst(1);
		c.print();
		c.insertatpos(6, 3);
		c.print();
		c.insertatpos(13, 6);
		c.print();
		c.deleteatpos(1);
		c.print();
		c.deleteatpos(3);
		c.print();
	}
}
