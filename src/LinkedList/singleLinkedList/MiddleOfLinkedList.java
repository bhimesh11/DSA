package LinkedList.singleLinkedList;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Node head = convertToLinkedList(arr);
		printLL(head);
		//Node middleNode = findMiddle(head);
		Node middleNode = findMiddleOptimal(head);
		System.out.println();
	//	System.out.println(middleNode.data);
		System.out.println(middleNode.data);
	}

	private static Node findMiddleOptimal(Node head) {

		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private static Node findMiddle(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node temp = head;
		int count = 0;

		while (temp != null) {
			count++;
			temp = temp.next;
		}
		int mid = count / 2 + 1;
		temp = head;

		while (temp != null) {
			mid = mid - 1;
			if (mid == 0) {
				break;
			}
			temp = temp.next;
		}
		return temp;
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
