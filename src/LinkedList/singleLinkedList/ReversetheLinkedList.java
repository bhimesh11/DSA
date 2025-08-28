package LinkedList.singleLinkedList;

import java.util.Stack;

public class ReversetheLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4 };
		Node head = convertToLinkedList(arr);

		// Node reverseHead = BruteApproach(head);
		//Node reverseHeadOptimal1 = Optimal1(head);
		Node rervserHeadInRecusrsive = recursive(head);
		printLL(rervserHeadInRecusrsive);

	}

	private static Node recursive(Node head) {
		
		if(head==null || head.next==null)
		{
			return head;
		}
		Node newhead = recursive(head.next);
		Node front = head.next;
		front.next = head;
		head.next=null;
		return newhead;
	}

	private static Node Optimal1(Node head) {
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}

	private static Node BruteApproach(Node head) {

		Node temp = head;
		Stack<Integer> st = new Stack<>();
		while (temp != null) {
			st.push(temp.data);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			temp.data = st.peek();
			st.pop();
			temp = temp.next;
		}
		return head;
	}

	private static void printLL(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");

			head = head.next;
		}
	}

	private static Node convertToLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node current = new Node(arr[i]);
			mover.next = current;
			mover = current;
		}
		return head;
	}

}
