package LinkedList.singleLinkedList;

import java.util.Arrays;
import java.util.List;

public class InsertNodes {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(12, 8, 5, 7);
		int val = 100;
		Node head = converttoLL(arr);
//		head = insertNewNodeAtHead(val, head);
//		printLL(head);
//		head = insertNewNodeAtTail(val,head);
//		printLL(head);
//		
//		int k = 3;
//		head = insertAtposition(head, val ,k);
//		printLL(head);
//		
		int element = 5;
		head = insertBeforeValue(head, val, element);
		printLL(head);

	}

	private static Node insertBeforeValue(Node head, int val, int element) {

		if (head == null) {
			return null;
		}
		if (head.data == element) {
			return new Node(val, head);
		}

		Node temp = head;
		int count = 0;
		while (temp.next != null) {

			if (temp.next.data == element) {
				Node newNode = new Node(val, temp.next);
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}
		return head;
	}

	private static Node insertAtposition(Node head, int val, int k) {

		if (head == null) {
			if (k == 1) {
				return new Node(val);
			} else {
				return head;
			}
		}
		if (k == 1) {
			return new Node(val, head);
		}
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			if (count == k - 1) {
				Node newNode = new Node(val);
				newNode.next = temp.next;
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}
		return head;
	}

	private static Node insertNewNodeAtTail(int val, Node head) {

		if (head == null) {
			return new Node(val);
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(val);
		temp.next = newNode;
		return head;
	}

	private static void printLL(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");

			head = head.next;
		}
	}

	private static Node insertNewNodeAtHead(int val, Node head) {
		return new Node(val, head);
	}

	private static Node converttoLL(List<Integer> arr) {
		Node head = new Node(arr.get(0));
		Node mover = head;
		for (int i = 1; i < arr.size(); i++) {
			Node itr = new Node(arr.get(i));
			mover.next = itr;
			mover = itr;
		}
		return head;
	}
}
