package LinkedList.singleLinkedList;

public class DelteNodeFromMiddle {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		// Display the original linked list
		System.out.print("Original Linked List: ");
		printLL(head);

		// Deleting the middle node
//		head = deleteMiddle(head);
//		printLL(head);
		System.out.println("Optimal Approach");
		head = deleteMiddleOptimal(head);
		printLL(head);
	}

	private static Node deleteMiddleOptimal(Node head) {
		Node slow = head;
		Node fast = head;
		fast = head.next.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow.next = slow.next.next;
		return head;
	}

	private static Node deleteMiddle(Node head) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		int resultant = count / 2;
		temp = head;
		while (temp != null) {
			resultant--;
			if (resultant == 0) {
				break;
			} else {
				temp = temp.next;
			}
		}
		Node delteNode = temp.next;
		temp.next = temp.next.next;
		delteNode = null;
		return head;
	}

	private static void printLL(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

}
