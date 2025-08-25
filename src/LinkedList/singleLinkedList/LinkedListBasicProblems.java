package LinkedList.singleLinkedList;

import java.util.Random;

import BasicMath.CountDigits;

class Node {
	int data;
	Node next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	
}

public class LinkedListBasicProblems {
	
	public static void main(String[] args) {
		
		int[] arr = {12,5,6,8};
		int number = printElementinNode(arr);
		System.out.println("Element is " + number);
	Node head =	convertToLinkedList(arr);
	System.out.println(head.data);
	
	traverseLinkedList(arr);
	System.out.println();
	Random ra = new Random();
	int randomNumber = ra.nextInt(13);
	System.out.println("Random number generated " + randomNumber);
	Boolean element = findElement(arr,randomNumber);
	System.out.println((element)?"Found":"Not found");
	int length = findLength(arr);
	System.out.println("Length is " + length);
	
	}

	private static int findLength(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i =1;i<arr.length;i++)
		{
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
			
		}
		int conter =0;
		Node dupHead = head;
		while(dupHead!=null)
		{
			conter++;
			dupHead = dupHead.next;
		}
		return conter;
	}

	private static Boolean findElement(int[] arr, int elementtocheck2) {
	Node head = new Node(arr[0]);
	Node mover = head;
	for(int i =1;i<arr.length;i++)
	{
		Node temp = new Node(arr[i]);
		mover.next = temp;
		mover = temp;
	}
	Node temp2 = head;
	while(temp2!=null)
	{
		if(temp2.data==elementtocheck2)
		{
			return true;
		}else {
			temp2 = temp2.next;
		}
	}
	return false;
	
	}

	private static void traverseLinkedList(int[] arr) {
	Node head = new Node (arr[0]);
	Node mover = head;
	for(int i =1;i<arr.length;i++)
	{
		Node temp = new Node(arr[i]);
		mover.next = temp;
		mover=temp;
	}
	Node temp2 = head;
	while(temp2!=null)
	{
		System.out.print(temp2.data + " ");
		temp2 = temp2.next;
	}
		
	}

	private static Node convertToLinkedList(int[] arr) {
		
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i =1;i<arr.length-1;i++)
		{
			Node temp = new Node(arr[i]);
			mover.next= temp;
			mover = temp;
		}
		return head;
	}

	private static int printElementinNode(int[] arr) {
		
		Random ra = new Random();
		int randomIndex = ra.nextInt(4);
		Node x = new Node(arr[randomIndex]);
		return x.data;
		
	}

}
