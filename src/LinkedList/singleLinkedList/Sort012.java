package LinkedList.singleLinkedList;

public class Sort012 {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 0, 1 };
		Node head = covertArrtoLL(arr);
		printLinkedList(head);
//		Node BruteSort = SortInBrute(head);
		Node OptimalSort = SortInOptimal(head);
		printLinkedList(OptimalSort);

	}

	private static Node SortInOptimal(Node head) {
		if(head ==null || head.next ==null)
		{
			return head;
		}
		Node oneHead = new Node(-1);
		Node twoHead = new Node(-1);
		Node zeroHead = new Node(-1);
		
		Node zero= zeroHead;
		Node one = oneHead;
		Node two = twoHead;
		
		Node tail= head;
		while(tail!=null)
		{
			if(tail.data==0)
			{
				zero.next = tail;
				zero = zero.next;
			}
			else if(tail.data==1)
			{
				one.next = tail;
				one = one.next;
			}else {
				two.next = tail;
				two = two.next;
			}
			tail = tail.next;
		}
		zero.next = (oneHead.next!=null)?oneHead.next:twoHead.next;
		one.next = twoHead.next;
		two.next =null;
		
		Node newHead = zeroHead.next;
		return newHead;
	}

	private static Node SortInBrute(Node head) {
		Node temp = head;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		while (temp != null) {
			if (temp.data == 0) {
				count0++;
			} else if (temp.data == 1) {
				count1++;
			} else {
				count2++;
			}
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			if (count0 != 0) {
				temp.data = 0;
				count0--;
			} else if (count1 != 0) {
				temp.data = 1;
				count1--;
			} else {
				temp.data = 2;
				count2--;
			}
			temp = temp.next;
		}
		return head;
	}

	private static Node covertArrtoLL(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node newHead = new Node(arr[i]);
			mover.next = newHead;
			mover = newHead;
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
