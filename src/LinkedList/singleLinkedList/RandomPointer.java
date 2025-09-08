package LinkedList.singleLinkedList;

import java.util.HashMap;
import java.util.Map;

public class RandomPointer {
	
	public static void main(String[] args) {
		  Node head = new Node(7);
	        head.next = new Node(14);
	        head.next.next = new Node(21);
	        head.next.next.next = new Node(28);

	        // Assigning random pointers
	        head.random = head.next.next;
	        head.next.random = head;
	        head.next.next.random = head.next.next.next;
	        head.next.next.next.random = head.next;

	        System.out.println("Original Linked List with Random Pointers:");
	        printClonedLinkedList(head);

	        // Clone the linked list
	      //  Node clonedList = cloneLL(head);
	        Node clonedList = cloneLLopt(head);

	        System.out.println("\nCloned Linked List with Random Pointers:");
	        printClonedLinkedList(clonedList);
	}

	 private static Node cloneLLopt(Node head) {
		//step-1
		 Node temp = head;
		 while(temp!=null)
		 {
			 Node copyNode = new Node(temp.data);
			 copyNode.next = temp.next;
			 temp.next = copyNode;
			 temp = temp.next.next;
		 }
		 temp = head;
		 while(temp!=null)
		 {
			 Node copyNode = temp.next;
			 if(temp.random!=null)
			 {
				 copyNode.random = temp.random.next;
			 }else {
				 copyNode.random =null;
			 }
			 temp = temp.next.next;
		 }
		 
		Node dummyNode = new Node(-1);
		Node res = dummyNode;
		 temp = head;
		while(temp!=null)
		{
			res.next = temp.next;
			temp.next = temp.next.next;
			res = res.next;
			
			temp = temp.next;
		}
		return dummyNode.next;
	}
	
	 

	private static Node cloneLL(Node head) {
	 Node temp =head;
	 Map<Node, Node> map = new HashMap<>();
	 while(temp!=null)
	 {
		Node newNode = new Node(temp.data);
		
		 if(!map.containsKey(temp));
		 {
			map.put(temp, newNode) ;
		 }
		 temp = temp.next;
	 }
	 temp = head;
	 while(temp!=null)
	 {
		 Node copyNode  = map.get(temp);
		 copyNode.next = map.get(temp.next);
		 copyNode.random = map.get(temp.random);
		 temp = temp.next;
	 }
	 return map.get(head);
	}

	public static void printClonedLinkedList(Node head) {
	        while (head != null) {
	            System.out.print("Data: " + head.data);
	            if (head.random != null) {
	                System.out.print(", Random: " + head.random.data);
	            } else {
	                System.out.print(", Random: nullptr");
	            }
	            System.out.println();
	            // Move to the next node in the list
	            head = head.next;
	        }
	    }

}
