package LinkedList.doubleLinkedList;

class Node {
	int data;
	Node next;
	Node prev;

	public Node(int data, Node next, Node prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class doubleLinkedListBasicProblems {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 4 };
		Node head = covertArrtodll(arr);
		// Node headRemoval = removehead(head);
		// Node tailRemoval = removetail(head);
		int k = 2;
		// Node removekelement = removekElement(head,k);

		Node removeKNode = removeKNode(head, k);
		printDLL(removeKNode);

	}

	private static Node removeKNode(Node head, int k) {

		if (head == null || head.next == null || k < 0) {
			return null;
		}
		if (head.data == k) {
			return null;
		}

		Node temp = head;
		while (temp != null) {
			if (temp.data == k) {
				break;
			}
			temp = temp.next;

		}
		Node back = temp.prev;
		Node front = temp.next;

		if (front == null) {
			temp.next = null;
			temp.prev = null;
			return null;
		}

		back.next = temp.next;
		front.prev = temp.prev;

		temp.next = null;
		temp.prev = null;
		return head;

	}

	private static Node removekElement(Node head, int k) {
		if (head == null || head.next == null || k < 0) {
			return null;
		}
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			if (count == k) {
				break;
			}
			temp = temp.next;
		}
		Node back = temp.prev; // 1
		Node front = temp.next; // 2
		if (back == null) {
			return removehead(head);
		} else if (front == null) {
			return removetail(head);
		} else if (back == null && front == null) {
			return null;
		} else {

			back.next = temp.next;
			front.prev = temp.prev;

			temp.next = null;
			temp.prev = null;
			return head;

		}
	}

	private static Node removetail(Node head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node curr = temp.next;
		temp.next = null;
		curr.prev = null;

		return head;
	}

	private static Node removehead(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node temp = head;
		head = head.next;
		head.prev = null;
		temp.next = null;

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
