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
		Node prevGroupTail= null;
		Node nextNode = null;
		while(temp!=null)
		{
			//Generate last node of k group
			Node knode = getKNode(temp , i);
			  // If the Kth node is NULL
            // (not a complete group)
			if(knode==null)
			{
				// If there was a previous group,
                // link the last node to the current node
				if(prevGroupTail!=null)
				{
					prevGroupTail.next = temp;
				}
				//exit the loop
				break;
			}
			 // Store the next node
            // after the Kth node
			Node nextGroupHead = knode.next;
			  // Disconnect the Kth node
            // to prepare for reversal
			knode.next=null;
			// Reverse the nodes from
            // temp to the Kth node
			Node newGroupHead = reverseNodes(temp);
			 // Adjust the head if the reversal
            // starts from the head
			if(prevGroupTail==null)
			{
				head = newGroupHead;
			}else {
				// Link the last node of the previous
                // group to the reversed group
				prevGroupTail.next = newGroupHead;
			}
			 // Update the pointer to the
            // last node of the previous group
			prevGroupTail = temp;
			// Move to the next group
			temp = nextGroupHead;
		}
		// Return the head of the
        // modified linked list
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
