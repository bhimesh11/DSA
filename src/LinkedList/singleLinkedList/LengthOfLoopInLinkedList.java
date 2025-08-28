package LinkedList.singleLinkedList;

import java.util.HashMap;

public class LengthOfLoopInLinkedList {
	
	
	public static void main(String[] args) {
		  Node head = new Node(1);
	        Node second = new Node(2);
	        Node third = new Node(3);
	        Node fourth = new Node(4);
	        Node fifth = new Node(5);

	        // Create a loop from fifth to second
	        head.next = second;
	        second.next = third;
	        third.next = fourth;
	        fourth.next = fifth;
	        
	        // This creates a loop
	        fifth.next = second; 

	        int loopLength = lengthOfLoop(head);
	        int lengthOfLoop = loopLength(head);

	        if (lengthOfLoop > 0) {
	            System.out.println("Length of the loop: " + loopLength);
	        } else {
	            System.out.println("No loop found in the linked list.");
	        }
	}

	private static int loopLength(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
			return findLength(slow, fast);
			}
			
		}
		return 0;
	}

	private static int findLength(Node slow, Node fast) {
		fast = fast.next;
		int counter =1;
		while(slow !=fast)
		{
			counter++;
			fast = fast.next;
		}
		return counter;
	}

	private static int lengthOfLoop(Node head) {
	
		Node temp = head;
		HashMap<Node, Integer> hash = new HashMap<>();
		int timer =0;
		while(temp!=null)
		{
			if(hash.containsKey(temp))
			{
				int timerLenght = hash.get(temp) - timer;
				if(timerLenght<0)
				{
					timerLenght = timerLenght*-1;
				}
				return timerLenght;
			}else {
				hash.put(temp, timer);
			}
			temp = temp.next;
			timer++;
		}
		return 0;
	}

}
