package LinkedList.singleLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLinkedList {
	
	public static void main(String[] args) {
		
		 Node head = new Node(3);
	        head.next = new Node(2);
	        head.next.next = new Node(5);
	        head.next.next.next = new Node(4);
	        head.next.next.next.next = new Node(1);
	        
	        System.out.print("Original Linked List: ");
	        printLinkedList(head);

	        // Sort the linked list
	       // head = sortLL(head);
	        head = sortLLopt(head);
	        printLinkedList(head);

	}

	  private static Node findMiddle(Node head) {
	        Node slow = head, fast = head.next; // head.next helps split evenly
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow; // 'slow' is node before the start of right half
	    }

	    // Correct: advance pointers on the chosen side
	    private static Node mergeTwoSortedLinkedList(Node left, Node right) {
	        Node dummy = new Node(-1), tail = dummy;

	        while (left != null && right != null) {
	            if (left.data <= right.data) {
	                tail.next = left;
	                left = left.next;
	            } else {
	                tail.next = right;
	                right = right.next;
	            }
	            tail = tail.next;
	        }
	        tail.next = (left != null) ? left : right;
	        return dummy.next;
	    }

		private static void printLL(Node head) {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();

		}

	    private static Node sortLLopt(Node head) {
	        if (head == null || head.next == null) return head;

	        Node mid = findMiddle(head);
	        Node right = mid.next;
	        mid.next = null;
	        Node left = head;

	        left = sortLLopt(left);
	        right = sortLLopt(right);

	        return mergeTwoSortedLinkedList(left, right);
	    }
	
	private static Node sortLL(Node head) {
		Node temp = head;
		List<Integer> arr = new ArrayList<>();
		
		while(temp!=null)
		{
			arr.add(temp.data);
			temp = temp.next;
			
		}
		System.out.println(arr);
		Collections.sort(arr);
		temp = head;
		for(int i=0;i<arr.size();i++)
		{
			temp.data = arr.get(i);
			temp = temp.next;
		}
		return head;
	}

	private static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

		
	}

}
