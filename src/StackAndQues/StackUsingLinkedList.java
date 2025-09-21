package StackAndQues;

class stackly
{
	private class stackNode
	{
		int data;
		stackNode next;
		public stackNode(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	stackNode top;
	int size;
	public stackly() {
		this.top = null;
		this.size =0;
	}
	public void stackPush(int x)
	{
		stackNode element = new stackNode(x);
		element.next = top;
		top = element;
		 System.out.println("Element pushed");
		    size++;
	}
	public int stackpop()
	{
		if(top==null)
		{
			return -1;
		}
		int topdate = top.data;
		stackNode temp = top;
		top = top.next;
		size--;
	return topdate;
	}
	public int top()
	{
		
		if(top==null)
		{
			return -1;
		}
		int topdate = top.data;
		stackNode temp = top;
		return top.data;
	}
	public int size()
	{
		return size;
	}
	 public boolean stackIsEmpty() {
		    return top == null;
		  }
	public void printStack()
	{
		stackNode current = top;
		while(current!=null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
public class StackUsingLinkedList {
	
	public static void main(String[] args) {
		 stackly s = new stackly();
		    s.stackPush(10);
		    s.stackPush(20);
		    s.printStack();
		    System.out.println("Element popped " + s.stackpop());
		    System.out.println("Stack size: " + s.size());
		    System.out.println("Stack is empty or not: " + s.stackIsEmpty());

	}

}
