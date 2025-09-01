package LinkedList.singleLinkedList;



public class segregateEvenOdd {
	
	
	public static void main(String[] args) {
	int[] arr = {17,15,8,12,10,5,4};
	Node head = converttoLinkedList(arr);
	//printList(head);
	Node segragateHead = segregateOddEven(head);
	printList(segragateHead);

	}
	
	private static Node segregateOddEven(Node head) {
		
		
		if(head ==null || head.next ==null)
		{
			return null;
		}
		Node temp = head;
		Node evenStart =null;
		Node evenEnd = null;
		Node oddStart =  null;
		Node oddEnd = null;
		
		while(temp!= null)
		{
			int current = temp.data;
		if(current%2==0)
		{
			if(evenStart==null)
			{
				evenStart = temp;
				evenEnd = evenStart;
			}else {
				evenEnd.next = temp;
				evenEnd = evenEnd.next;
			}
		}else {
			if(oddStart ==null)
			{
				oddStart = temp;
				oddEnd = oddStart;
			}else {
				oddEnd.next = temp;
				oddEnd  = oddEnd.next;
			}
			
		}
		temp = temp.next;
		}
		if(evenStart ==null || evenStart ==null)
		{
			return null;
		}
//		oddEnd.next = evenStart;
//		evenEnd.next = null;
		evenEnd.next = oddStart;
		oddEnd.next =null;
		
		head = evenStart;
		
		
		return head;
	}

	private static Node converttoLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i =0;i<arr.length;i++)
		{
			Node newNode = new Node(arr[i]);
			mover.next = newNode;
			mover = newNode;
		}
		return head;
		
	}
	public static void printList(Node head)
	{
	    Node temp = head;
	    while(temp!=null)
	    {
	        System.out.print(temp.data + " ");
	        temp= temp.next;
	    }
	      System.out.println();
	}

	

}
