package LinkedList.singleLinkedList;

import java.util.HashSet;
import java.util.Stack;

public class fIntersctionNodeinLinkedList {
	
	public static void main(String[] args) {
		   // creation of both lists 
	    Node head = null;
	    head=insertNode(head,1);
	    head=insertNode(head,3);
	    head=insertNode(head,1);
	    head=insertNode(head,2);
	    head=insertNode(head,4);
	    Node head1 = head;
	    head = head.next.next.next;
	    Node headSec = null;
	    headSec=insertNode(headSec,3);
	    Node head2 = headSec;
	    headSec.next = head;
	    //printing of the lists
	    System.out.print("List1: "); printList(head1);
	    System.out.print("List2: "); printList(head2);
	    //checking if intersection is present
	    Node answerNode = intersectionPresent(head1,head2);
	    printList(answerNode);
	}
	
	private static Node intersectionPresent(Node head1, Node head2) {
	HashSet<Node> hash = new HashSet<>();
	
		Node temp1 = head1;
		Node temp2 = head2;
		while(temp1 !=null)
		{
			hash.add(temp1);
			temp1 = temp1.next;
		}
		while(temp2!=null)
		{
			if(hash.contains(temp2))
			{
				return temp2;
			}
			temp2 = temp2.next;
		}
		return null;
	}

//utility function to print linked list created
public	static void printList(Node head) {
	    while(head.next != null) {
	    System.out.print(head.data+"->");
	        head = head.next;
	    }
	    System.out.println(head.data);
	}

public static Node insertNode(Node head, int val)
{
	Node newNode = new Node(val);
	if(head==null)
	{
		head= newNode;
		return head;
	}
	Node temp = head;
	while(temp.next!=null)
	{
		temp = temp.next;
	}
	temp.next = newNode;
	return head;
}


}
