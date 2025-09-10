package RecursionPattrenWise;

import java.util.Stack;

public class SortStackRecursive {
	
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		 st.push(11);
	        st.push(2);
	        st.push(32);
	        st.push(3);
	        st.push(41);

	        sortStack(st);

	        while (!st.isEmpty()) {
	            System.out.print(st.pop() + " ");
	        }
	        System.out.println();
	    }

	private static void sortStack(Stack<Integer> st) {
		if(!st.isEmpty())
		{
			int x = st.pop();
			sortStack(st);
			sortedInsert(st,x);
			
		
	}
	}

	private static void sortedInsert(Stack<Integer> st, int x) {
		if(st.isEmpty() || x>st.peek())
		{
			st.push(x);
			return ;
		}
		int temp = st.pop();
		sortedInsert(st, x);
		st.push(temp);
		
	}

}
