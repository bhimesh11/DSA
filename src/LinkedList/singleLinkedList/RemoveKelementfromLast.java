package LinkedList.singleLinkedList;

public class RemoveKelementfromLast {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int N = 3;
		Node head = new Node(arr[0]);
		head.next = new Node(arr[1]);
		head.next.next = new Node(arr[2]);
		head.next.next.next = new Node(arr[3]);
		head.next.next.next.next = new Node(arr[4]);
//		head = DeleteNthNodefromEnd(head, N);
		head = deleteNodeFromEndOptimal(head, N);
 		printLL(head);
		
	}

	private static Node deleteNodeFromEndOptimal(Node head, int n) {
	
		Node fast = head;
		Node temp = head;
		for(int i =0;i<n;i++)
		{
			fast= fast.next;
		}
		Node slow = head;
		while(fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		Node delteNode = slow.next;
		slow.next = slow.next.next;
		delteNode= null;
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

	private static Node DeleteNthNodefromEnd(Node head, int n) {

		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		if (count == n) {
			Node newHead = head.next;
			head = null;
			return newHead;
		}
		int resultant = count - n;
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

}
