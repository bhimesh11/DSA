package LinkedList.singleLinkedList;

public class RotateNode {

	public static void main(String[] args) {
		
		Node head = null;
		 head=insertNode(head,1);
		    head=insertNode(head,2);
		    head=insertNode(head,3);
		    head=insertNode(head,4);
		    head=insertNode(head,5);
		    
		    System.out.println("Original list: ");
		    printList(head);
		    
		    int k = 2;
		 //   Node newHead = rotateRight(head,k); 
		    Node NewHeadLeft  = rotateLeft(head,k);
		    System.out.println("After "+k+" iterations: ");
		  //  printList(newHead);//list after rotating nodes
		    System.out.println("After "+k+" iterations left: ");
		    printList(NewHeadLeft);//list after rotating nodes
	}

	private static Node rotateLeft(Node head, int k) {
		if(head == null || k ==0)
		{
			return head;
		}
		Node tail = head;
		int count =1;
		while(tail.next!=null)
		{
			tail = tail.next;
			count++;
		}
		k = k%count;
		if(k==0)
		{
			return head;
		}
		tail.next = head;
		Node newLast = head;
		for(int i =1;i<k;i++)
		{
			newLast = newLast.next;
		}
		Node newHead = newLast.next;
		newLast.next =null;
		
		return newHead;
	}

	private static Node rotateRight(Node head, int k) {
		if(head ==null|| k == 0)
		{
			return head;
		}
		Node tail = head;
		int count =1;
		while(tail.next != null)
		{
			tail = tail.next;
			count++;
		}
		if(k%count==0)
		{
			return  head;
		}
		k = k%count;
		tail.next=head;
		Node newLastNode = findLastNode(head, count-k);
		head = newLastNode.next;
		newLastNode.next = null;
		return head;
	}


	private static Node findLastNode(Node head, int i) {
		int len =1;
		while(head!=null)
		{
			if(len==i)

			{
				return head;
			}
			len++;
			head= head.next;
			
		}
		return head;
	}

	//utility function to print list
	static void printList(Node head) {
	    while(head.next != null) {
	        System.out.print(head.data+"->");
	        head = head.next;
	    } 
	    System.out.println(head.data);
	    
	}

	private static Node insertNode(Node head, int i) {
		Node newNode = new Node(i);
		if(head ==null)
		{
			head = newNode;
			return head;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=newNode;
		return head;
	}
}
