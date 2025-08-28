package LinkedList.singleLinkedList;

import java.util.HashMap;

public class detectStartingpoint {

	public static void main(String[] args) {

		// Create a sample linked list
		  // Create a sample linked list with a loop
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;
        node5.next = node2;

        // Set the head of the linked list
        Node head = node1;


	    // Check if there is a loop
//	    // in the linked list
	    Node startingpointbrute = detectLoopBrute(head);
	    System.out.println("Loop detected in the linked list from " + startingpointbrute.data);
	        Node startingpointOptimal = detectLoopOptimal(head);
	   
        System.out.println("Loop detected in the linked list from " + startingpointOptimal.data);
       


	    // No need to explic

	
	}

	private static Node detectLoopOptimal(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast.next!=null && fast!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				slow = head;
				while(slow!=fast)
				{
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}

	private static Node detectLoopBrute(Node head) {
		Node temp = head;
		HashMap<Node, Integer> hash = new HashMap<>();
		
		while(temp!=null)
		{
			if(hash.containsKey(temp))
			{
				return temp;
			}else {
				hash.put(temp, 1);
			}
			temp = temp.next;
		}
		return null;
	}


}
