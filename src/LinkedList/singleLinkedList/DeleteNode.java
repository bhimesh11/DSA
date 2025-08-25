package LinkedList.singleLinkedList;

public class DeleteNode {

	public static void main(String[] args) {
		int[] arr = { 12, 5, 8, 2 };
		Node head = converttoLinkedList(arr);
		// head = removeHead(head);
		printLL(head);
		// head = removeTail(head);
		System.out.println();
		// printLL(head);
		// int k = 5;
		// head = removeatposition(head, k);
		// printLL(head);
		int element = 8;
		head = removeElementinNode(head, element);
		printLL(head);

	}

	private static Node removeElementinNode(Node head, int i) {
		if (i == 0 || head.next == null) {
			return head;
		}
		if (head.data == i) {
			Node temp = head;
			head = head.next;
			return head;
		} else {
			Node temp = head;
			Node prev = null;
			while (temp != null) {

				if (temp.data == i) {
					prev.next = prev.next.next;
					break;
				}
				prev = temp;
				temp = temp.next;

			}
			return head;
		}

	}

	private static Node removeatposition(Node head, int k) {
		// edge case
		if (k == 0 || head.next == null) {
			return head;
		}
		if (k == 1) {
			Node temp = head;
			head = head.next;
			return head;
		} else {
			int count = 0;
			Node temp = head;
			Node prev = null;
			while (temp != null) {
				count++;
				if (count == k) {
					prev.next = prev.next.next;
					break;
				}
				prev = temp;
				temp = temp.next;

			}
			return head;
		}
	}

	private static Node removeTail(Node head) {
		if (head == null || head.next == null) {
			return null;
		}

		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;

		return head;
	}

	private static void printLL(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	private static Node removeHead(Node head) {
		if (head == null) {
			return head;
		}
		Node temp = head;
		head = head.next;
		return head;
	}

	private static Node converttoLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}

		return head;
	}

}
