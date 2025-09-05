package LinkedList.doubleLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPairsInDoubleLinked {

	public static void main(String[] args) {
		int sum =5;
		int[] arr= {1,2,3,4,9};
		Node head = converttoDLL(arr);
		printDLL(head);
		//List<List<Integer>> ints = findPairs(head,sum);
		List<List<Integer>> opts = findPairsO(head,sum);
		for(List<Integer> ls : opts)
		{
			System.out.print(ls);
		}
		System.out.println();		
	}

	private static List<List<Integer>> findPairsO(Node head, int sum) {
	
		Node low = head;
		Node high = findTail(head);
		printDLL(high);
		List<List<Integer>> ds = new ArrayList<>();
		while(low.data < high.data)
		{
			if(low.data + high.data==sum)
			{
				ds.add(Arrays.asList(low.data,high.data));
				low = low.next;
				high = high.prev;
			}else if(low.data + high.data<sum)
			{
				low = low.next;
				
			}else {
				high = high.prev;
			}
		}
		return ds;
		
	}

	private static Node findTail(Node head) {
		Node temp = head;
		while(temp.next.next!=null)
		{
			temp = temp.next;
		}
		return temp.next;
	}

	private static List<List<Integer>> findPairs(Node head, int sum) {
		Node temp = head;
		Node temp2 = null;
		List<List<Integer>> ds = new ArrayList<>();
		while(temp!=null)
		{
			temp2 = temp.next ;
			while(temp2!=null)
			{
				if(temp.data + temp2.data==sum)
				{
					ds.add(Arrays.asList(temp.data , temp2.data));
				}
					temp2 = temp2.next;
			}
			temp = temp.next;
		}
		return ds;
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
