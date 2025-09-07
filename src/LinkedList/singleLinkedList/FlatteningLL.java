package LinkedList.singleLinkedList;

import java.util.ArrayList;
import java.util.Collections;

class NodeFlatten
{
	NodeFlatten next;
	int data;
	NodeFlatten child;
	public NodeFlatten(NodeFlatten next, int data, NodeFlatten child) {
		super();
		this.next = next;
		this.data = data;
		this.child = child;
	}
	
	NodeFlatten() {
	        data = 0;
	        next = null;
	        child = null;
	    }

	NodeFlatten(int x) {
	        data = x;
	        next = null;
	        child = null;
	    }
}
public class FlatteningLL {

	public static void main(String[] args) {
		NodeFlatten head = new NodeFlatten(5);
		head.child = new NodeFlatten(14);

	    head.next = new NodeFlatten(10);
	    head.next.child = new NodeFlatten(4);

	    head.next.next = new NodeFlatten(12);
	    head.next.next.child = new NodeFlatten(20);
	    head.next.next.child.child = new NodeFlatten(13);

	    head.next.next.next = new NodeFlatten(7);
	    head.next.next.next.child = new NodeFlatten(17);
	    System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);
        
     //   NodeFlatten flattened = flattenLinkedListBrute(head);
        NodeFlatten flattened = flattenLinkedListOptimal(head);
        System.out.println("\nFlattened linked list: ");
        printLinkedList(flattened);
	}
    private static NodeFlatten flattenLinkedListOptimal(NodeFlatten head) {
		if(head ==null || head.next == null)
		{
			return head;
		}
		NodeFlatten mergeHead = flattenLinkedListOptimal(head.next);
		head = merger(head,mergeHead);
		return head;
	}
	private static NodeFlatten merger(NodeFlatten head, NodeFlatten mergeHead) {
		if(head!=null)
		{
			head.next = null;
			
		}
		if(mergeHead !=null)
		{
			mergeHead.next = null;
		}
		
		NodeFlatten dummyNode = new NodeFlatten(-1);
		NodeFlatten res = dummyNode;
		
	while(head!=null && mergeHead!=null)
		{
			if(head.data < mergeHead.data)
			{
				res.child = head;
				res = head;
				head = head.child;
			}else {
				res.child = mergeHead;
				res = mergeHead;
				mergeHead = mergeHead.child;
			}
			res.next=null;
		}
		if(head!=null)
		{
			res.child = head;
		}else
		{
			res.child = mergeHead;
		}
		if(dummyNode.child!=null)
		{
			dummyNode.child.next = null;
		}
		return dummyNode.child;
	}
	private static NodeFlatten flattenLinkedListBrute(NodeFlatten head) {
		ArrayList<Integer> al = new ArrayList<>();
		while(head!=null)
		{
			NodeFlatten t2  = head;
			while(t2!=null)
			{
				al.add(t2.data);
				t2  = t2.child;
			}
			head = head.next;
		}
		System.out.println();
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		return convertArrayListoLinkedList(al);
	}
	private static NodeFlatten convertArrayListoLinkedList(ArrayList<Integer> al) {
		NodeFlatten dummyNode = new NodeFlatten(-1);
		NodeFlatten temp = dummyNode;
		
		for(int i=0;i<al.size();i++)
		{
			NodeFlatten newNode = new NodeFlatten(al.get(i));
			temp.child = newNode;
			temp = temp.child;
			
		}
		return dummyNode.child;
	}
	static void printOriginalLinkedList(NodeFlatten head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            // If child exists, recursively
            // print it with indentation
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }

            // Add vertical bars
            // for each level in the grid
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }
    static void printLinkedList(NodeFlatten head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }
}
