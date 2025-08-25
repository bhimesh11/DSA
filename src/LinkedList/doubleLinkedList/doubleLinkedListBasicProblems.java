package LinkedList.doubleLinkedList;


class Node
{
	int data;
	Node next;
	Node prev;
	public Node(int data, Node next, Node prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public Node(int data)
	{
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class doubleLinkedListBasicProblems {
	
	
	public static void main(String[] args) {
		int arr[] = {1,3,2,4};
		Node head = covertArrtodll(arr);
		//Node headRemoval = removehead(head);
		Node tailRemoval = removetail(head);
		printDLL(tailRemoval);
		
	}

	private static Node removetail(Node head) {
		
		if(head ==null || head.next ==null)
		{
			return head;
		}
		Node temp = head;
		while(temp.next.next !=null)
		{
			temp = temp.next;
		}
		Node curr = temp.next;
		temp.next=null;
		curr.prev=null;
		
		return head;
	}

	private static Node removehead(Node head) {
		
		if(head ==null || head.next ==null)
		{
			return head;
		}
		
		Node temp = head;
		head = head.next;
		head.prev = null;
		temp.next = null;
		
		return head;
	}

	private static void printDLL(Node head) {
		
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		
	}

	private static Node covertArrtodll(int[] arr) {
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
	
	

}
