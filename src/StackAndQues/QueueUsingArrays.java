package StackAndQues;

class queue {

	private int arr[];
	private int start, end, currentSize, maxSize;

	public queue(int[] arr, int start, int end, int currentSize) {
		super();
		this.arr = new int[16];
		this.start = -1;
		this.end = -1;
		this.currentSize = 0;
	}

	public queue(int maxSize) {

		this.maxSize = maxSize;
		arr = new int[16];
		start = -1;
		end = -1;
		currentSize = 0;
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void push(int x) {
		if (currentSize == maxSize) {
			System.out.println("Queue is full/exiting...");
			System.exit(1);
		}
		if (end == -1) {
			start = 0;
			end = 0;
			arr[end] = x;
			System.out.println("The element pushed is " + x);
		} else {

			end = (end + 1) % maxSize;
			arr[end] = x;
			System.out.println("The element pushed is " + x);

		}
		currentSize++;
	}

	public int pop() {
		if (start == -1) {
			System.out.println("Queue is empty\n exiting...");
			System.exit(1);

		}
		int poped = arr[start];
		if (currentSize == 1) {
			start = -1;
			end = -1;
		} else {
			start = (start + 1) % currentSize;
		}
		currentSize--;
		return poped;
	}

	public int top() {

		if (start == -1) {
			System.out.println("Queue is empty\n exiting...");
			System.exit(1);

		}
		return arr[start];
	}

	public int size() {
		return currentSize;
	}
}

public class QueueUsingArrays {
	public static void main(String[] args) {
		queue q = new queue(6);

		q.push(4);
		q.push(14);
		q.push(24);
		q.push(34);
		q.print();
		System.out.println("The peek of the queue before deleting any element " + q.top());
		System.out.println("The size of the queue before deletion " + q.size());
		System.out.println("The first element to be deleted " + q.pop());
		System.out.println("The peek of the queue after deleting an element " + q.top());
		System.out.println("The size of the queue after deleting an element " + q.size());
	}

}
