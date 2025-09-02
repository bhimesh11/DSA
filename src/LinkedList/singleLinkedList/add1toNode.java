package LinkedList.singleLinkedList;

public class add1toNode {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		printLinkedList(head);
		Node OneOpti = addOneOptimal(head);
		// Node OneBrute = addOneBrute(head);
		printLinkedList(OneOpti);

	}

	private static Node addOneOptimal(Node head) {
		Node temp = head;
		int carry = helper(head);
		if (carry == 1) {
			Node newNode = new Node(carry);
			newNode.next = head;
			return newNode;
		}
		return head;

	}

	private static int helper(Node head) {
		Node temp = head;
		if (temp == null) {
			return 1;
		}
		int carry = helper(head.next);
		head.data = head.data + carry;
		if (head.data < 10) {
			return 0;
		} else {
			temp.data = 0;
			return 1;
		}
	}

	private static Node addOneBrute(Node head) {
		Node temp = head;
		head = reverseLinkedList(head);
		int carry = 1;
		while (temp != null) {
			head.data = head.data + carry;

			if (temp.data < 10) {
				carry = 0;
			} else {
				temp.data = 0;
				carry = 1;
			}
			temp = temp.next;
		}
		if (carry == 1) {
			Node newNode = new Node(carry);
			newNode.next = head;
			head = newNode;
		}
		head = reverseLinkedList(head);
		return head;
	}

	private static Node reverseLinkedList(Node head) {
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

	private static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

}
