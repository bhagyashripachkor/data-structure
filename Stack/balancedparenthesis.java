package stack;

public class balancedparenthesis {
	static int size = 0;
	 class stack{
		char stack1[] = new char[20];
		
		int top;
		void push(char ch)
		{
			top++;
			stack1[top]=ch;
			size++;
		}
		char pop()
		{
			char ch;
			ch=stack1[top];
			top--;
			size--;
			return ch;
		}
	}
		boolean balanced(String s){
			stack stk = new stack();
			boolean flag = false;
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
					stk.push(s.charAt(i));
				}else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
					if(s.charAt(i) == ')' && (stk.pop() == '('))
						flag = true;
					else if(s.charAt(i) == ']' && (stk.pop() == '['))
						flag = true;
					else if(s.charAt(i) == '}' && (stk.pop() == '{'))
						flag = true;
				}
			}
			if(size != 0)
				flag = false;
			return flag;
		
	}
	
	public static void main(String[] args){
		
		balancedparenthesis bp = new balancedparenthesis();
		String s = "{()}[]";
		System.out.println(bp.balanced(s));
		String s1 = "{(}[]";
		System.out.println(bp.balanced(s1));
		
	}
}
