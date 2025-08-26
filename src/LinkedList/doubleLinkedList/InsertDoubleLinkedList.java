package LinkedList.doubleLinkedList;

public class InsertDoubleLinkedList {
	
	public static void main(String[] args) {
		int[] arr= {1,3,2,4};
		Node head = covertArrtodll(arr);
		//int val = 10;
		//Node headinsert = InsertNewNode(head,val);
		int tail = 100;
				int k = 2;
		//Node insertAttail = InsertNodeAttail(head,tail);
		//Node insertKtheelement = InsertAtKelement(head,tail,k);
	
	Node insertBeforGiveNode = InsertBeforGiveNode(head,tail,k);
			printDLL(insertBeforGiveNode);
		
	}
	
	private static Node InsertBeforGiveNode(Node head, int tail, int k) {
	
		if (head.data == k) {
			return null;
		}
		
		Node temp = head;
		while(temp.next!=null)
		{
			if(temp.data==k)
			{
				break;
			}
			temp = temp.next;
		}
	//	Node front = temp.next;
		Node back = temp.prev;
		
		Node newNode = new Node(tail,temp,back);
		back.next = newNode;
		temp.prev = newNode;
		
		return head;
	}

	private static Node InsertAtKelement(Node head, int tail, int k) {
		if(k==1)
		{
			InsertNewNode(head, tail);
		}
		Node temp = head;
		int count = 0;
		while(temp.next!=null)
		{
			count++;
			if(count==k)
			{
				break;
			}
			temp = temp.next;
		}
		
		Node back = temp.prev;
		Node newNode = new Node(tail,temp,back);
		back.next=newNode;
		temp.prev = newNode;
		return head;
		
	}

	private static Node InsertNodeAttail(Node head, int tail) {
		
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		Node last  = temp;
		Node prevLast = temp.prev;
		
		Node curr = new Node(tail,last,prevLast);
		prevLast.next=curr;
		last.prev = curr;
		return head;
	}

	private static Node InsertNewNode(Node head, int val) {
		
		Node newvalues = new Node(val,head ,null);
		head.prev = newvalues;
		return newvalues;
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
	private static void printDLL(Node head) {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}
}
