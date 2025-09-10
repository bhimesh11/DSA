package RecursionPattrenWise;

import java.util.Stack;

public class ReverseStack {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		 s.push(1);
	        s.push(2);
	        s.push(3);
	        s.push(4);
	
	        reverseStack(s); //4 ,3 , 2 ,1 

	        while (!s.isEmpty()) {
	            System.out.print(s.pop() + " ");
	        }
	        System.out.println();
	}

	private static void reverseStack(Stack<Integer> s) {
	
		if(s.isEmpty())
		{
			return ;
		}
		int top = s.pop();
		reverseStack(s);
		insertAtBottom(s,top);
		
	}

	private static  void insertAtBottom(Stack<Integer> s, int top) {
		if(s.isEmpty())
		{
			s.push(top);
			return;
		}
		int temp  = s.pop();
		insertAtBottom(s, top);
		s.push(temp);
	}

}