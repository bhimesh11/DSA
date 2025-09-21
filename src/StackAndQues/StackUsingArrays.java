package StackAndQues;
//lifo
class stack {
	int size = 10;
	int[] arr = new int[size];
	int top =-1;
	
	void push(int x)
	{
		top++;
		arr[top] = x;
	}
	int pop ()
	{
		int m = arr[top];
		top--;
		return m;
	}
	int top()
	{
		int m = arr[top];
		return m;
	}
	int size ()
	{
		return top+1;
	}
}
public class StackUsingArrays {

	public static void main(String[] args) {
		
		stack s = new stack();
		s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
	}

	
}
