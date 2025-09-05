package LinkedList.doubleLinkedList;

public class removeFromDoubleLinkedList {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,5};
		Node head = converttoDLL(arr);
		printDLL(head);
		Node clenHead = removefromDLL(head);
				printDLL(clenHead);
	}
	
			private static Node removefromDLL(Node head) {
		Node temp = head;
		Node nextNode = null;
		while(temp!=null && temp.next!=null)
		{
			nextNode = temp.next;
			while(nextNode!=null && nextNode.data == temp.data)
			{
				nextNode = nextNode.next;
			}
			temp.next = nextNode;
			if(nextNode!=null)
			{
				nextNode.prev = temp;
			}
			temp = temp.next;
		}
		return head;
	}

			private static Node converttoDLL(int[] arr) {
		Node head = new Node(arr[0],null,null);
		Node back = head;
		for(int i =1;i<arr.length;i++)
		{
			Node current = new Node(arr[i],null,back);
			back.next = current;
			back = current;
		}
		return head;
		
	}
	private static void printDLL(Node head) {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

	
}
