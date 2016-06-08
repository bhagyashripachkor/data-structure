package stack;


class Stack{
	int top = -1;
	int capacity = 0;
	int[] arr;
	Stack(int c){
		this.capacity = c;
		arr = new int[c];
		
	}
	void push(int x){
		if(top < capacity - 1){
			top++;
			arr[top] = x;
		}else
			System.out.println("stack is full");
	}
	void pop(){
		if(top >= 0){
			int ele = arr[top];
			top--;
			System.out.println(ele);
			
		}else{
			System.out.println("stack is empty");
		
		}
	}
	void peek(){
		if(top >= 0){
			int ele = arr[top];
			System.out.println(ele);
			
		}else{
			System.out.println("stack is empty");
			
		}
	}
	void print(){
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
public class StackArray {
	
	public static void main(String[] args){
		StackArray stk = new StackArray();
		Stack s = new Stack(5);
		s.push(1);
		s.print();
		System.out.println();
		s.push(2);
		s.print();
		s.peek();
		//s.pop();
		s.peek();
		s.print();
		s.push(3);
		s.print();
		System.out.println();
		s.push(4);
		s.print();
		System.out.println();
		s.push(5);
		s.print();
		System.out.println();
		s.push(6);
		s.print();
		System.out.println();
	}
}
