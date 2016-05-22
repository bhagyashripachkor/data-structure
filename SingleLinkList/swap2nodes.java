package linkList;

public class SLLCreate {
	
	Node head;
	Node head1 = head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void createlast(int n){
		if (head == null){
			head = new Node(n);
			
		}
		else{
			
			Node current = head;
			Node newNode = new Node(n);
			if(newNode != null){
				while(current.next != null){
			
					current = current.next;
				}
				
			current.next = newNode;
		}
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
	
	void createpos(int pos, int d){
		
		if(head == null)
			head = new Node(d);
		else if(pos == 1){
			Node n = new Node(d);
			n.next = head;
			head = n;
		}else{
			int l = length();
			if(pos <= l){
			Node prev = head;
			Node current = null;
			Node n = new Node(d);
			for(int i = 1; i < pos && prev.next != null; i++){
				if(i == pos-1){
					current = prev;
				
					break;
				}
				prev = prev.next;
			}
			n.next = current.next;
			current.next = n;
			}else
				System.out.println("invlid pos");
		}
	
	}
	
	void afterele(int data, int e){
		if(head == null)
			head = new Node(data);
		else{
			int flag = 0;
			Node n = new Node(data);
			Node curr = head;
			int l = length();
			for(int i = 1; i <= l; i++){
				System.out.println(curr.data);
				if(curr.data == e){
					flag =1;
					break;
				}
				curr = curr.next;
			}
			if(flag == 1){
			n.next = curr.next;
			curr.next = n;
			}else
				System.out.println("ele not found");
		}
	}
	
	void beforeele(int data, int e){
		if(head == null)
			head = new Node(data);
		else{
			int flag = 0;
			Node curr = head;
			Node prev = head;
			Node n = new Node(data);
			int l = length();
			for(int i = 1; i <= l; i++){
				if(curr.data == e){
					flag =1;
					break;
				}
				prev = curr;
				curr = curr.next;
			}
			if(flag == 1){
			n.next = prev.next;
			prev.next = n;
			}else
				System.out.println("ele not found");
		}
	}
	
	void addend(int data){
		if(head == null)
			head = new Node(data);
		else{
			Node n = new Node(data);
			Node curr = head;
			while(curr.next != null){
				curr = curr.next;
			}
			curr.next = n;
			n.next = null;
			
		}
	}
	
	void deleteele(int data){
		Node curr = head;
		if(curr.data == data){
			head = curr.next;
			curr.next = null;
		}
		else{
			Node prev = head;
			int l = length();
			for(int i = 1; i <= l; i++) {
				if(curr.data ==data)
					break;
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
			curr.next = null;
			
		}
	}
	
	void deletepos(int pos){
		Node curr = head;
		int l = length();
		if(pos == 1){
				head = curr.next;
				curr.next = null;
	
		}else if(pos <= l){
			Node prev = head;
		
			for(int i = 1; i <= l; i++) {
				if(pos == i)
					break;
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
			curr.next = null;
		}else
			System.out.println("invalid pos");
	}
	void print(){
		Node n = head;
		while(n != null){
			System.out.print(" "+n.data);
			n = n.next;
		}
	}
	
	//reverse ll
	void fun1test(){
		Node n = head;
		fun1(n);
	}
	void fun1(Node n){

		if(n == null)
			return;
		
		fun1(n.next);
		System.out.println("data is"+n.data);
	}
	
	int length(){
		int cnt = 0;
		Node curr = head;
		while(curr.next != null){
			cnt++;
			curr = curr.next;
			
		}
		return cnt;
	}
	
	int recLength(){
		if(head1 == null)
			return 0;
		head1 = head1.next;
		return (1 + recLength());
	}
	
	void getNodeCount(){
		int x = recLength();
		System.out.println(x);
	}
	void fun2test(){
		Node n = head;
		fun2(n);
	}
	void fun2(Node n){

		if(n == null)
			return;
		System.out.print(" "+n.data);
		
		if(n.next != null)
		fun2(n.next.next);
		System.out.print(" "+n.data);
	}
	
	void swap(int x, int y){
		if (x == y) return;

        // Search for x (keep track of prevX and CurrX)
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x)
        {
        	
            prevX = currX;

            currX = currX.next;
        }
        //System.out.println(prevX.data+"X");
        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }
        //System.out.println(prevY.data+"Y");
        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;
 
        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;
 
        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;
 
        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
	}
	public static void main(String[] args){
		SLLCreate s = new SLLCreate();

		s.createlast(2);
		s.createlast(6);
		s.createlast(3);
		s.createfirst(1);
		s.createpos(1,8);
		s.createpos(2,5);
		s.createpos(10,5);
		s.afterele(4, 1);
		s.beforeele(7, 4);
		s.addend(11);
		s.print();
		//s.deleteele(8);
		System.out.println();
		s.print();
		//s.deleteele(3);
		System.out.println();
		s.print();
		//s.deleteele(11);
		System.out.println();
		s.print();
		//s.deletepos(1);
		System.out.println();
//		s.print();
//		s.deletepos(3);
//		System.out.println();
		s.print();
		s.beforeele(85,12);
		s.getNodeCount();
		s.swap(1,2);
		System.out.println();
		s.print();
		//s.fun1test();
		//s.fun2test();
		

	}
}
