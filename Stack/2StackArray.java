package stack;

public class twostacksarray {
	
	static class Stack{
		
		char[] array = new char[5];
		int size = array.length;
		int top1 = 0;
		int top2 = size/2 ;
		void push1(char ch){
			if(top1 == size/2 )
				System.out.println("stack1 full");
			else{
				
				array[top1++] = ch;
			}
		}
		void push2(char ch){
			if(top2 == size)
				System.out.println("stack2 full");
			else{
				
				array[top2++] = ch;
			}
		}
		void pop1(){
			if(top1 == 0)
				System.out.println("stack1 is empty");
			else{
				top1--;
			}
		}
		void pop2(){
			if(top2 == size/2)
				System.out.println("stack1 is empty");
			else{
				top2--;
			}
		}
		void print1(){
			for(int i = 0; i < size/2; i++)
				System.out.print(array[i]);
		}
		void print2(){
			for(int i = size/2; i < size; i++)
				System.out.print(array[i]);
		}
	}
	public static void main(String[] args){
		Stack s = new Stack();
		s.push1('h');
		s.print1();
		System.out.println();
		s.push1('e');
		s.print1();
		System.out.println();
		s.push1('l');
		s.print1();
		System.out.println();
		s.push2('l');
		s.print2();
		System.out.println();
		s.push2('l');
		s.print2();
		System.out.println();
		s.push2('o');
		s.print2();
		System.out.println();
		s.push2('a');
		s.print2();
		System.out.println();
		
	}
}
