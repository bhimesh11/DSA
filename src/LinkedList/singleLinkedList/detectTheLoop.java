package LinkedList.singleLinkedList;

import java.util.HashMap;
import java.util.Map;

public class detectTheLoop {
	public static void main(String[] args) {
		// Create a sample linked list
	    // with a loop for testing
	    Node head = new Node(1);
	    Node second = new Node(2);
	    Node third = new Node(3);
	    Node fourth = new Node(4);
	    Node fifth = new Node(5);
	 
	    head.next = second;
	    second.next = third;
	    third.next = fourth;
	    fourth.next = fifth;
	    // Create a loop
	    fifth.next = third;

	    // Check if there is a loop
//	    // in the linked list
//	    if (detectLoop(head)) {
//	        System.out.println("Loop detected in the linked list.");
//	    } else {
//	        System.out.println("No loop detected in the linked list.");
//	    }

	    if (detectLoopOptimal(head)) {
	        System.out.println("Loop detected in the linked list.");
	    } else {
	        System.out.println("No loop detected in the linked list.");
	    }

	    // No need to explic

	}

	private static boolean detectLoopOptimal(Node head) {
		
		Node slow = head;
		 Node fast = head;
		 while(fast.next !=null && fast!=null)
		 {
			 slow = slow.next;
			 fast = fast.next.next;
			 if(slow == fast)
			 {
				 return true;
			 }
		 }
		 return false;
	}

	private static boolean detectLoop(Node head) {
		Node temp = head;
		Map<Node,Integer> hash = new HashMap<>();
		while(temp!=null)
		{
			if(hash.containsKey(temp))
			{
				return true;
			}else {
				hash.put(temp, 1);
			}
			temp = temp.next;
		}
		return true;
	}
	
}
