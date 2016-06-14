package stack;

public class NSGStack {
	int size = 0;
	int len ;
	public NSGStack(){
		stack stk = new stack();
		stk.gt();
	}
	
	class stack{
		int array[] = {11, 13, 21, 3};
		int stack1[] = new int[array.length];
		
		int top;
		void push(int ch)
		{
			top++;
			stack1[top]=ch;
			size++;
		}
		int pop()
		{
			int ch;
			ch=stack1[top];
			top--;
			size--;
			return ch;
		}
		boolean isEmpty(){
			if(size == 0)
				return true;
			else
				return false;
		}
		void gt(){
			int next,ele;
			push(array[0]);
			for(int i = 1; i < array.length; i++){
				next = array[i];
				if(!isEmpty()){
					ele = pop();
					while(ele < next){
						System.out.println(ele+"->"+next);
						if(isEmpty())
							break;
					}
					if(ele > next)
						push(ele);
				}
				push(next);
			}
			while(!isEmpty()){
			 ele = pop();
			 next = -1;
			 System.out.println(ele+"->"+next);
			}
		}
	}
	public static void main(String[] args){
		NSGStack nsg = new NSGStack();
	}
}
