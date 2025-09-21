package StackAndQues;

class Queuly
{
	class queueNode{
		int data;
		queueNode next;
		
		public queueNode(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	queueNode front =null,rear = null;
	int size =0;
	boolean Empty(){
		return front == null;
		
	}
	int peek()
	{
		 if(Empty())  
	     {  System.out.println("Queue is Empty");
	        return -1;
	     } else {
	    	 return front.data;
	     }
	}
	void Enqueue(int value)
	{
		queueNode temp ;
		temp = new queueNode(value);
		if(temp==null)
		{
			 System.out.println("Queue is Full");
		}else {
			if(front ==null)
			{
				front=temp;
				rear = temp;
			}else {
				rear.next = temp;
				rear = temp;
			}
			 System.out.println(value+" Inserted into Queue ");
		        size++;
		}
	}
	void dequeue()
	{
		 if (front == null) 
		        System.out.println("Queue is Empty");
		    else
		    { 
		    	 System.out.println(front.data+" Removed From Queue");
		    	 queueNode temp = front;
		    	 front = front.next;
		    	 size--;
		    }
	}
}
public class QueueUsingLinkedList {
	public static void main(String[] args) {
		Queuly Q=new Queuly();
	    Q.Enqueue(10);
	    Q.Enqueue(20);
	    Q.Enqueue(30);
	    Q.Enqueue(40);
	    Q.Enqueue(50);
	    Q.dequeue();
	    System.out.println("The size of the Queue is "+Q.size);
	    System.out.println("The Peek element of the Queue is "+Q.peek());
			
	}
	
}
