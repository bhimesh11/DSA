package LinkedList.singleLinkedList;

public class ReverseNodeinKgroups {

	public static void main(String[] args) {
		 Node head = new Node(5);
	        head.next = new Node(4);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(7);
	        head.next.next.next.next = new Node(9);
	        head.next.next.next.next.next = new Node(2);

	        // Print the original linked list
	        System.out.print("Original Linked List: ");
	        printLinkedList(head);

	        // Reverse the linked list
	        head = kReverse(head, 4);

	        // Print the reversed linked list
	        System.out.print("Reversed Linked List: ");
	        printLinkedList(head);
	    
	}
	
	   private static Node kReverse(Node head, int i) {
		   Node temp = head;
		   Node prevNodeTail = null;
		   while(temp!=null)
		   {
			   Node knode = getKNode(temp, i);
			   if(knode==null)
			   {
				   if(prevNodeTail!=null)
				   {
					   prevNodeTail.next = temp;
				   }
				   break;
			   }
			   
			   Node nextGroupHead = knode.next;
			   knode.next = null;
			   Node newGroupHead = reverseNodes(temp);
			   
			   if(prevNodeTail==null)
			   {
				   head = newGroupHead;
			   }else {
				   prevNodeTail.next=newGroupHead;
			   }
			   prevNodeTail = temp;
			   temp = nextGroupHead ;
		   }
		   return head;
	   }

	private static Node reverseNodes(Node head) {
		Node temp = head;
		Node prev =null;
		while(temp!=null)
		{
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}

	private static Node getKNode(Node temp, int m) {
		Node current  = temp;
		for(int i =1;i<m && current!=null ;i++)
		{
			current = current.next;
		}
		return current;
	}

	static void printLinkedList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
}
