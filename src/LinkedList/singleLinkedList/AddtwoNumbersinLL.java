package LinkedList.singleLinkedList;

public class AddtwoNumbersinLL {

	public static void main(String[] args) {
	  
	    Node l1 = new Node(2);
	    l1.next = new Node(4);
	    l1.next.next = new Node(3);

	    Node l2 = new Node(5);
	    l2.next = new Node(6);
	    l2.next.next = new Node(4);
	    
	    printList(l1);
	    printList(l2);
	    
	    Node sum = addTwoNumbers(l1,l2);
	    
	printList(sum);
	    }

	private static Node addTwoNumbers(Node l1, Node l2) {
	
	    Node dummyNode = new Node(-1);
	    Node currentNode = dummyNode;
	    int carry =0;
	    int sum =0;
	    while(l1!=null || l2!=null ||carry!=0)
	    {
	    	int a = (l1!=null)?l1.data:0;
	    	int b = (l2!=null)?l2.data:0;
	    	 sum = a+b+carry;
	    
	    
	    Node newNode = new Node(sum%10);
	  
	    currentNode.next = newNode;
	    currentNode = currentNode.next;
	    carry = sum/10;
		if(l1!=null) l1=l1.next;
    	if(l2!=null) l2 = l2.next;
	    }
	    
	    if(carry==1)
	    {
	    	Node newNode = new Node(carry);
	    	currentNode.next = newNode;
	    }
	   return dummyNode.next;
	}
	    
	  // Helper: pretty-print a linked list
    private static void printList(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.data);
            if (t.next != null) System.out.print(" -> ");
            t = t.next;
        }
        System.out.println();
    }
}
