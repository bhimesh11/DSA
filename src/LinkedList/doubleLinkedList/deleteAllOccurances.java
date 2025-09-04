package LinkedList.doubleLinkedList;

public class deleteAllOccurances {


	        
	
	public static void main(String[] args) {
		
		 int[] vals = {1, 2, 3, 1, 4, 1, 1, 5};
	        Node head = coverttoDll(vals);
	        int key = 1;
	        Node newHead = seeOcurance(head,key);
	        printDLL(newHead);
	}

	private static Node seeOcurance(Node head, int key) {
	Node temp = head;
	while(temp!=null)
	{
		if(temp.data==key)
		{
			if(temp==head)
			{
				head = head.next;
			}
			Node nextNode = temp.next;
			Node prevNode = temp.prev;
			if(nextNode!=null)
			{
				nextNode.prev = prevNode;
				
			}
			if(prevNode!=null)
			{
				prevNode.next = nextNode;
			}
			temp = nextNode;
		}else {
			temp = temp.next;
		}
	}
	return head;
	}

	private static Node coverttoDll(int[] vals) {
			Node head = new Node(vals[0], null, null);
			Node back = head;
			for (int i = 1; i < vals.length; i++) {
				Node current = new Node(vals[i], null, back);
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

	}
}
