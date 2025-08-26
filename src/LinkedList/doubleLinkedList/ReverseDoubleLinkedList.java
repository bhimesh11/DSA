package LinkedList.doubleLinkedList;

import java.util.Stack;

public class ReverseDoubleLinkedList {
	
	
	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 4 };
		Node head = covertArrtodll(arr);
		printDLL(head);
//		Node reverse = reverseDLLbrute(head);
		Node OptiReverse = reverseDLLOptimal(head);
		System.out.println();
		printDLL(OptiReverse);
	}
	

	private static Node reverseDLLOptimal(Node head) {
		Node current = head;
		Node last = null;
		while(current!=null)
		{
			last = current.prev;
			current.prev = current.next;
			current.next = last;
			current = current.prev;
			System.out.println();
			printDLL(last);
		}
		head = last.prev;
		return head;
	}


	private static Node reverseDLLbrute(Node head) {
		Node temp= head;
		Stack<Integer> stack = new Stack<>();
		while(temp!=null)
		{
			stack.push(temp.data);
			temp = temp.next;
		}
		temp =head;
		while(temp!=null)
		{
			temp.data = stack.peek();
			stack.pop();
			temp = temp.next;
		}
		return head;
	}


	private static void printDLL(Node head) {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		

	}

	private static Node covertArrtodll(int[] arr) {
		Node head = new Node(arr[0], null, null);
		Node back = head;
		for (int i = 1; i < arr.length; i++) {
			Node current = new Node(arr[i], null, back);
			back.next = current;
			back = current;

		}
		return head;

	}


}
