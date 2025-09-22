package StackAndQues;

import java.util.Stack;

class minStack
{
	Stack<Integer> originalStack;
	Stack<Integer> miniStack;
	public minStack() {
		super();
		this.originalStack = new Stack<Integer>();
		this.miniStack = new Stack<Integer>();
	}
	
	public void push(int val)
	{
		originalStack.push(val);
		
		if(miniStack.isEmpty() || val <= miniStack.peek())
		{
			miniStack.push(val);
		}
	}
	
	public void pop()
	{
		int poppedValue = originalStack.pop();
		if(poppedValue==miniStack.peek())
		{
			miniStack.pop();
		}
	}
	public int top()
	{
		return originalStack.peek();
	}
	
	public int getMin()
	{
		return miniStack.peek();
	}
}
public class ImplementMinStack {

	public static void main(String[] args) {
		minStack ms = new minStack();
		ms.push(5);
		ms.push(-3);
		ms.push(-2);
		ms.push(2);
		System.out.println(ms.getMin());
		System.out.println(ms.top());
		ms.pop();
		ms.push(-5);
		System.out.println(ms.getMin());
		System.out.println(ms.top());
		ms.pop();
		System.out.println(ms.getMin());
		//System.out.println(ms.getMin());
	}
}
